import java.util.*;
public class PrintPairProblems {

    static void printPairs(int[] arr){
        System.out.println();
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j< arr.length;j++)
                System.out.println(arr[i]+ " "+arr[j]);
        }
        System.out.println();
    }
    static void printPairSumPrimeNo(int[] arr){
        System.out.println();
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j< arr.length;j++) {
                if (isPrime(arr[i] + arr[j]))
                         System.out.println(arr[i] + " " + arr[j]);
            }
        }

    }
    static void printPairsAnyOneIsEvenNumber(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(isEven(arr[i]) || isEven(arr[j]) )
                    System.out.println(arr[i]+" "+arr[j]);
            }
        }
        System.out.println();
    }
    private static boolean isEven(int n){
        return n%2==0;
    }

    private static boolean isPrime(int n) {
        for(int i=2;i*i<=n;i++ ){
           if(n%i==0)
              return false;
        }
        return true;
    }

    public static void main(String[] args){
        int[] a={1,2,3,4,5,};
        printPairs(a);
        System.out.println("Next Function");
        printPairSumPrimeNo(a);
        System.out.println("Next Function");
        printPairsAnyOneIsEvenNumber(a);

    }
}
