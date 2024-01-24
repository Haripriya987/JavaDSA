
public class Singleton {
    private static Singleton obj;
    private Singleton(){

    }
    public static Singleton getObject(){
        if(obj==null) {
            System.out.println("1 object is created");
            obj = new Singleton();
        }
            return obj;

    }
    public static void main(String args[]){
        Singleton s=getObject();
        System.out.println(s);
        Singleton s2=getObject();
        System.out.println(s2);


    }
}
