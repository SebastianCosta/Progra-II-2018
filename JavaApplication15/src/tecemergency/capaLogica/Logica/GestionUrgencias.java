
package tecemergency.capaLogica.Logica;

import static javafx.scene.input.KeyCode.X;
import tecemergency.capaLogica.estructuras.BinaryHeap;
import tecemergency.capaLogica.estructuras.ColaPrioridad;
import tecemergency.capaLogica.estructuras.Lista;
import tecemergency.capaLogica.estructuras.NodoS;


public class GestionUrgencias {
    private Lista<ModuloUrgencias> listaVentanillas;
    private BinaryHeap<Patient> estructura1;
    private ColaPrioridad<Patient> estructura2;
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    

    public Lista<ModuloUrgencias> getListaVentanillas() {
        return listaVentanillas;
    }

    public void setListaVentanillas(Lista<ModuloUrgencias> listaVentanillas) {
        this.listaVentanillas = listaVentanillas;
    }

    public BinaryHeap<Patient> getEstructura1() {
        return estructura1;
    }

    public void setEstructura1(BinaryHeap<Patient> estructura1) {
        this.estructura1 = estructura1;
    }

    public ColaPrioridad<Patient> getEstructura2() {
        return estructura2;
    }

    public void setEstructura2(ColaPrioridad<Patient> estructura2) {
        this.estructura2 = estructura2;
    }

    public GestionUrgencias() {
    }

    

    public GestionUrgencias(String estructura,int cantidad) {
        if(estructura.equals("Heap")){
            this.estructura1 = new BinaryHeap<Patient>();
            this.listaVentanillas = new Lista<ModuloUrgencias>();
            this.crearCantidadEstructura2(cantidad);
            this.tipo = estructura;
            System.out.println("Sirve Heap");
        }else{
            this.estructura2 = new ColaPrioridad<Patient>();
            this.listaVentanillas = new Lista<ModuloUrgencias>();
            this.crearCantidadEstructura2(cantidad);
            this.tipo = estructura;
            System.out.println("Sirve Cola");
        }
    }
    
    public void crearCantidadEstructura2(int cantidad){
        for (int i = 0;i<cantidad;i++){
            ModuloUrgencias nuevoModulo = new ModuloUrgencias("Urgencias",i+1,"Urgencias",estructura2);
            listaVentanillas.agregar_final(nuevoModulo);   
            System.out.println("sirve");
        }
    }
    
    public String attendLiberate(String idRoom){
       Modulo room = returnRoom(idRoom);
       GestionEgresos egreso = new GestionEgresos();
       egreso.entrar(room.getPatciente());
       room.setPatciente(getEstructura1().extract());
       System.out.println("Atendiendo a: "+getEstructura1().extract().getNombre());
       String paciente = getEstructura1().extract().getNombre();
       return paciente;
        
    }
        public String attendHeap(String room){
        Patient patient = getEstructura1().extract();
        String attend = "Atendiendo a "+getEstructura1().extract().getNombre()+" Consultorio: "+room;
        attend(room,patient );
        return attend;
    }
    public void insertHeap(Patient patient){
        getEstructura1().create(patient);
    }
    public void attend(String idRoom, Patient patient){
        Modulo room = returnRoom(idRoom);
        if (room.isEstatus()) {
            System.out.println("Esta atendiendo a alguien");
        }else{
            room.setPatciente(patient);
            System.out.println("Atendiendo a: "+patient.getNombre()+" Consultorio: "+room.getNumModulo());
        }
        
    }
    
public  ModuloEmergencias returnRoom(String id){
                
        ModuloEmergencias room = null;
        NodoS<ModuloEmergencias> temp = this.listaVentanillas.getCabeza();
         for (int i = 0; i < this.listaVentanillas.getTamano(); i++) {            
            if (temp.getContiene().getNombreModulo().equals(id) ){
                room= temp.getContiene();
                System.out.println(room.getNombreModulo());
            }temp = temp.getSiguiente();    
        }return room;
     }
    public void showRooms(){
        getListaVentanillas().setApuntando(getListaVentanillas().getCabeza().getSiguiente());
        ModuloEmergencias room = null;
        NodoS<ModuloEmergencias> temp = this.listaVentanillas.getCabeza();
         for (int i = 0; i < this.listaVentanillas.getTamano(); i++) {            
            
            room= (ModuloEmergencias) this.listaVentanillas.getApuntando().getContiene();
            System.out.println(room.getNumModulo());
            temp = temp.getSiguiente();    
        }

    }
    
    
}
