package RecursionProblems;

public class GroupSum6 {
//groupSum6(0, [6, 2, 4, 5], 9) → false
    public static  boolean groupSum6(int start, int[] nums, int target) {
        if(start>=nums.length)
            return  target==0;

        if (nums[start] == 6) {
            return groupSum6(start + 1, nums, target - 6);
        }


        if(groupSum6(start+1,nums,target))
            return true;

        if(groupSum6(start+1,nums,target-nums[start]))
            return true;

        return false;
    }
public static void main(String args[]){
    int arr[]={2,5,6,8};
    System.out.println(groupSum6(0,arr,10));
}
}
