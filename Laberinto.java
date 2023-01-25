public class Laberinto {
    public static void main(String[] args) {
        char[][] laberinto = {
                { 'R', '#', '0', '0', '0' },
                { '0', '0', '0', '#', '0' },
                { '#', '#', '#', '0', '0' },
                { '0', '0', '0', '0', '#' },
                { '0', '0', '#', '0', '0' },
                { '0', '0', '0', '#', '0' },
                { '0', '#', '0', '#', '#' },
                { '0', '0', 'Q', '#', '0' },
        };
        if (!hayCamino(0, 0, laberinto)) {
            System.out.println("no hay solucion");
        } else {
            for (char[] x : laberinto) {
                for (char c : x) {
                    System.out.print(c + "\t");// un tab para mejorar presentación
                }
                System.out.println("");
            }
        }
    }

    static boolean hayCamino(int i, int j, char[][] laberinto) {

        if (i < 0 || i > laberinto.length - 1 || j < 0 || j > laberinto[i].length - 1)
            return false;
        if (laberinto[i][j] == '#')
            return false;
        if (laberinto[i][j] == '.') {// ya fue visitado. evitar ciclos dentro de un camino
            return false;
        }
        if (laberinto[i][j] == 'Q') {
            return true;
        }
        // es '0' o 'R' y desde aquí puede haber camino
        laberinto[i][j] = '.'; // marco como visitado y continuo la exploración recursiva
        // miramos caminos a través de sus posibles 4 vecinos
        if (hayCamino(i - 1, j, laberinto))
            return true;                    // vecino norte
        if (hayCamino(i + 1, j, laberinto))
            return true;                    // vecino sur
        if (hayCamino(i, j + 1, laberinto))
            return true;                    // vecino derecha
        if (hayCamino(i, j - 1, laberinto))
            return true;                      // vecino izzq
        // si llego aquí es porque desde ningún vecino hay solución
        // y por tanto es falso que pueda haber solución desde (i,j)
        laberinto[i][j] = 'v';
        return false;
        
    }

    
}
