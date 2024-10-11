
package autonoma.simuladorautomovil.models;

import autonomaautomovil.exceptions.LimiteMotorException;

/**
 *
 * @author Andres Rodriguez
 */
public class Motor {
    
     //Atrinutos//
    private boolean encendido;
    private boolean frenar;
    private double velicidadMaxima;
    private int cilindraje;
    
    
    //Constructor//

    public Motor(double velicidadMaxima, int cilindraje) {
        this.encendido = false;
        this.frenar = false;
        this.velicidadMaxima = velicidadMaxima;
        this.cilindraje = cilindraje;
    }
    
    //Metodos de acceso//

    public boolean isEncendido() {
        return encendido;
    }

    public boolean isFrenar() {
        return frenar;
    }

    public void setFrenar(boolean frenar) {
        this.frenar = frenar;
    }

   
    
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public double getVelicidadMaxima() {
        return velicidadMaxima;
    }

    public void setVelicidadMaxima(double velicidadMaxima) {
        this.velicidadMaxima = velicidadMaxima;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
    
    
    //Metodos//
    public void encender(){
        this.encendido = true;
    }
    
    public void apagar(){
        this.encendido = false;
    
    }
    
    public void frenar(){
        this.frenar = false;
    }
    
    ///Validar velocidadMxima///
    public void validarVelocidadMaxima(double velocidad) throws LimiteMotorException{
        if (velocidad > this.velicidadMaxima){
            throw new LimiteMotorException();
        }
    }
    
    
    
}
