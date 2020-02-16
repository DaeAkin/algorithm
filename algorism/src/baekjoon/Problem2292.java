package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2292 {
    // 1 + 6 + 12 + 18
    // 1 + 6*1 + 6*2 + 6*3
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String n = br.readLine();

         System.out.println(solution(Integer.parseInt(n)));

      }

      public static int solution(int n) {
         int k = 1;
         int i = 2;
         if(n == 1)
             return k;

         while(i <= n) {
             i += 6*k++;
         }

         return k;


      }
}
