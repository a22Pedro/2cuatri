package motor3R;

import java.util.Arrays;


public class TresEnRaya {

    private char[][] tablero;
    private char jugadorActual;
    private char jugadorGanador;
    private char JUGADOR_VACIO;
    private int turno;

    public TresEnRaya() {
        this.tablero = new char[3][3];
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                this.tablero[fila][columna] = '_';
            }
        }
        this.jugadorActual = 'X';
        this.jugadorGanador = '-';
        this.turno = 1;
    }
    
    public char[][] getTablero() {
        return tablero;
    }

    public boolean esJugadaValida(int fila, int columna) {
        return fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == ' ';
    }

    public static boolean verificarGanador(char[][] tablero, char jugador) {
        // Verificar filas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) {
                return true;
            }
        }
    
        // Verificar columnas
        for (int i = 0; i < 3; i++) {
            if (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador) {
                return true;
            }
        }
    
        // Verificar diagonales
        if (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) {
            return true;
        }
        if (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador) {
            return true;
        }
    
        return false;
    }
    public static boolean verificarEmpate(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
    public static void realizarMovimiento(char[][] tablero, int fila, int columna, char jugador) {
        tablero[fila][columna] = jugador;
    }
    public static boolean esMovimientoValido(char[][] tablero, int fila, int columna) {
        // Verificar si la fila y columna están dentro del rango del tablero
        if (fila < 0 || fila > 2 || columna < 0 || columna > 2) {
            return false;
        }
    
        // Verificar si la celda está vacía
        if (tablero[fila][columna] != '-') {
            return false;
        }
    
        return true;
    }
   
    public boolean estaVacia(int fila, int columna) {
        return this.tablero[fila][columna] == JUGADOR_VACIO;
    }


    public boolean esEmpate() {
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                if (this.tablero[fila][columna] == JUGADOR_VACIO) {
                    return false;  
                }
            }
        }

        return true;  
    }

}
