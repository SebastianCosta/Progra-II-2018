
package tecemergency.capaLogica.Logica;

import static javafx.scene.input.KeyCode.X;
import tecemergency.capaLogica.estructuras.BinaryHeap;
import tecemergency.capaLogica.estructuras.Lista;


public class GestionUrgencias {
    private BinaryHeap  estructura1;
    private Lista<ModuloUrgencias> estructura2;

    public BinaryHeap getEstructura1() {
        return estructura1;
    }

    public void setEstructura1(BinaryHeap estructura1) {
        this.estructura1 = estructura1;
    }

    public Lista<ModuloUrgencias> getEstructura2() {
        return estructura2;
    }

    public void setEstructura2(Lista<ModuloUrgencias> estructura2) {
        this.estructura2 = estructura2;
    }

    public GestionUrgencias(String estructura,int cantidad) {
        if(estructura.equals("Heap")){
        this.estructura1 = new BinaryHeap();
        System.out.println("Sirve Heap");
        }else{
            this.estructura2 = new Lista<ModuloUrgencias>();
            this.crearCantidadEstructura2(cantidad);
            System.out.println("Sirve Cola");
        }
    }
    
    public void crearCantidadEstructura2(int cantidad){
        for (int i = 0;i<=cantidad;i++){
            ModuloUrgencias nuevoModulo = new ModuloUrgencias("Urgencias",+i,"Urgencias",estructura2);
            estructura2.agregar_final(nuevoModulo);   
            System.out.println("sirve");
        }
    }
    public void crearVentanilla(Patient paciente){
        
    }
    
    
}
