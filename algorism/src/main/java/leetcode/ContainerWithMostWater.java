package leetcode;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ContainerWithMostWater {
     public static void main(String[] args) {
         Solution solution = new Solution();

        assertThat(solution.maxArea(new int[]{1,8,6,2,5,4,8,3,7})).isEqualTo(49);
      }

    static class Solution {
        public int maxArea(int[] height) {
            int ans = 0;
            for(int i=0; i<height.length-1; i++) {
                int A = height[i];
                for(int j=i+1; j<height.length; j++) {
                    int B = height[j];
                    int count = j-i;

                    if(Integer.min(A,B) * count > ans)
                        ans = Integer.min(A,B) * count;
                }
            }

            return ans;
        }
    }
}
