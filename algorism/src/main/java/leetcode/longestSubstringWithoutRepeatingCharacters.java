package leetcode;

import java.util.ArrayList;
import java.util.List;

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

// 내 정답
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
