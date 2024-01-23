public class MaxSubArray {

    public static int maxSubArray(int arr[]){
        if(arr.length==0)
            return 0;

        int maxSum=arr[0];
        int currentSum=arr[0];
        for(int i=1;i<arr.length;i++){
            currentSum=Math.max(arr[i],arr[i]+currentSum);
            maxSum=Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
    public static void main(String[] args){
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }
}
