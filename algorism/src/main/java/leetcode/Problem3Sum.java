package leetcode;

import org.assertj.core.util.Lists;
import org.assertj.core.util.Sets;

import java.util.*;
import java.util.stream.Collectors;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.Assert.assertThat;

public class Problem3Sum {
    public static void main(String[] args) {
        Solution solution = new Solution();

//        assertThat(solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4})).isEqualTo(Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1)));
        assertThat(solution.threeSum(new int[]{})).isEqualTo(Arrays.asList());
        assertThat(solution.threeSum(new int[]{0})).isEqualTo(Arrays.asList());
        assertThat(solution.threeSum(new int[]{0,0,0})).isEqualTo(Arrays.asList(0,0,0));
    }

    static class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new ArrayList<>(new HashSet<>());

            for (int i = 0; i < nums.length; i++) {
                int x = nums[i];

                List<Integer> twoSumZeroWithX = findTwoSumZeroWithX(x, nums);
                if(!twoSumZeroWithX.isEmpty())
                    result.add(twoSumZeroWithX);

            }
            return result.stream().distinct()
                    .collect(Collectors.toCollection(ArrayList::new));
        }

        static List<Integer> findTwoSumZeroWithX(int x, int[] nums) {
            List<Integer> result = new ArrayList<Integer>();
            for (int i = 0; i < nums.length; i++) {
                int y = nums[i];
                if (y == x)
                    continue;

                for (int j = i + 1; j < nums.length - 1; j++) {
                    int z = nums[j];

                    if(x + y + z == 0) {
                        result.add(x);
                        result.add(y);
                        result.add(z);
                        Collections.sort(result);
                        return result;
                    }

                }

            }

            return result;
        }
    }
}
