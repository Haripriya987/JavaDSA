package RecursionProblems;

import java.util.Arrays;

public class InterestingPattern {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int k = 2;
        int l = 1;
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[n-1];
        int avg = (min+max)/2;
        int increment = 0;
        int decrement = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i]<avg) {
                increment += (avg-arr[i]);
            } else if(arr[i]>avg) {
                decrement += (arr[i]-avg);
            }
        }
        if(increment>decrement) {
            increment = increment-decrement;
            System.out.println((decrement*k)+(increment*l));
        } else {
            System.out.println(decrement*k);
        }

    }
}
