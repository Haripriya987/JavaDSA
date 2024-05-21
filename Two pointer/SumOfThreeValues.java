import java.util.Arrays;

public class SumOfThreeValues {

  public static boolean threeSum(int[] arr,int target){
    Arrays.sort(arr);
    
    for(int i=0;i<arr.length-1;i++){

      int start=i+1;
      int end=arr.length-1;

      while(start<end){
        int sum=arr[i]+arr[start]+arr[end];
        if(sum==target)
          return true;
        else if(sum<target)
          start++;
        else
        end--;        
      }
    }


    return true;
  }

  public static void main(String args[]){
      int arr[]={1,3,5,6,7,4};
      System.out.println(threeSum(arr, 18));

  }
  
}
