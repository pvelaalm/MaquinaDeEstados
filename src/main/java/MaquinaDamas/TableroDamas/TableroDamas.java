package MaquinaDamas.TableroDamas;

import MaquinaDamas.DamasPrototype;

public class TableroDamas implements DamasPrototype {
    private char[][] tablero;

    public TableroDamas() {
        tablero = new char[8][8];
        inicializar();
    }

    private void inicializar() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 1) {
                    if (i < 3) {
                        tablero[i][j] = 'B'; // Fichas negras
                    } else if (i > 4) {
                        tablero[i][j] = 'N'; // Fichas blancas
                    } else {
                        tablero[i][j] = ' '; // Casillas vacías
                    }
                } else {
                    tablero[i][j] = ' '; // Casillas vacías
                }
            }
        }
    }

    public char obtenerPieza(int fila, int columna) {
        return tablero[fila][columna];
    }

    public void realizarMovimiento(int filaOrigen, int columnaOrigen, int filaDestino, int columnaDestino) {
        char pieza = tablero[filaOrigen][columnaOrigen];
        tablero[filaDestino][columnaDestino] = pieza;
        tablero[filaOrigen][columnaOrigen] = ' ';
    }

    @Override
    public DamasPrototype clonar() {
        TableroDamas clon = new TableroDamas();
        for (int i = 0; i < 8; i++) {
            System.arraycopy(tablero[i], 0, clon.tablero[i], 0, 8);
        }
        return clon;
    }
}
