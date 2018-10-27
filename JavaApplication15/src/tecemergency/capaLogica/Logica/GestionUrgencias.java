
package tecemergency.capaLogica.Logica;

import tecemergency.capaLogica.estructuras.BinaryHeap;
import tecemergency.capaLogica.estructuras.Lista;


public class GestionUrgencias {
    private BinaryHeap estructura1;
    private Lista estructura2;

    public BinaryHeap getEstructura1() {
        return estructura1;
    }

    public void setEstructura1(BinaryHeap estructura1) {
        this.estructura1 = estructura1;
    }

    public GestionUrgencias(String estructura) {
        if(estructura.equals("Heap")){
        this.estructura1 = new BinaryHeap();
        System.out.println("Sirve Heap");
        }else{
            this.estructura2 = new Lista<Patient>();
            System.out.println("Sirve Cola");
        }
    }
    
    public void crearCantidad(int cantidad){
        for (int i = 0;i<=cantidad;i++){
            
            
        }
    }
    public void crearVentanilla(Patient paciente){
        
    }
    
    
}
