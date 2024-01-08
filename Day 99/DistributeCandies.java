public class DistributeCandies {
    public static int maxCandies(int[] arr,int k){
        int maxCount=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){//max value
            max=Math.max(arr[i],max);
        }
        for(int i=1;i<=max;i++){//0(m)
            int students=0;
            for(int j=0;j< arr.length;j++){//
                if(arr[j]>=i){
                    students+=(arr[j]/i);
                }

            }

            if(students>=k){
                maxCount=i;
            }
            if(students<k){
                break;
            }

        }

        return maxCount;
    }
    public static int maxCandiesOptimize(int arr[],int k){
        int maxCount=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            max=Math.max(arr[i],max);
        }
        int start=1;
        int end=max;
        while(start<=end){
            int mid=(start+end)/2;
            int stu=0;

            for(int j=0;j<arr.length;j++){
                if(arr[j]>=mid){
                    stu+=(arr[j]/mid);
                }
            }
            if(stu>=k){
                maxCount=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            
        }

        return maxCount;
    }


   public  static void main(String args[]){
        int arr[]={3,2,3,9};
        System.out.println(maxCandies(arr,2));
       System.out.println(maxCandiesOptimize(arr,2));
   }
}
