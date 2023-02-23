class Figura {

    private String color;

    Figura(String color) {
        this.color = color;
    }

}

class Cuadrado {
    private double lado;
    private Figura figura;

    Cuadrado(double lado, String color) {
        //super(color); con composicion en vez de esto se usa el new
        this.figura=new Figura(color);
        this.lado = lado;
    }

    double getLado() {
        return lado;
    }
}

class Circulo {
    private double radio;
    private Figura figura;

    Circulo(double radio, String color) {
        this.figura=new Figura(color);
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