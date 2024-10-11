
package autonomaautomovil.exceptions;

/**
 *
 * @author Andres Rodriguez
 */
public class VehiculoDetenidoException extends RuntimeException {
    
    public VehiculoDetenidoException (){
        super("El Vehiculo esta detenido no se puede frenar");
    }
    
}
