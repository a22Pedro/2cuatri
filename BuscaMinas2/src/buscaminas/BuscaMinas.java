package buscaminas;
public class BuscaMinas {
    public char[][] tablero;
    private char[][] minas;
    private int[][] solucion;
    public char[][] getMinas() {
        return minas;
    }
    public int[][] getSolucion() {
        return solucion;
    }
    public void iniciarTablero(int filas, int columnas, int totalMinas) {
        tablero = new char[filas][columnas];
        minas = new char[filas][columnas];
        solucion = new int[filas][columnas];

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                tablero[i][j] = '-';
            }
        }

        int contadorMinas = 0;

        while (contadorMinas < totalMinas) {
            int x = (int) (Math.random() * filas);
            int y = (int) (Math.random() * columnas);
            if (minas[x][y] == '\u0000') {
                minas[x][y] = 'X';
                contadorMinas++;
            }
        }
    }

    public void generarSolucion() {
        for (int i = 0; i < minas.length; i++) {
            for (int j = 0; j < minas[0].length; j++) {
                for (int k = -1; k <= 1; k++) {
                    for (int l = -1; l <= 1; l++) {
                        if ((i + k >= 0) && (j + l >= 0) && (i + k < minas.length) && (j + l < minas[0].length)) {
                            if (minas[i][j] != 'X') {
                                if (minas[i + k][j + l] == 'X') {
                                    solucion[i][j]++;
                                }
                            } else {
                                solucion[i][j] = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    public boolean verficarVictoria(int cantidadMinas) {
        int posiblesMinas = 0;
        for (char[] chars : tablero) {
            for (int j = 0; j < tablero[0].length; j++) {
                if (chars[j] == '-') {
                    posiblesMinas++;
                }
            }
        }
        return posiblesMinas == cantidadMinas;
    }
}
