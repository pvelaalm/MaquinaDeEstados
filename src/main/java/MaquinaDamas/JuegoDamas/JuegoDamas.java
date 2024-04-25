package MaquinaDamas.JuegoDamas;

import MaquinaDamas.DamasPrototype;
import MaquinaDamas.Excepciones.MovimientoInvalidoException;
import MaquinaDamas.TableroDamas.TableroDamas;
import MaquinaDamas.TurnoDamas.TurnoDamas;
import ExceptionHandler.ExceptionHandler;

public class JuegoDamas implements DamasPrototype {
    private TableroDamas tablero;
    private TurnoDamas turno;

    public JuegoDamas() {
        tablero = new TableroDamas();
        turno = new TurnoDamas();
    }

    public void iniciarJuego() {
        // Aquí podrías agregar más lógica de inicialización si fuera necesario
    }

    public char obtenerPieza(int fila, int columna) {
        return tablero.obtenerPieza(fila, columna);
    }

    public void realizarMovimiento(int filaOrigen, int columnaOrigen, int filaDestino, int columnaDestino) {


        try {
            char pieza = tablero.obtenerPieza(filaOrigen, columnaOrigen);
            char destino = tablero.obtenerPieza(filaDestino, columnaDestino);

            // Verificar si el movimiento es válido
            if (!esMovimientoValido(filaOrigen, columnaOrigen, filaDestino, columnaDestino)) {
                throw new MovimientoInvalidoException("Movimiento inválido");
            }

            tablero.realizarMovimiento(filaOrigen, columnaOrigen, filaDestino, columnaDestino);
            turno.cambiarTurno();
        } catch (MovimientoInvalidoException e) {
            ExceptionHandler handler = new ExceptionHandler();
            handler.handleException(e);
        }

    }

    private boolean esMovimientoValido(int filaOrigen, int columnaOrigen, int filaDestino, int columnaDestino) {
        // Verificar si la posición de destino está dentro del tablero
        if (filaDestino < 0 || filaDestino >= 8 || columnaDestino < 0 || columnaDestino >= 8) {
            return false;
        }

        // Verificar si la casilla de destino está vacía
        if (tablero.obtenerPieza(filaDestino, columnaDestino) != ' ') {
            return false;
        }

        // Lógica adicional para verificar si el movimiento es válido según las reglas del juego de damas

        return true; // El movimiento es válido si pasa todas las verificaciones anteriores
    }

    public boolean esTurnoBlancas() {
        return turno.esTurnoBlancas();
    }

    @Override
    public DamasPrototype clonar() {
        JuegoDamas clon = new JuegoDamas();
        clon.tablero = (TableroDamas) tablero.clonar(); // Casting a TableroDamas
        clon.turno = new TurnoDamas();
        return clon;
    }

}
