public class TajMahalEntry {
    public static int ticketWindow(int arr[]){
        int count=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                return count;
            }
            else{
                for(int j=0;j< arr.length;j++){

                    if(arr[j]!=0)
                        arr[j]--;
                }
                count++;
            }

        }
        return count;
    }
    public static int ticketWindowOptimized(int[] arr){
        int t=Integer.MIN_VALUE;
        int index=-1;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int res=(arr[i]-i);
             int val=res/n;
             if(res%n!=0){
                 val++;
             }
            //t=Math.max(t,val);
             if(t<val){
                 index=i+1;
                 t=val;
             }

        }

        return index;
    }


    public static void main(String args[]){
        int arr[]={2,3,2,0};
        System.out.println(ticketWindow(arr));
        System.out.println(ticketWindowOptimized(arr));
    }
}
