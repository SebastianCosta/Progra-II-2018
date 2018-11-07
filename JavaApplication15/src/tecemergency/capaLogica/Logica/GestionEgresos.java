/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecemergency.capaLogica.Logica;


import tecemergency.capaLogica.estructuras.BinaryHeap;
import java.util.Random;

/**
 *
 * @author Mata
 */
public class GestionEgresos {
    public BinaryHeap<Patient> heapEgreso = new BinaryHeap<>();
    private int min;
    private int max;
    
    public GestionEgresos(int min, int max) {
        this.min = min;
        this.max = max;
    }
    
    public BinaryHeap<Patient> getHeapEgreso() {
        return heapEgreso;
    }

    public void setHeapEgreso(BinaryHeap<Patient> heapEgreso) {
        this.heapEgreso = heapEgreso;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
    

    public GestionEgresos() {
    }

    public BinaryHeap<Patient> getHeapVector() {
        return heapEgreso;
    }

    public void setHeapVector(BinaryHeap<Patient> heapVector) {
        this.heapEgreso = heapVector;
    }
    
    public void entrar(Patient patient){
        Random r = new Random();
        int tiempo = r.nextInt(getMax()-getMin()) + getMin();
        patient.setTiempo(tiempo);
        heapEgreso.create(patient);
    }
    public void salir(){
        heapEgreso.extract();
    }
           
            
    
    
}
