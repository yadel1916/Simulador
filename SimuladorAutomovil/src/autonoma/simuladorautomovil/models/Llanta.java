
package autonoma.simuladorautomovil.models;

/**
 *
 * @author Andres Rodriguez
 */
public class Llanta {
    private String tipo;
    private double limitePermitido;

    public Llanta(String tipo, double limitePermitido) {
        this.tipo = tipo;
        this.limitePermitido = limitePermitido;
    }

    public double getLimitePermitido() {
        return limitePermitido;
    }
    
    
}
