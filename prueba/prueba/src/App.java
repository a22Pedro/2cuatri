abstract class Figura{
    String color;

    public Figura(String color) {
        this.color = color;
    }

    abstract double area();
    
}
class Triangulo extends Figura{
    double base;
    double altura;

    public Triangulo(String color, double base, double altura) {
        super(color);
        this.altura=altura;
        this.base=base;
    }

    @Override
    double area(){
        return base*altura;
    }
}
class Rectangulo extends Figura{
    double largo;
    double ancho;
    public Rectangulo(String color, double largo, double ancho){
        super(color);
        this.largo=largo;
        this.ancho=ancho;
    }
    @Override
    double area(){
        return ancho*largo;
    }
}
class Circulo extends Figura{
    double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }
    
    @Override
    double area(){
        return radio*radio*Math.PI;
    }
}
class App{
    public static void main(String[] args) {
        Figura[] listaFiguras={new Circulo("verde",1.0),
        new Circulo("rojo",2.0),
        new Circulo("amarillo",2.0),
        new Triangulo("verde", 1.0, 1.0),
        new Triangulo("rojo", 2.0, 2.0),
        new Rectangulo("rosa",3.0,4.0),
        new Rectangulo("lila",2.0,3.0),
        };
        for (Figura figura : listaFiguras) {
            if(figura.area()>4.0){
                figura.color="negro";
            }
            System.out.println(figura.area()+", "+figura.color);
        }
    }
}