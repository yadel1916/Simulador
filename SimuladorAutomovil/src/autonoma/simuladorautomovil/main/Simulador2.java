/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladorautomovil.main;

import autonoma.simuladorautomovil.models.Llanta;
import autonoma.simuladorautomovil.models.Motor;
import autonoma.simuladorautomovil.models.Vehiculo;
import autonoma.simuladorautomovil.models.Simulador;
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
public class Simulador2 {
    
    public static void main(String[] args ){
        Motor motor = new Motor(200,2000);
        Llanta llantas = new Llanta("Bonitas", 70);
        Vehiculo vehiculo = new Vehiculo(motor,llantas);
        Simulador simulador = new Simulador(vehiculo);
        
//        simulador.encenderVehiculo(); //Primer Intento en encender el vehiculo
//        simulador.encenderVehiculo(); //Segunfo Intento, lanzara la excepcion y mostrar la excepcion
        
//        simulador.acelerarVehiculo(80);
//        
//        
//        
//        try {
//            //Intentar frenar con una intensidad mayor a la velocidad actual intentando que patine
//            simulador.frenarVehiculo(90);
//        }catch (VehiculoPatinandoException e){
//            System.out.println(e.getMessage());
//        }
        
//        //Frenar gradualmente hasta detener el vehiculo
//        while (simulador.getVelocidadVehiculo() > 0){
//            simulador.frenarVehiculo(10);
//            System.out.println("Velocidad Actual:" + simulador.getVelocidadVehiculo());
//        }
        
//        //El Vehiculo se recupera del patinaje una vez se detiene
//        if (!vehiculo.isPatinando()){
//            System.out.println("El Vehiculo a recuperado el control");
//        }

        
        try {
            simulador.apagarVehiculo(); //Intentar cuando ya este apagado
             
        } catch(VehiculoApagadoException e){
            System.out.println(e.getMessage());
        }
        
        try {
            simulador.acelerarVehiculo(50); //Intentar acelerar cuando ya este apagado
            
        }catch (VehiculoApagadoException e){
            System.out.println(e.getMessage());
        }
       
        
        
    }
    
    
}
