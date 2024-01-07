public class FactLogN {
    public static int fact(int n){
        if(n==1)
            return n;

        return n*fact(n-1);
    }
    public static void main(String args[]){
        int value=fact(5);
        double logBaseE = Math.log(value);
        double logBase2 = logBaseE / Math.log(2);
        System.out.println(logBase2);
    }
}
