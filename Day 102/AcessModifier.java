public class AcessModifier {
    public static void main(String args[]){
        Demo d=new Demo();
        //d.rollnum=-23;
        d.name="ABCD";
    }
}
class Demo{
    private int rollnum;//Private modifier
    String name;//Default modifier
}

//Default can be accessed within the package.Other than that we cannot use it.
//Private access modifier is used within the class only.Other than that we cannot aceess it.