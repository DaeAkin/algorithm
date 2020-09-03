package baekjoon.problem15649;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

//수열 만들기
// 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
// 백트레킹 문제. 어려웠다. ㅠ
//1 2 3 4 5
public class Problem15649 {

    static int N;
    static int M;
    static Stack<Integer> alreadyIn;
    static StringBuilder sb = new StringBuilder();
     public static void main(String[] args) throws IOException {
         Scanner sc = new Scanner(System.in);
         N = sc.nextInt();
         M = sc.nextInt();
          alreadyIn = new Stack<>();
          recur("",0);
          System.out.println(sb.toString());
      }

      public static void recur(String str , int number) {

         if(number == M) {
             sb.append(str.trim() + "\n");
         } else {
             number++;
             for(int i = 1; i<=N; i++) {
                 if(!alreadyIn.contains(i)) {
                     alreadyIn.push(i);
                     recur(str + " " + i, number);
                     alreadyIn.pop();
                 }
             }
         }

      }



        /*
            1 2 3 4 5
            1 2 3 5 4
            1 2 4 3 5
            1 2 4 5 3
            1 2 5 3 4
            1 2 5 4 3
         */


}
