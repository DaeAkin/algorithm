package leetcode;

import java.util.ArrayList;
import java.util.List;



public class longestSubstringWithoutRepeatingCharacters {
     public static void main(String[] args) {

         Solution solution = new Solution();

         int result = solution.lengthOfLongestSubstring("abcabcbb");
         System.out.println(result);

         int result2 = solution.lengthOfLongestSubstring("bbbb");
         System.out.println(result2);

         int result3 = solution.lengthOfLongestSubstring("pwwkew");
         System.out.println(result3);

         int result4 = solution.lengthOfLongestSubstring("");
         System.out.println(result4);

         int result5 = solution.lengthOfLongestSubstring(" ");
         System.out.println(result5);

         int result6 = solution.lengthOfLongestSubstring("a");
         System.out.println(result6);



     }


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
