package baekjoon;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Problem15652 {

    static int N;
    static int M;
    static Stack<Integer> alreadyIn;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        alreadyIn = new Stack<>();
        recur("", 0,1);
        System.out.println(sb.toString());
    }

    public static void recur(String str, int number,int in) {

        if (number == M) {
            sb.append(str.trim() + "\n");
        } else {
            number++;
            for (int i = in; i <= N; i++) {
                alreadyIn.push(i);
                recur(str + " " + i, number,i);
                alreadyIn.pop();

            }
        }

    }
}

