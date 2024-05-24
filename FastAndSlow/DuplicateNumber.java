package FastAndSlow;

public class DuplicateNumber {

  public static int findDuplicate(int nums[]){
    int fast=nums[0];
    int slow=nums[0];

    while(true){
      slow=nums[slow];
      fast=nums[nums[fast]];

      if(slow==fast){
        break;
      }
    }

    slow=nums[0];
    while (slow!=fast) {
      slow=nums[slow];
      fast=nums[fast];
    }

    return fast;

  }
  
  public static void main(String[] args){

    int nums[]={1,3,2,3,5,4};
    System.out.println(findDuplicate(nums));

  }

}
