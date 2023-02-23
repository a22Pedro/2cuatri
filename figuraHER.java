class Figura {

    private String color;

    Figura(String color) {
        this.color = color;
    }

}

class Cuadrado extends Figura {
    private double lado;

    Cuadrado(double lado, String color) {
        super(color);
        this.lado = lado;
    }

    double getLado() {
        return lado;
    }
}

class Circulo extends Figura {
    private double radio;

    Circulo(double radio, String color) {
        super(color);
        this.radio = radio;
    }
}

class App {
    public static void main(String[] args) {
        Cuadrado miCuadrado = new Cuadrado(2.5, "azul");
        System.out.println("Lado de miCuadrado: " + miCuadrado.getLado());
        Circulo miCirculo = new Circulo(3.6, "blanco");
        System.out.println("adios");
    }
}