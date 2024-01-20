package RecursionProblems;

import java.util.Arrays;

public class WinningStrategy {
    public static boolean isCorrectSequence(int arr[]){

        int count=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==i+1) {
                continue;
            }
            int diff=i-(arr[i]-1);
            if(diff>2 )
                return false;
        }


        return true;
    }
    public static int minSwaps(int[] arr){

        int n=arr.length;
        int swaps=0;
        for(int i=0;i<n;i++){
            while(arr[i]!=i+1){
                int temp=arr[i];
                arr[i]=arr[temp-1];
                arr[temp-1]=temp;
                swaps++;
            }
        }
        return swaps;
    }
    public static void main(String[] args){
        int arr[]={2,1,5,4,3};
        System.out.println(isCorrectSequence(arr));
        if(isCorrectSequence(arr))
            System.out.println(minSwaps(arr));
    }
}
