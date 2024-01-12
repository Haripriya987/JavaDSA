public class Doubt {
    public static void main(String args[]){
        Demo22 s=new Demo22(32);
        s.print();
        Object o=new Object();

    }
}
class Demo22{
    String name;
    int rollNo;
    Demo22(int n){
        super();
        rollNo=n;
    }
    void print(){
        System.out.print(name+" "+rollNo);

    }
}