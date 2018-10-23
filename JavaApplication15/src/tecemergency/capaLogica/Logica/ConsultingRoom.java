/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecemergency.capaLogica.Logica;

/**
 *
 * @author Mata
 */
public class ConsultingRoom {
    private Patient patient;
    private String id;
    private boolean state;

    public ConsultingRoom(String id, boolean estado) {
        this.id = id;
        this.state = estado;
    }

    public ConsultingRoom(Patient paciente, String id, boolean estado) {
        this.patient = paciente;
        this.id = id;
        this.state = estado;
    }

    public Patient getPaciente() {
        return patient;
    }

    public void setPaciente(Patient paciente) {
        this.patient = paciente;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isEstado() {
        return state;
    }

    public void setEstado(boolean estado) {
        this.state = estado;
    }
    
    
    
}
