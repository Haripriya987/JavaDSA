package ComplexNumber;

public class ComplexNumberDemo {
    public static void main(String args[]){
        ComplexNumber c1=new ComplexNumber(2,3);
        c1.print();
        c1.setReal(4);
        c1.setImaginary(10);
        c1.print();

        ComplexNumber c2=new ComplexNumber(2,3);
        c2.print();
        c1.add(c2);
//        c1.setReal(4);
//        c1.setImaginary(10);
       c1.print();
       c2.print();

//
       ComplexNumber c3=new ComplexNumber(2,3);
        c2.print();
        c3.mul(c2);
        c2.print();
        c3.print();

        ComplexNumber c4=ComplexNumber.add(c1,c2);
        c1.print();
        c2.print();
        c4.print();

    }
}
