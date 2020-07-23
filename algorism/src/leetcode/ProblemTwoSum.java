package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ProblemTwoSum {

     public static void main(String[] args) {
        Solution solution = new Solution();
         int nums[] = new int[]{1,7,8,15};
         int nums2[] = new int[]{3,2,4};
         int nums3[] = new int[]{0,4,3,0};
         int[] result = solution.twoSum(nums3, 0);
         System.out.println(result[0] + " :: " + result[1]);
     }

     // 공간복잡도 O(1) 시간복잡도 (n의제곱)
    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            for(int i=0; i<nums.length; i++) {

                for(int j = i+1; j<nums.length; j++) {
                    if(nums[i] + nums [j] == target) {
                        return new int[]{i,j};
                    }
                }
            }
            return new int[2];
        }
    }
    //Runtime: 51 ms, faster than 35.18% of Java online submissions for Two Sum.
    //Memory Usage: 39.8 MB, less than 26.08% of Java online submissions for Two Sum.

    //시간복잡도가 n으로 됨.
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
