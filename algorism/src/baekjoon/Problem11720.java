package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/11720
//숫자의 합
public class Problem11720 {
    //N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
    //입력 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
    //출력 입력으로 주어진 숫자 N개의 합을 출력한다.
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String number = br.readLine();
        Calcurator calcurator = new Calcurator(line, number);
        int result = calcurator.doCal();
        System.out.println(result);

    }

  public static class Calcurator {
        //첫번 째 입력
        Integer line;
        //두번 째 입력
        String number;

        int result = 0;

        public Calcurator(String line, String number) {
            this.line = Integer.parseInt(line);
            this.number = number;
        }

        //나눠줌
        public void splitString() {
            String[] split = number.split("");
            for (int i = 0; i < line ; i++) {
                sum(Integer.parseInt(split[i]));
            }
        }
        // 더해줌
        public int sum(int value) {
            return  result += value;
        }

        //앤드포인트 함수
        public int doCal() {
            splitString();
            return result;
        }
    }

}

