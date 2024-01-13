package Polynomial;

public class PolynomialUse {
    public static void main(String args[]){
        Polynomial p=new Polynomial();
        p.setDegreeCoefficients(3,5);
        p.setDegreeCoefficients(2,3);
        p.setDegreeCoefficients(0,5);
        p.print();
        //System.out.println();
        Polynomial p2=new Polynomial();
        p2.setDegreeCoefficients(4,7);
        p2.setDegreeCoefficients(1,6);
        p2.setDegreeCoefficients(0,1);
        p2.print();

        Polynomial p3=p.add(p2);
        p3.print();
        Polynomial p4=p.multiply(p2);
        p4.print();
    }

}
