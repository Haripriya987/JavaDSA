
import java.util.HashMap;

public class TwoSum {
    public void findAndPrintPairs(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        insertArrayValuesToHashMap(nums, map);
        int count=0;

        for (int num : nums) {
            int complement = target - num;

            if (map.containsKey(complement)) {
                System.out.println("Pair: " + num + ", " + complement);
                count++;
            }

        }
        System.out.println(count);
    }
    public void differenceInPairs(int[] nums,int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        insertArrayValuesToHashMap(nums, map);
        int count=0;
        for(int num:nums){
            if(map.containsKey(num-target)) {
                count++;
                System.out.println("Pair: " +num+" "+(num-target));
            }
            if(map.containsKey(num+target)){
                count++;
                System.out.println(num+" "+(num+target));
            }

        }
        System.out.println(count);

    }

    private static void insertArrayValuesToHashMap(int[] nums, HashMap<Integer, Integer> map) {
        for(int i: nums){
            map.put(i,1);
        }
    }

    public static void main(String[] args) {
        TwoSum s= new TwoSum();
        int[] nums = {2, 7, 11, 15,3,0,1,4,12,5,8,4,3,6,3,7};
        int target = 4;
        int difftarget=13;
        s.findAndPrintPairs(nums, target);
        s.differenceInPairs(nums,difftarget);

    }
}
