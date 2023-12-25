public class MultiplicationInRecursion {
    public static int multiplication(int m,int n){
        if(n==0 || m==0)
            return 0;

//        if(n==1)
//           return m;


        return m+multiplication(m,n-1);
    }
    public static void main(String[] args){
        System.out.println(multiplication(5,3));
        System.out.println(multiplication(5,0));

    }
}
