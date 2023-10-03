import java.util.*;
public class SmallLargeElements {

    static int secondLargest(int[] arr){
        int firstLargest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>firstLargest){
                secondLargest=firstLargest;
                firstLargest=arr[i];
            }
            else{
                if(arr[i]>secondLargest && arr[i]!=firstLargest)
                    secondLargest=arr[i];
            }
        }
        return secondLargest;
    }
    static int secondSmallest(int[] arr){
        int firstSmallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<firstSmallest){
                secondSmallest=firstSmallest;
                firstSmallest=arr[i];
            }
            else{
                if(arr[i]<secondSmallest && arr[i]!=firstSmallest)
                    secondSmallest=arr[i];
            }
        }
        return secondSmallest;
    }

    public static void main(String[] args){
       Scanner in= new Scanner(System.in);
       int n=in.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=in.nextInt();
       }

       System.out.println(secondLargest(arr));
       System.out.println(secondSmallest(arr));

    }
}
