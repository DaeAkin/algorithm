package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1호2호3호4호
 *  1 5 15 35  O O
 *  1 4 1O 20 O O
 *  1 3 6  10 O O
 *  1 2 3  4  5 6
 */
/** 점화식 r[k][n] = r[k-1][n] + r[k][n-1] **/

public class Problem2775 {

     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] r = new int[15][15];

        for(int i=1; i<15; i++) {
            r[0][i] = i;

        }

        for(int i=1; i<15; i++) {
            for(int j=1; j<15; j++) {
                r[i][j] = r[i-1][j] + r[i][j-1];
            }
        }

         //k층 n호
         int testsCase = Integer.parseInt(br.readLine()); // 테스트케이스
         while(testsCase != 0) {
             testsCase--;
             int k = Integer.parseInt(br.readLine());
             int n = Integer.parseInt(br.readLine());
             System.out.println(r[k][n]);

         }

      }
}
