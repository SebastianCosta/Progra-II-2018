/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecemergency.capaLogica.Logica;

import tecemergency.capaLogica.estructuras.Lista;
import tecemergency.capaLogica.estructuras.ListaD;


public class GestionPacientes {
    private ListaD<Patient> listaEspera;

    public ListaD<Patient> getListaEspera() {
        return listaEspera;
    }

    public void setListaEspera(ListaD<Patient> listaEspera) {
        this.listaEspera = listaEspera;
    }

    public GestionPacientes() {
        this.listaEspera = new ListaD<Patient>();
    }
  

    @Override
    public String toString() {
        return "GestionClientes{" + "listaEspera=" + listaEspera + '}';
    }
    
    public void agregarListaEspera(Patient paciente){
        this.listaEspera.insertar_final(paciente);
    }
    public void eliminarListaEspera(int posicion){
        this.listaEspera.eliminar(posicion);
    }
}
