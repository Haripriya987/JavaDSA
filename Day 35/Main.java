interface Demo{
    void Meth();
}
interface Demo2{
    void Meth();
}
//class One implements  Demo,Demo2{
//    @Override
//    public void Meth(){
//        System.out.println("It is Method override by interface");
//    }
//}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        One o=new One();
//        o.Meth();
    Demo d=()-> System.out.print("Lamda Expression in Java for an functional interfaace");
        d.Meth();

    }
}