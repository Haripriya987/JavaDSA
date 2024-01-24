import java.util.Scanner;
import java.util.Arrays;
public class Demo2{
    public static int findMedian(int[] arr) {
        // Write your code
        Arrays.sort(arr);
        int mid=arr.length/2;
        return arr[mid];
    }
    public static int kthSmallLarge(int arr[],int k){
        if(k>arr.length || k<=0)
            return -1;

        Arrays.sort(arr);
        return arr[k-1];
    }

    public static void main(String[] args){
        int arr[] = { 12, 3, 5, 7, 19 };
        System.out.println(kthSmallLarge(arr,3));
    }
}
