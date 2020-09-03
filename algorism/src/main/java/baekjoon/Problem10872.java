package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem10872 {
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         long number = Integer.parseInt(br.readLine());
            System.out.println(factorial(number));
      }

      public static long factorial(long number) {
         if(number == 1)
             return 1;

         if(number == 0) {
             return 1;
         }
         return number * factorial(number-1);
      }
}
