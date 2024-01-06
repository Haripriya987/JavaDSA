public class LogNFactorial {
    public static void main(String[] args){
        int n=5;
        System.out.println(Factorial(n));
        System.out.println(Math.log(Fact2(n)));
    }

    private static double Factorial(int n) {
        if(n==1)
            return 0;

        return  Factorial(n-1)+Math.log(n);
    }
    private static int Fact2(int n){
        if(n==0)
            return 1;

        return n*Fact2(n-1);
    }
}
