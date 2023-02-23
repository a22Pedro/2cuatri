abstract class Conmutable{
    encender();
    apagar();
}
class Lampara extends Conmutable{

}
class Television extends Conmutable{

}
public class Mando {
    public static void main(String[] args) {
    Lampara l= new Lampara();
    Television t= new Television();
    Mando m1= new Mando(l);
    m1.presionar();
    m1.presionar();
    m1.presionar();
    //otro mando con otro dispositivo sin problemas
    Mando m2= new Mando(t);
    m2.presionar();
    m2.presionar();
    }
    }