package MaquinaDamas.TurnoDamas;

public class TurnoDamas {
    private boolean turnoBlancas;

    public TurnoDamas() {
        turnoBlancas = true;
    }

    public boolean esTurnoBlancas() {
        return turnoBlancas;
    }

    public void cambiarTurno() {
        turnoBlancas = !turnoBlancas;
    }
}


