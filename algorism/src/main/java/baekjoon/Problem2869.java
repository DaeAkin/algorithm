package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2869 {
    //2 1 5 = 4
    //6 2 12 = 3
    // 2*k-1*k-1 >= 4
    // 100000 99999 100000 = 1

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        long upCount = Long.parseLong(str[0]); // 올라가는 높이
        long downCount = Long.parseLong(str[1]); // 미끄러지는 높이
        long goalCount = Long.parseLong(str[2]); // 올라가야 할 높이

        solution(upCount,downCount,goalCount);

    }

    private static void solution(long upCount, long downCount, long goalCount) {

        // v <= (a-b)n + a 인 n 값을 찾는다.
        // (v-a)/(a-b) <= n
        // n은 달팽이가 올라가기 직전 날이므로, n+1을 출력한다.
        if (goalCount == upCount) System.out.println(1);
        else System.out.println((long) Math.ceil((goalCount - upCount) / (upCount - downCount)) + 1);
    }


}

