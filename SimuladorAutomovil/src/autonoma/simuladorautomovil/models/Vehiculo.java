
package autonoma.simuladorautomovil.models;

import autonomaautomovil.exceptions.LimiteMotorException;
import autonomaautomovil.exceptions.VehiculoApagadoException;
import autonomaautomovil.exceptions.VehiculoDetenidoException;
import autonomaautomovil.exceptions.VehiculoEncendidoException;

/**
 *
 * @author Andres Rodriguez
 */
public class Vehiculo {
   //Atributos//
    private boolean encendido;
    private double velocidad;
    private boolean accidentado;
    private boolean patinando;
    private Llanta llantas;
    private Motor motor;
    
    //Constructor//

    public Vehiculo(Motor motor, Llanta llantas) {
        this.llantas = llantas;
        this.encendido = false;
        this.accidentado = accidentado;
        this.patinando = false;
        this.motor = motor;
        this.velocidad = 0;
    }
    
    public boolean isEncendido() {
        return encendido;
    }

    //Metodos de acceso//
    public void setEncendido(boolean encendido) {    
        this.encendido = encendido;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isAccidentado() {
        return accidentado;
    }

    public boolean isPatinando() {
        return patinando;
    }
    
    
    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Llanta getLlantas() {
        return llantas;
    }
    
    
    
    //Metodos//
    
    public void encender()throws VehiculoEncendidoException{
        //Lanza la excepción si el vehiculoya esta encendido
        if (encendido){
            throw new VehiculoEncendidoException();
        }
        encendido = true;
        System.out.println("El Vehiculo ah sido encendido");
        
        if (!accidentado && !patinando){
            this.encendido = true;
        }
    }
    
    public void apagar(){
        this.motor.apagar();
    }
    
    public void acelerar(double velocidad) throws LimiteMotorException{
//        double Velocidad = this.velocidad + velocidad;
//        
//        this.motor.validarVelocidadMaxima(velocidad);
//        this.setVelocidad(velocidad);
        //Verifica si no esta patinando
        if (!patinando && !accidentado){
            this.velocidad += velocidad;
        }
    }
    
    public void frenar(){
        if (!patinando && accidentado){
            if(this.velocidad < 0){
                this.velocidad = 0;
            }
        }
        
        
        if (patinando && this.velocidad == 0){
            this.patinando = false;
        }
        
    }
    
    public void patinar(){
        this.patinando = true;
    }
    
    
    
    public void accidentarVehiculo(){
        this.setVelocidad(0);
        this.apagar();
    }
    
    
   
    
}
