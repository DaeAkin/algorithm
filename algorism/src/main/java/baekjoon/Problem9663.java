package baekjoon;

import java.util.Scanner;

/*
    N-Queen 문제는 크기가 N × N인 체스판 위에 퀸 N개를 서로 공격할 수 없게 놓는 문제이다.
    N이 주어졌을 때, 퀸을 놓는 방법의 수를 구하는 프로그램을 작성하시오.
 */
public class Problem9663 {

    static int N;
    static boolean[][] chessBoard;
    static int result = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        chessBoard = new boolean[N][N];
        dfs(0);
        System.out.println(result);

    }

    public static boolean isValid(int i, int cnt) {
        //같은 열 체크
        for(int y=0; y<cnt; y++) {
            if(chessBoard[i][y])
                return false;
        }

        //왼쪽 대각선 체크
        for(int x=i,y=cnt; x>=0 && y>=0; x--,y-- ) {
            if(chessBoard[x][y] )
                return false;
        }
        //오른쪽 대각선 체크
        for(int x=i,y=cnt; y<N && y>=0 && x<N; x++,y-- ) {
            if(chessBoard[x][y])
                return false;
        }

        return true;
    }

    public static void dfs(int cnt) {

        if (cnt == N) {
            result++;
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!chessBoard[i][cnt] && isValid(i, cnt)) {
                chessBoard[i][cnt] = true;
                dfs(cnt + 1);
                chessBoard[i][cnt] = false;
            }

        }
    }


}
