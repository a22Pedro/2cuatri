import static motor3R.TresEnRaya;
import java.util.Random;

import motor3R.TresEnRaya;

public class InterfaceConsola {

    static void presentarJuego() {
        System.out.println("Tablero");
        System.out.println("Juegas contra la maquina en facil");
        System.out.println("A1  |   B1  |   C1");
        System.out.println("A2  |   B2  |   C2");
        System.out.println("A3  |   B3  |   C3");

    }

    public void mostrarTablero() {
        System.out.println("  1 2 3");
        for (int fila = 0; fila < 3; fila++) {
            System.out.print((fila + 1) + " ");
            for (int columna = 0; columna < 3; columna++) {
                System.out.print(this.tablero[fila][columna] + " ");
            }
            System.out.println();
        }
    }

    public void TresEnRaya() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int fila, columna;

        System.out.println("Comenzando nuevo juego...");
        mostrarTablero();

        // Jugar hasta que haya un ganador o empate
        while (this.jugadorGanador == '-') {
            // Turno del jugador humano
            if (this.jugadorActual == 'X') {
                System.out.println(
                        "Es tu turno, jugador X. Ingresa la fila y columna de tu movimiento (por ejemplo, 1 2):");
                fila = scanner.nextInt() - 1;
                columna = scanner.nextInt() - 1;

                if (esJugadaValida(fila, columna)) {
                    realizarMovimiento(this.tablero, fila, columna, this.jugadorActual);
                    this.turno++;
                    mostrarTablero();
                } else {
                    System.out.println("Movimiento inválido, por favor intenta de nuevo.");
                }
            }
            // Turno de la máquina
            else {
                System.out.println("Es el turno de la máquina, jugador O.");
                fila = random.nextInt(3);
                columna = random.nextInt(3);

                while (!esJugadaValida(fila, columna)) {
                    fila = random.nextInt(3);
                    columna = random.nextInt(3);
                }

                realizarMovimiento(this.tablero, fila, columna, this.jugadorActual);
                this.turno++;
                imprimirTablero();
            }

            // Verificar si hay un ganador
            if (verificarGanador(this.tablero, this.jugadorActual)) {
                this.jugadorGanador = this.jugadorActual;
                System.out.println("¡Felicidades, jugador " + this.jugadorGanador + "! ¡Has ganado!");
                break;
            }

            // Verificar si hay empate
            if (esEmpate()) {
                System.out.println("¡Es un empate!");
                break;
            }

        }
    }

    public static void main(String[] args) {
        new TresEnRaya();
        TresEnRaya();
    }

}
