
package tecemergency.capaLogica.Logica;

import tecemergency.capaLogica.estructuras.BinaryHeap;

public class GestionEgresos {
    private BinaryHeap<Patient> listaEgresos;

    public BinaryHeap<Patient> getListaEgresos() {
        return listaEgresos;
    }

    public void setListaEgresos(BinaryHeap<Patient> listaEgresos) {
        this.listaEgresos = listaEgresos;
    }

    public GestionEgresos(BinaryHeap<Patient> listaEgresos) {
        this.listaEgresos = new BinaryHeap<Patient>();
    }

    @Override
    public String toString() {
        return "GestionEgresos{" + "listaEgresos=" + listaEgresos + '}';
    }
    
    
    
    
}
