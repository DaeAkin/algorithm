package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/1712
// 손익분기점
// A, B, C는 21억 이하의 자연수
public class Problem1712 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");


        long fixedCost = Long.parseLong(str[0]); // 고정 지출비용
        long notebookMakeCost = Long.parseLong(str[1]); // 노트북 하나 만드는데 비용
        long perNotebookCost = Long.parseLong(str[2]); // 노트북 한개 판매 가격

        long result;

        if (notebookMakeCost >= perNotebookCost) {
            result = -1;
        } else {

            result =  fixedCost / (perNotebookCost - notebookMakeCost) + 1;
// 시간초과 코드
//            while (fixedCost >= (perNotebookCost - notebookMakeCost) * result) {
//                result++;
//            }
        }
        System.out.println(result);


    }
}
