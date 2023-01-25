import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class banner{

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String[] text = sc.nextLine().split("");
        char[][] a={{' ','#','#','#','#',' '},
                {' ','#',' ',' ','#',' '},
                {' ','#','#','#','#',' '},
                {' ','#',' ',' ','#',' '},
                {' ','#',' ',' ','#',' '},};
        char[][] e={{' ','#','#','#','#',' '},
                {' ','#',' ',' ',' ',' '},
                {' ','#','#','#',' ',' '},
                {' ','#',' ',' ',' ',' '},
                {' ','#','#','#','#',' '},};
        char[][] i={{' ',' ',' ','#',' ',' '},
                {' ',' ',' ','#',' ',' '},
                {' ',' ',' ','#',' ',' '},
                {' ',' ',' ','#',' ',' '},
                {' ',' ',' ','#',' ',' '},};
        char[][] c={{' ','#','#','#','#',' '},
                {' ','#',' ',' ',' ',' '},
                {' ','#',' ',' ',' ',' '},
                {' ','#',' ',' ',' ',' '},
                {' ','#','#','#','#',' '},};
        char[][] d={{' ','#','#',' ',' ',' '},
                {' ','#',' ','#',' ',' '},
                {' ','#',' ',' ','#',' '},
                {' ','#',' ','#',' ',' '},
                {' ','#','#',' ',' ',' '},};
        char[][] m={{' ','#',' ',' ',' ','#'},
                {' ','#','#',' ','#','#'},
                {' ','#',' ','#',' ','#'},
                {' ','#',' ',' ',' ','#'},
                {' ','#',' ',' ',' ','#'},};
        char[][] s={{' ','#','#','#','#',' '},
                {' ','#',' ',' ',' ',' '},
                {' ','#','#','#','#',' '},
                {' ',' ',' ',' ','#',' '},
                {' ','#','#','#','#',' '},};
        char[][] t={{' ','#','#','#','#','#'},
                {' ',' ',' ','#',' ',' '},
                {' ',' ',' ','#',' ',' '},
                {' ',' ',' ','#',' ',' '},
                {' ',' ',' ','#',' ',' '},};
        char[][] o={{' ','#','#','#','#','#'},
                {' ','#',' ',' ',' ','#'},
                {' ','#',' ',' ',' ','#'},
                {' ','#',' ',' ',' ','#'},
                {' ','#','#','#',' ','#'},};
        char[][] nada={{' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' '},};
        char[][] l={{' ','#',' ',' ',' ',' '},
                {' ','#',' ',' ',' ',' '},
                {' ','#',' ',' ',' ',' '},
                {' ','#',' ',' ',' ',' '},
                {' ','#','#','#','#',' '},};

        for (int fila=0;fila<5;fila++){

            for (int col=0;col < text.length;col++){

                if (Objects.equals(text[col], "A")){
                    for (int q=0;q< a[fila].length;q++){
                        System.out.print(a[fila][q]);
                    }
                }

                if (Objects.equals(text[col], "L")){
                    for (int q=0;q< l[fila].length;q++){
                        System.out.print(l[fila][q]);
                    }
                }


                if (Objects.equals(text[col], "E")){
                    for (int q=0;q< e[fila].length;q++){
                        System.out.print(e[fila][q]);
                    }
                }

                if (Objects.equals(text[col], "I")){
                    for (int q=0;q< i[fila].length;q++){
                        System.out.print(i[fila][q]);
                    }
                }
                if (Objects.equals(text[col], "O")){
                    for (int q=0;q< o[fila].length;q++){
                        System.out.print(o[fila][q]);
                    }
                }
                if (Objects.equals(text[col], "D")){
                    for (int q=0;q< d[fila].length;q++){
                        System.out.print(d[fila][q]);
                    }
                }
                if (Objects.equals(text[col], "M")){
                    for (int q=0;q< m[fila].length;q++){
                        System.out.print(m[fila][q]);
                    }
                }
                if (Objects.equals(text[col], "S")){
                    for (int q=0;q< s[fila].length;q++){
                        System.out.print(s[fila][q]);
                    }
                }
                if (Objects.equals(text[col], "T")){
                    for (int q=0;q< t[fila].length;q++){
                        System.out.print(t[fila][q]);
                    }
                }
                if (Objects.equals(text[col], "C")){
                    for (int q=0;q< c[fila].length;q++){
                        System.out.print(c[fila][q]);
                    }
                }
                if (Objects.equals(text[col], " ")){
                    for (int q=0;q< nada[fila].length;q++){
                        System.out.print(nada[fila][q]);
                    }
                }


            }
            System.out.println();
        }
    }
}