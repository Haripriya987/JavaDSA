//import java.util.HashMap;
import java.util.Arrays;
import java.util.HashSet;

public class MinDifference {

    public static void findPair(int[] arr,int n,int diff){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j)
                    continue;
                if(arr[i]-arr[j]==diff){
                    System.out.println(arr[i]+" "+arr[j]+" 1");
                    return;
                }

            }
        }
        System.out.println("No Such Pair");
    }
    public static void findPairSecond(int[] arr,int n,int diff) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++){
            int value=Math.abs(arr[i]-diff);
            if(hs.contains(value)){
                System.out.println(arr[i]+" "+value+" 2");
                return;
            }
            else{
                hs.add(arr[i]);
            }

        }

        System.out.println("No Such Pair");
    }
    public static void findPairThird(int[] arr,int n,int diff) {

        diff=Math.abs(diff);
        Arrays.sort(arr);
        int i=0;
        int j=1;
        while(i<n && j<n){
            int value=arr[j]-arr[i];
            if(value==diff && i!=j){
                System.out.println(arr[i]+" "+arr[j]);
                return;
            }
            else if(value>diff)
                i++;

            else
                j++;

        }

        System.out.println("No pair Found");
    }

        public static void main(String args[]){

        int arr[]={1,3,4,19,12};
        int diff=8;
        findPair(arr,5,diff);
            findPairSecond(arr,5,diff);
            findPairThird(arr,5,diff);

        }
}
