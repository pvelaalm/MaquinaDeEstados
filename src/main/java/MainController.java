import MaquinaDamas.JuegoDamas.JuegoDamas;
import MaquinaMates.CompositeOperation.CompositeOperation;
import MaquinaMates.Operation;

public class MainController {
    private CompositeOperation mathMachine;
    private JuegoDamas gameMachine;

    public MainController() {
        mathMachine = new CompositeOperation();
        gameMachine = new JuegoDamas();
    }

    // Métodos para añadir operaciones matemáticas a la máquina de operaciones compuestas
    public void addMathOperation(Operation operation) {
        mathMachine.add(operation);
    }

    // Método para realizar cálculos matemáticos
    public double calculateMath(double a, double b) {
        return mathMachine.calculate(a, b);
    }

    // Métodos para interactuar con la máquina de juego de damas
    public void iniciarJuego() {
        gameMachine.iniciarJuego();
    }

    public char obtenerPieza(int fila, int columna) {
        return gameMachine.obtenerPieza(fila, columna);
    }

    public void realizarMovimiento(int filaOrigen, int columnaOrigen, int filaDestino, int columnaDestino) {
        gameMachine.realizarMovimiento(filaOrigen, columnaOrigen, filaDestino, columnaDestino);
    }

    public boolean esTurnoBlancas() {
        return gameMachine.esTurnoBlancas();
    }

    // Otros métodos según sea necesario
}

