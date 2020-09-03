package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 이동거리   이동량      횟수
// 1          1         1  V
// 2 		 11         2  V
// 3         111        3  V
// 4         121        3
// 5         1211       4  V
// 6         1221       4
// 7         12211      5  V
// 8         12221      5
// 9         12321      5
//10         123211     6  V
//16					7
public class Problem1011 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] xy = br.readLine().split(" ");
            long x = Long.parseLong(xy[0]);
            long y = Long.parseLong(xy[1]);
            solution(x, y);
        }
    }

    public static void solution(long x, long y) {
        int result = 0;
        int pos = 1;
        int pos_count = 2;
        long distance = y - x;

        while (distance > 0) {
            if (pos_count == 0) {
                pos++;
                pos_count = 2;
            }
            distance -= pos;
            pos_count--;
            result++;

        }
        System.out.println(result);


    }
}
