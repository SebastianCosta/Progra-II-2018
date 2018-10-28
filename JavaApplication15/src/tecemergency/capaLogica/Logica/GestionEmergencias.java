
package tecemergency.capaLogica.Logica;

import static javafx.scene.input.KeyCode.X;
import tecemergency.capaLogica.estructuras.BinaryHeap;
import tecemergency.capaLogica.estructuras.Lista;


public class GestionEmergencias {
    private BinaryHeap estructura1;
    private Lista<ModuloEmergencias> estructura2;
    private Object estructura;

    public Object getEstructura() {
        return estructura;
    }

    public void setEstructura(Object estructura) {
        this.estructura = estructura;
    }
    
    

    public BinaryHeap getEstructura1() {
        return estructura1;
    }

    public void setEstructura1(BinaryHeap estructura1) {
        this.estructura1 = estructura1;
    }

    public Lista<ModuloEmergencias> getEstructura2() {
        return estructura2;
    }

    public void setEstructura2(Lista<ModuloEmergencias> estructura2) {
        this.estructura2 = estructura2;
    }

    public GestionEmergencias(String estructura,int cantidad) {
        if(estructura.equals("Heap")){
        this.estructura1 = new BinaryHeap<>();
        System.out.println("Sirve Heap");
        }else{
            this.estructura2 = new Lista<ModuloEmergencias>();
            this.crearCantidadEstructura2(cantidad);
            System.out.println("Sirve Cola");
        }
    }
    
    public void crearCantidadEstructura2(int cantidad){
        for (int i = 0;i<cantidad;i++){
            ModuloEmergencias nuevoModulo = new ModuloEmergencias("Emergencias",i+1,"Emergencias",estructura2);
            estructura2.agregar_final(nuevoModulo);   
            System.out.println("sirve");
        }
    }
    public void crearCantidadHeap(int cantidad){
         for (int i = 0;i<cantidad;i++){
            ModuloEmergencias nuevoModulo = new ModuloEmergencias("Emergencias",i+1,"Emergencias",estructura1);
            estructura1.create((Comparable) nuevoModulo);
            System.out.println("sirve");
        }
    }    
}
