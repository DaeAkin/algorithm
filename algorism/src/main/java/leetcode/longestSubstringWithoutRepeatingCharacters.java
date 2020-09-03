package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class longestSubstringWithoutRepeatingCharacters {
     public static void main(String[] args) {

         Solution solution = new Solution();

         assertThat(solution.lengthOfLongestSubstring("abcabcbb")).isEqualTo(3);

         assertThat(solution.lengthOfLongestSubstring("bbbb")).isEqualTo(1);

         assertThat(solution.lengthOfLongestSubstring("pwwkew")).isEqualTo(3);

         assertThat(solution.lengthOfLongestSubstring("")).isEqualTo(0);

         assertThat(solution.lengthOfLongestSubstring(" ")).isEqualTo(1);

         assertThat(solution.lengthOfLongestSubstring("a")).isEqualTo(1);
     }

     //더더 좋은 정답
    //Sliding Window를 최적화 한 방법으로, 복잡도가 O(n) 나온다.
     static class BetterBetterSolution {
         public int lengthOfLongestSubstring(String s) {
             int n = s.length(), ans = 0;
             int[] index = new int[128]; // current index of character
             // try to extend the range [i, j]
             for (int j = 0, i = 0; j < n; j++) {
                 i = Math.max(index[s.charAt(j)], i);
                 ans = Math.max(ans, j - i + 1);
                 index[s.charAt(j)] = j + 1;
             }
             return ans;
         }
     }

     //더 좋은 정답
    // Sliding Window 이라는데 시간복잡도가 O(2n) 밖에 안나온다.
     static class BetterSolution {
         public int lengthOfLongestSubstring(String s) {
             int n = s.length();
             Set<Character> set = new HashSet<>();
             int ans = 0, i = 0, j = 0;
             while (i < n && j < n) {
                 // try to extend the range [i, j]
                 if (!set.contains(s.charAt(j))){
                     set.add(s.charAt(j++));
                     ans = Math.max(ans, j - i);
                 }
                 else {
                     set.remove(s.charAt(i++));
                 }
             }
             return ans;
         }
     }

// 내 정답 O(n^2)
      static class Solution {
          public int lengthOfLongestSubstring(String s) {

              if(s.length() == 0) {
                  return 0;
              }

              int result = 1;
              int currentResult = 1;
              List<Character> explored = new ArrayList<>();

              char[] chars = s.toCharArray();

              for(int i=0; i<chars.length-1; i++) {

                  explored.add(chars[i]);

                  for(int j=i+1; j<chars.length; j++) {

                      if(explored.contains(chars[j]))
                          break;
                      explored.add(chars[j]);
                      currentResult++;

                  }

                  if(currentResult > result)
                      result = currentResult;

                  explored = new ArrayList<>();
                  currentResult = 1;
              }

                  return result;
          }
      }
}
