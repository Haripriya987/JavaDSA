public class CountZeros {
    public static int countZeros(int n){
       if(n<10){
           if(n==0)
               return 1;
           else
               return 0;
       }
       if(n%10==0)
       return countZeros(n/10)+1;
       else
           return countZeros(n/10);
    }
    public static void main(String[] args){
        System.out.println(countZeros(10020));

    }
}
