import java.util.HashSet;
import java.util.Scanner;

public class TwoArray {
    static void twoArrayUsingHashMap(int[] arr,int[] arr2){
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int x:arr)
            hs.add(x);
        for(int y:arr2){
            if(hs.contains(y))
                System.out.println(y);
            else{
                hs.add(y);
            }
        }

    }
    static void naiveApproach(int[] arr,int[] arr2){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr2.length;j++){
                if(arr[i]==arr2[j])
                    System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int arr[]={3,4,6,9};
        int arr2[]={12,3,57,9};
        twoArrayUsingHashMap(arr,arr2);
        naiveApproach(arr,arr2);

    }
}
