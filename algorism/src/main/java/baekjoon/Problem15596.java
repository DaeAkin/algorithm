package main.java.baekjoon;

//https://www.acmicpc.net/problem/15596
//정수 N개의 합
public class Problem15596 {

    public class Test {
        long sum(int[] a) {
            long ans = 0;
            for (int i = 0; i < a.length; i++) {
                ans += a[i];
            }
            return ans;
        }
    }

}


