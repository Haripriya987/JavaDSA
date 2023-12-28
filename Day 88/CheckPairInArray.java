public class CheckPairInArray {
    public static boolean checkPair(int arr[],int target){//0(n)
        int i=0;
        int n=arr.length;
        for(i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1])
                break;
        }
        int right=i;
        int left=(i+1)%n;CheckPairInArray

        while(left!=right){
            if(arr[left]+arr[right]==target)
                return true;
            if(arr[left]+arr[right]<target)
                left=(left+1)%n;
            else
                right=(right-1+n)%n;

        }
        return false;


    }

    public static void main(String args[]){
        int arr[]={11,15,6,8,9,10};
        int target=34;
        System.out.println(checkPair(arr,target));
    }
}
