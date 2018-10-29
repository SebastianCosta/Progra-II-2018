/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecemergency.capaLogica.estructuras;

import tecemergency.capaLogica.Logica.Patient;

public class ColaPrioridad {
    private int tamMax;
    private Lista[] cola;

    public int getTamMax() {
        return tamMax;
    }

    public void setTamMax(int tamMax) {
        this.tamMax = tamMax;
    }

    public Lista[] getCola() {
        return cola;
    }

    public void setCola(Lista[] cola) {
        this.cola = cola;
    }

    
    public void insertar(Patient nuevo_usuario,int prioridad){
        int p= prioridad;
        cola[p].agregar_final(nuevo_usuario);
        }
    /**
     * Remueve el elemento primero de la prioridad mayor 
     * @return un objeto de tipo Task 
     */
    public Patient eliminar(){
        int prioridad= 2;
        Patient output=null;
        for (int i=0;i<tamMax-1; i++){     
            if(cola[prioridad].getTamano()!=0){
                return (Patient) cola[prioridad].elim_inicio();
            }
            prioridad--;
        }
        return output;
    }
    
    public String toString(){
        for (int i=0; i<tamMax; i++){
            return (cola[i].toString()) ; 
        }
        return ("Cola de Prioridad:");
        
    }

    public ColaPrioridad() {
        tamMax = 3;
        cola = new Lista[tamMax];
        
        cola[0]= new Lista();
        cola[1]= new Lista();
        cola[2]= new Lista();
       
    }
    
    
}
