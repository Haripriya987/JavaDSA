import java.util.Arrays;

public class MaximumProfit {

    public static int maximumProfit(int arr[]){
        int buyers=arr.length;
        int max=Integer.MIN_VALUE;
        Arrays.sort(arr);
        for(int i=0;i<buyers;i++){
            int maxNo=buyers-i;
            System.out.println(arr[i]+" "+maxNo+" "+arr[i]*maxNo);
            max=Math.max(max,arr[i]*maxNo);
        }
        return max;
    }

    public static void main(String[] args){
        int arr[]={10,20,15,67,34};
        System.out.println(maximumProfit(arr));


    }
}
