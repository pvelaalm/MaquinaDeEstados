package ExceptionHandler;

import MaquinaDamas.Excepciones.MovimientoInvalidoException;
import MaquinaMates.Excepciones.OperacionMatematicaException;

public class ExceptionHandler {
    public void handleException(Exception e) {
        // Aquí puedes escribir la lógica para manejar diferentes tipos de excepciones

        if (e instanceof OperacionMatematicaException) {
            // Manejar la excepción de operación matemática
            System.out.println("Se produjo un error en una operación matemática: " + e.getMessage());
        } else if (e instanceof MovimientoInvalidoException) {
            // Manejar la excepción de movimiento inválido en el juego de damas
            System.out.println("Se intentó realizar un movimiento inválido en el juego de damas: " + e.getMessage());
        } else {
            // Manejar cualquier otra excepción no específica
            System.out.println("Se produjo un error: " + e.getMessage());
        }
    }
}

