
package tecemergency.capaLogica.Logica;
public class ModuloUrgencias extends Modulo{
    private int numModuloUrgencias;

    public ModuloUrgencias(int numModuloUrgencias, String nombreModulo, int numModulo, boolean estatus, String tipoModulo, Object estrucutra, int cantidadAtendidos) {
        super(nombreModulo, numModulo, estatus, tipoModulo, estrucutra, cantidadAtendidos);
        this.numModuloUrgencias = numModuloUrgencias;
    }   
}
