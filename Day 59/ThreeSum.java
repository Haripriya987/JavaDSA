import java.util.Arrays;
import java.util.HashMap;

public class ThreeSum{
    public static  int  threeSum(int[] nums, int sum) {
        int count=0;
            for (int i = 0; i < nums.length - 2; i++) {
                int target = sum - nums[i];
                HashMap<Integer, Integer> map = new HashMap<>();

                for (int j = i + 1; j < nums.length; j++) {
                    int complement = target - nums[j];

                    if (map.containsKey(complement)) {
                        System.out.println("Triplet: " + nums[i] + ", " + nums[j] + ", " + complement);
                        count++;
                    }

                    map.put(nums[j], j);
                }
            }

            return count;
        }

        public static void main(String[] args) {
            int[] nums = {1, 2, 3, 4, 5, 6, 7};
            int targetSum = 13;

            System.out .println(threeSum(nums, targetSum));
        }
    }

