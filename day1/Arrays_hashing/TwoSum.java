/*
Problem: Two Sum: Return the indices of the two numbers whose sum equals target:
Given array of numbers:
 nums: [2, 7, 11,15]
 target = 9
 Output: [0, 1]  = Indices
*/

// Optimal Solution using HashMap O(n):
// Note: We nee to know what are these efficiencies (Ex: O(n2), O(n) etc)
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

class TwoSum {
   public static void main(String[] args) {
      int[] nums = {2, 7, 11, 15};
      int target = 9;
      System.out.println(Arrays.toString(twoSum(nums, target)));
   }
   
   static int[] twoSum(int[] nums, int target) {
      Map<Integer, Integer> map = new HashMap<>();
      for(int i=0; i<nums.length; i++) {
        int diff = target - nums[i];
        if (map.containsKey(diff)) {
            return new int[]{map.get(diff), i};
        }
        map.put(nums[i], i);
      }
      return new int[]{};
   }
}