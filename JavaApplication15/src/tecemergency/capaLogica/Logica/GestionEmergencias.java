
package tecemergency.capaLogica.Logica;

import static javafx.scene.input.KeyCode.X;
import tecemergency.capaLogica.estructuras.BinaryHeap;
import tecemergency.capaLogica.estructuras.ColaPrioridad;
import tecemergency.capaLogica.estructuras.Lista;


public class GestionEmergencias {
    private BinaryHeap<Patient> estructura1;
    private ColaPrioridad<Patient> estructura2;
    private Lista<ModuloEmergencias> listaVentanillas;

    public Lista<ModuloEmergencias> getListaVentanillas() {
        return listaVentanillas;
    }

    public void setListaVentanillas(Lista<ModuloEmergencias> listaVentanillas) {
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

    

    public GestionEmergencias(String estructura,int cantidad) {
        if(estructura.equals("Heap")){
        this.estructura1 = new BinaryHeap<Patient>();
        this.listaVentanillas = new Lista<ModuloEmergencias>();
        this.crearCantidadEstructura2(cantidad);
        System.out.println("Sirve Heap");
        }else{
            this.estructura2 = new ColaPrioridad<Patient>();
            this.listaVentanillas = new Lista<ModuloEmergencias>();
            this.crearCantidadEstructura2(cantidad);
            System.out.println("Sirve Cola");
        }
    }
    
    public void crearCantidadEstructura2(int cantidad){
        for (int i = 0;i<cantidad;i++){
            ModuloEmergencias nuevoModulo = new ModuloEmergencias("Emergencias",i+1,"Emergencias",estructura2);
            listaVentanillas.agregar_final(nuevoModulo);   
            System.out.println("sirve");
        }
    }
       
}
