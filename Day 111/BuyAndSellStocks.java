public class BuyAndSellStocks {

    public static int maxProfit2(int arr[]){
        int max=0;
        int minstocks[]=new int[arr.length];
        minstocks[0]=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
           min=Math.min(arr[i],min);
           minstocks[i]=min;

        }
        for(int i=0;i<arr.length;i++){
            int diff=arr[i]-minstocks[i];
            max=Math.max(diff,max);
        }

        if(max==0)
            max=-1;


        return max;
    }

    public static int maxProfit(int arr[]) {


        int min = arr[0];
        int maxProfit = 0;

        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            int currentProfit = arr[i] - min;
            maxProfit = Math.max(maxProfit, currentProfit);
        }

        if(maxProfit==0)
            return -1;

        return maxProfit;
    }


    public static void main(String args[]){
        int arr[]={2,3,10,5,7};
        System.out.println(maxProfit(arr));
    }
}
