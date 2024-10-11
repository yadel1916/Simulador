
package autonomaautomovil.exceptions;

/**
 *
 * @author Andres Rodriguez
 */
public class VehiculoEncendidoException extends RuntimeException {
    
    public VehiculoEncendidoException () {
        super("El Vehiculo ya esta encendido");
    }
}
