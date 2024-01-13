package ComplexNumber;

public class ComplexNumber {
    private int real;
    private int imaginary;

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public ComplexNumber(int real, int imaginary){
        setReal(real);
        setImaginary(imaginary);
    }
    public void print(){
        if(this.imaginary!=0)
            System.out.println(getReal()+" + "+"i"+getImaginary());
        else
            System.out.println(getReal());

    }
    public void add(ComplexNumber c2){
        this.real=this.real+c2.real;
        this.imaginary=this.imaginary+c2.imaginary;
    }
    public void sub(ComplexNumber c2){
        this.real=this.real-c2.real;
        this.imaginary=this.imaginary-c2.imaginary;
    }
    public static ComplexNumber add(ComplexNumber c1,ComplexNumber c2){
        int real=c1.real+c2.real;
        int imaginary=c1.imaginary+c2.imaginary;

        ComplexNumber c3=new ComplexNumber(real,imaginary);
        return  c3;
    }
    public ComplexNumber sub(ComplexNumber c1,ComplexNumber c2){
        int real=c1.real+c2.real;
        int imaginary=c1.imaginary+c2.imaginary;

        ComplexNumber c3=new ComplexNumber(real,imaginary);
        return  c3;
    }

    public void mul(ComplexNumber c2){
        int a=(this.real*c2.real)-(this.imaginary*c2.imaginary);
        int b=(this.real*c2.imaginary)+(this.imaginary*c2.real);
        this.real=a;
        this.imaginary=b;
    }
    public ComplexNumber mul(ComplexNumber c1,ComplexNumber c2){
        int a=(c1.real*c2.real)-(c1.imaginary*c2.imaginary);
        int b=(c1.real*c2.imaginary)+(c1.imaginary*c2.real);
        ComplexNumber c3=new ComplexNumber(a,b);
        return  c3;

    }

}
