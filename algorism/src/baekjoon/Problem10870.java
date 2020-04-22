package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem10870 {
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int number = Integer.parseInt(br.readLine());

         System.out.println(fi(number));
      }

    public static long fi(long n) {

         if(n == 0)
             return 0;

         if(n == 1)
             return 1;

    return fi(n-1) + fi(n - 2);
    }
}
