
package autonomaautomovil.exceptions;

/**
 *
 * @author Andres Rodriguez
 */
public class VehiculoAccidentadoException  extends RuntimeException{
    public VehiculoAccidentadoException(){
        super("El Vehiculo ha sufrido un accidente debido a que apago mientras su velocidad superaba los 60 km/h");
    }
}
