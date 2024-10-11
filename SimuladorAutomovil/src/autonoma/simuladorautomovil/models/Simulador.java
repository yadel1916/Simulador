
package autonoma.simuladorautomovil.models;

import autonomaautomovil.exceptions.LimiteMotorException;
import autonomaautomovil.exceptions.VehiculoAccidentadoException;
import autonomaautomovil.exceptions.VehiculoApagadoException;
import autonomaautomovil.exceptions.VehiculoDetenidoException;
import autonomaautomovil.exceptions.VehiculoEncendidoException;
import autonomaautomovil.exceptions.VehiculoPatinaException;
import autonomaautomovil.exceptions.VehiculoPatinaPorIntensidadException;
import autonomaautomovil.exceptions.VehiculoPatinandoException;

/**
 *
 * @author Andres Rodriguez
 */
public class Simulador {
    
   //Atributos//
    private Vehiculo vehiculo;
    
    //Constructor//

    public Simulador(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    public double getVelocidadVehiculo(){
        return this.vehiculo.getVelocidad();
    }
    
    //Metodos//
    public void encenderVehiculo()throws  VehiculoEncendidoException{
        try {
            //Verifica si el vehiculo ya esta encendido
            if (this.vehiculo.isEncendido()){
                throw new VehiculoEncendidoException();
            }
            this.vehiculo.encender(); //Encender el vehiculo si no estaba encendido
        }catch (VehiculoEncendidoException e){
            //Manejar la excepcion
            System.out.println(e.getMessage());
        }
        
    }
    
    public void apagarVehiculo()throws VehiculoApagadoException{
        //Verificar si el vehiculo ya esta apagado
        if (!this.vehiculo.isEncendido()){
            throw new VehiculoApagadoException("El Vehiculo ya esta apagado no se puede apagar");
        }
        this.vehiculo.apagar();
//        //Verificar si la velocidad es mayor a 60km/h al intentar apagar el vehiculo
//        if (this.vehiculo.getVelocidad() > 60){
//            this.vehiculo.accidentarVehiculo();// Marcar el vehiculo como accidentado
//            throw new VehiculoAccidentadoException(); //Lanza la excepcion por accidente
//        }
        
    }
    
    public void acelerarVehiculo(double velocidad) throws LimiteMotorException, VehiculoApagadoException{
        //Verifica si el vehiculo esta apagado
        if (!this.vehiculo.isEncendido()){
            //Lanza la excepción
            throw new VehiculoApagadoException("El Vehiculo esta apagado no se puede acelerar");
        }
        
        try {
            
            this.vehiculo.acelerar(velocidad);//acelera el vehiculo si esta encendido
        
        }catch (LimiteMotorException e){
            
            this.vehiculo.accidentarVehiculo();
            throw  e;
        }
    }
    
    public void frenarVehiculo(double intensidad)throws VehiculoApagadoException, VehiculoDetenidoException{
//        //Verificar si el vehiculo ya esta patinando
//        if (this.vehiculo.isPatinando()){
//            System.out.println("El Vehiculo esta patinando, no se puede realizar mas acciones hasta detenerse");
//            return;
//        }

        //Verificar si el vehiculo esta apagado//
       if(!this.vehiculo.isEncendido()){
            throw new VehiculoApagadoException("El vehiculo esta apagado no se puede frenar");
       }
       this.vehiculo.frenar();
        
        
        //Verificar si el vehiculo se detuvo
//        if (this.vehiculo.getVelocidad() == 0){
//            throw new VehiculoDetenidoException();
//        }
        
//        //Verificar si la intensidad de frenado es mayor a la velocidad actual del vehiculo
//        if (intensidad > this.vehiculo.getVelocidad()){
//            this.vehiculo.patinar();//El vehiculo comienza a patinar;
//            throw new VehiculoPatinandoException();
//        }
        
//        //Verificar si la intensidad del frenado es mayor a la velocidad actual de vehiculo
//        if (intensidad > this.vehiculo.getVelocidad()){
//            throw new VehiculoPatinaPorIntensidadException(); // Lanza excepción si el vehiculo patina por frenado excesivo
//        }
//        this.vehiculo.frenar();
        
//        if (this.vehiculo.getVelocidad() > this.vehiculo.getLlantas().getLimitePermitido()){
//            throw new VehiculoPatinaException();
//        }
//        
//        this.vehiculo.frenar();
           
        //Verificar si la velocidad del vehiculo es mayor al limite permitido por las llantas
        if(this.vehiculo.getVelocidad() > this.vehiculo.getLlantas().getLimitePermitido()&& intensidad > 30 ){
            this.vehiculo.patinar();
            throw new VehiculoPatinandoException();
        }
        
        this.vehiculo.frenar();
        
    }
   
}
