
package autonomaautomovil.exceptions;

/**
 *
 * @author Andres Rodriguez
 */
public class VehiculoPatinaPorIntensidadException  extends RuntimeException{
    public VehiculoPatinaPorIntensidadException(){
        super("El vehiculo a patinado debido a un frenado con una intensidad mayor a la de su velocidad actual");
    }
}
