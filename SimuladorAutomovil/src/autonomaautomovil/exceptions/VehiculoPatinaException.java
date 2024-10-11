
package autonomaautomovil.exceptions;

/**
 *
 * @author Andres Rodriguez
 */
public class VehiculoPatinaException extends RuntimeException {
    public VehiculoPatinaException(){
        super("El vehiculo a patinado debido a un frenado brusco no permitido por las llantas");
        
    }
}
