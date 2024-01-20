package RecursionProblems;

public class FindGroupSum {
    public static boolean groupSum(int start,int arr[],int target){
        if(start>=arr.length)
            return target==0;

        if(groupSum(start+1,arr,target))
            return true;

        if(groupSum(start+1,arr,target-arr[start]))
            return true;


        return false;
    }

    public static void main(String args[]){
        int arr[]={2,4,8};
        System.out.println(groupSum(0,arr,10));
    }
}
