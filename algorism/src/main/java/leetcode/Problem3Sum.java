package leetcode;

import java.util.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
/*
Runtime: 1153 ms, faster than 5.00% of Java online submissions for 3Sum.
Memory Usage: 167.5 MB, less than 5.01% of Java online submissions for 3Sum.
 */
public class Problem3Sum {
    public static void main(String[] args) {
        Solution solution = new Solution();

        assertThat(solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4})).isEqualTo(Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1)));
        assertThat(solution.threeSum(new int[]{})).isEqualTo(Arrays.asList());
        assertThat(solution.threeSum(new int[]{0})).isEqualTo(Arrays.asList());

    }

    static class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Set<List<Integer>> res = new HashSet<>();
            if (nums.length == 0) return new ArrayList<>(res);
            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 2; i++) {
                int j = i + 1;
                int k = nums.length - 1;
                while (j < k) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum == 0) res.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                    else if (sum > 0) k--;
                    else if (sum < 0) j++;
                }

            }
            return new ArrayList<>(res);

        }
    }
}
