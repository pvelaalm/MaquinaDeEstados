package Demos;

import ExceptionHandler.ExceptionHandler;
import DecoratorN.DecoratorN;
import DecoratorP.DecoratorP;
import MachineX.MachineX;


import MaquinaDamas.Excepciones.MovimientoInvalidoException;
import MaquinaMates.Excepciones.OperacionMatematicaException;

public class Demo1 {
    public static void main(String[] args) {
        // Creamos una instancia de ExceptionHandler
        ExceptionHandler exceptionHandler = new ExceptionHandler();

        // Creamos instancias de los decoradores y de la máquina X
        DecoratorP decoratorP = new DecoratorP(exceptionHandler);
        DecoratorN decoratorN = new DecoratorN(exceptionHandler);
        MachineX machineX = new MachineX(exceptionHandler);

        // Ejecutamos la demostración
        machineX.demonstrate();

        // Probamos algunos casos de excepciones específicas
        try {
            throw new OperacionMatematicaException("Error en operación matemática");
        } catch (OperacionMatematicaException e) {
            decoratorP.handleException(e);
        }

        try {
            throw new MovimientoInvalidoException("Error en movimiento de damas");
        } catch (MovimientoInvalidoException e) {
            decoratorN.handleException(e);
        }
    }
}
