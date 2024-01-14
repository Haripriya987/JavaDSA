package Exception;

public class ExceptionUse {
    private static int divide(int a,int b)throws DivideByZero{
        if(b==0){
            throw new DivideByZero();
        }

        return a/b;
    }

    public static void main(String[] args){

        try {
            divide(2, 0);
        }
        catch (DivideByZero e){
            System.out.println("Check b value");
        }
        System.out.println("Hello world");
    }
}
