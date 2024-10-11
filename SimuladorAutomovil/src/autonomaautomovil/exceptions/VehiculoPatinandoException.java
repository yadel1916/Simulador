
package autonomaautomovil.exceptions;

/**
 *
 * @author Andres Rodriguez
 */
public class VehiculoPatinandoException extends RuntimeException {
    
    public VehiculoPatinandoException(){
        super("El Vehiculo ha patinado y a perdido el control.Solo se recupera si se detiene completamente");
    }
    
}
