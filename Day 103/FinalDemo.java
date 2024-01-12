public class FinalDemo {
    public static void main(String args[]){
        Stu s=new Stu("QA",12);

    }
}
class Stu{
    final int rollnum;
    String name;
   public  final static double CONVERSION_FACTOR=0.95;
    private static int count;
    //All the objects creating for this class share this count.It is a common property .
    // It is a class property.Because it is a static


    public static int getCount() {
        return count;
    }
    //Inside static functions we don't use non-static method calls
    //we don't use this,super keywords
    //As well as on static variables

    public Stu(String name, int rollnum){
        this.name=name;
        this.rollnum=rollnum;
        count++;
    }


//    Stu(String name){
//        this.name=name;
//    }
 // We are using Final Keyword here .we cannot change the value. It has to initialized only once at the time of declaration
// or we can do it in constuctor.Because Constructor is called only once at lifetime.
//    Stu(){
//
//    }
}
