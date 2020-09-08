package leetcode;

import static org.assertj.core.api.Assertions.assertThat;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        Solution solution = new Solution();

        assertThat(solution.longestPalindrome("babad")).isEqualTo("bab");

        assertThat(solution.longestPalindrome("cbbd")).isEqualTo("bb");

        assertThat(solution.longestPalindrome("annaba")).isEqualTo("anna");

        assertThat(solution.longestPalindrome("a")).isEqualTo("a");
//
        assertThat(solution.longestPalindrome("ac")).isEqualTo("a");
//
        assertThat(solution.longestPalindrome("bb")).isEqualTo("bb");

    }

    static class Solution {
        public String longestPalindrome(String s) {
            if(s.length() <= 1) {
                return s;
            }
            String ans = "";
            for (int i = 0; i < s.length() - 1; i++) {
                StringBuilder temp = new StringBuilder();
                temp.append(s.charAt(i));
                for (int j = i + 1; j < s.length(); j++) {
                    if (isPalindrome(temp.toString()) && ans.length() < temp.length())
                        ans = temp.toString();

                    temp.append(s.charAt(j));

                }
                if (isPalindrome(temp.toString()) && ans.length() < temp.length())
                    ans = temp.toString();
            }


            return ans;
        }

        private boolean isPalindrome(String s) {
            if(s.length() == 1)
                return true;

            StringBuilder sb = new StringBuilder();


            for (int i = s.length() - 1; i >= 0; i--) {
                sb.append(s.charAt(i));

            }

            return sb.toString().equals(s);
        }
    }
}
