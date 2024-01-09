public class MomosMarket {

    public static void momosAndBalance(int arr[],int days,int amount){
        //int res[]=new int[2];

        int j=0;
            for(;j< arr.length;j++){
                if(amount<arr[j]){
                 break;
                }
                amount-=arr[j];
        }
            System.out.println(j+" "+amount);

    }
    public static void momsBalanceOptimize(int arr[],int days,int amount){

        int prefixsum[]=new int[arr.length];
        int value=0;
        for(int i=0;i<arr.length;i++){
            value+=arr[i];
            prefixsum[i]=value;
        }
        int start=0;
        int end= prefixsum.length;
        while(start<=end){
            int mid=(start+end)/2;

            if(prefixsum[mid]<amount){
                if(prefixsum[mid+1]>amount){
                    System.out.println(mid+1+" "+(amount- prefixsum[mid]));
                    break;
                }
                start=mid+1;
            } else if (prefixsum[mid]>amount) {
                if(prefixsum[mid-1]<amount){
                    System.out.println(mid+1+" "+(amount- prefixsum[mid-1]));
                    break;
                }

            }
            else{
                System.out.println(mid+1+" "+0);
                break;
            }

        }


    }


    public static void main(String[] args){
        int arr[]={2,1,4,3,6,5};
        int days=1;
        System.out.println("No of Momos" + " " + "Balance amount ");
        momosAndBalance(arr,days,11);
        System.out.println("No of Momos 2" + " " + "Balance amount ");
        momsBalanceOptimize(arr,days,11);

    }
}
