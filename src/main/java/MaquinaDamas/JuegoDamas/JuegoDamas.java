package MaquinaDamas.JuegoDamas;

import MaquinaDamas.DamasPrototype;
import MaquinaDamas.TableroDamas.TableroDamas;
import MaquinaDamas.TurnoDamas.TurnoDamas;

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
        tablero.realizarMovimiento(filaOrigen, columnaOrigen, filaDestino, columnaDestino);
        turno.cambiarTurno();
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
