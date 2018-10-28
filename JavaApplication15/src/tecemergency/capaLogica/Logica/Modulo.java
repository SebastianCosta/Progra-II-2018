
package tecemergency.capaLogica.Logica;


public class Modulo {
    private String nombreModulo;
    private int numModulo;
    private boolean estatus;
    private String tipoModulo;
    private Object estrucutra;
    private int cantidadAtendidos;

    public String getNombreModulo() {
        return nombreModulo;
    }

    public void setNombreModulo(String nombreModulo) {
        this.nombreModulo = nombreModulo;
    }

    
    public int getNumModulo() {
        return numModulo;
    }

    public void setNumModulo(int numModulo) {
        this.numModulo = numModulo;
    }

    public boolean isEstatus() {
        return estatus;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }

    public String getTipoModulo() {
        return tipoModulo;
    }

    public void setTipoModulo(String tipoModulo) {
        this.tipoModulo = tipoModulo;
    }

    public Object getEstrucutra() {
        return estrucutra;
    }

    public void setEstrucutra(Object estrucutra) {
        this.estrucutra = estrucutra;
    }

    public int getCantidadAtendidos() {
        return cantidadAtendidos;
    }

    public void setCantidadAtendidos(int cantidadAtendidos) {
        this.cantidadAtendidos = cantidadAtendidos;
        
    }
    public int agregarAtendidos(){
        this.cantidadAtendidos++;
        return this.cantidadAtendidos;
    }
     public boolean estaOcupada(){
        return estatus;
    }
    public boolean atender(){
        this.estatus=true;
        return true;        
    }
 
    public boolean liberar(){
        estatus= false;
        return true;
    }
   
    public boolean liberarAtender(){
        return true;
    }

    public Modulo(String nombreModulo, int numModulo, String tipoModulo, Object estrucutra) {
        super();
        this.nombreModulo = nombreModulo;
        this.numModulo = numModulo;
        this.estatus = false;
        this.tipoModulo = tipoModulo;
        this.estrucutra = estrucutra;
        
    }

    @Override
    public String toString() {
        return "Modulo{" + "nombreModulo=" + nombreModulo + ", numModulo=" + numModulo + ", estatus=" + estatus + ", tipoModulo=" + tipoModulo + ", estrucutra=" + estrucutra + ", cantidadAtendidos=" + cantidadAtendidos + '}';
    }

    
   
    

  
    
    
}
