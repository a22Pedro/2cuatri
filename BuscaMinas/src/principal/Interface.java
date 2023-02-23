
package principal;
import buscaminas.BuscaMinas;

import java.util.Scanner;

public class Interface {
    private Scanner cap;
    public void mostrarTablero() {
        BuscaMinas juego = new BuscaMinas();
        for (int i = 0; i < juego.tablero.length; i++) {
            for (int j = 0; j < juego.tablero[0].length; j++) {
                System.out.print(juego.tablero[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public void jugar(int cantidadMinas) {
        boolean completado = false;
        BuscaMinas juego = new BuscaMinas();
        do {
            System.out.print("Ingrese fila: ");
            int x = cap.nextInt() - 1;
            System.out.print("Ingrese columna: ");
            int y = cap.nextInt() - 1;

            if (juego.getMinas()[x][y] == 'X') {
                System.out.println("Perdiste pendejo!");
                for (int i = 0; i < juego.getMinas().length; i++) {
                    for (int j = 0; j < juego.getMinas()[0].length; j++) {
                        if (juego.getMinas()[i][j] == 'X') {
                            juego.tablero[i][j] = 'X';
                        }
                    }
                }
                mostrarTablero();
                break;
            } else {
                juego.tablero[x][y] = (juego.getSolucion()[x][y] + "").charAt(0);
                mostrarTablero();
            }

            boolean victoria = juego.verficarVictoria(cantidadMinas);

            if (victoria) {
                System.out.println("Ganaste!");
                for (int i = 0; i < juego.getMinas().length; i++) {
                    for (int j = 0; j < juego.getMinas()[0].length; j++) {
                        if (juego.getMinas()[i][j] == 'X') {
                            juego.tablero[i][j] = '*';
                        }
                    }
                }
                mostrarTablero();
                break;
            }
        } while (!completado);
    }
    public static main(String[] args) {
        cap = new Scanner(System.in);
        BuscaMinas juego = new BuscaMinas();
        System.out.println("Seleccione el nivel:\n1. Principiante\n2. Intermedio\n3. Experto");
        int nivel = cap.nextInt();

        switch (nivel){
            case 1:
                juego.iniciarTablero(3, 3, 1);
                break;
            case 2:
                juego.iniciarTablero(6, 6, 10);
                break;
            case 3:
                juego.iniciarTablero(10, 10, 30);
                break;
        }

        juego.generarSolucion();
        jugar(1);
    }
    
}
