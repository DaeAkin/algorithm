package leetcode;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Problem3Sum {
    public static void main(String[] args) {
       Solution solution = new Solution();

        assertThat(solution.threeSum(new int[]{-1,0,1,2,-1,-4})).isEqualTo(Arrays.asList(Arrays.asList(-1,-1,2), Arrays.asList(-1,0,1)));
        assertThat(solution.threeSum(new int[]{})).isEqualTo(Arrays.asList());
        assertThat(solution.threeSum(new int[]{0})).isEqualTo(Arrays.asList());
    }
    static class Solution {
        public List<List<Integer>> threeSum(int[] nums) {

            return null;
        }
    }
}
