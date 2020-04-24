package baekjoon;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Problem15651 {

    static int N;
    static int M;
    static Stack<Integer> alreadyIn;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        alreadyIn = new Stack<>();
        recur("", 0);
        System.out.println(sb.toString());
    }

    public static void recur(String str, int number) {

        if (number == M) {
            sb.append(str.trim() + "\n");
        } else {
            number++;
            for (int i = 1; i <= N; i++) {

                    alreadyIn.push(i);
                    recur(str + " " + i, number);
                    alreadyIn.pop();

            }
        }

    }
}
