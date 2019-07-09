package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
	X가 3으로 나누어 떨어지면, 3으로 나눈다.
	X가 2로 나누어 떨어지면, 2로 나눈다.
	1을 뺀다.
	정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.
 */
// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18
// 0 1 1 2 2 1 2
public class Problem1463 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int target = Integer.parseInt(br.readLine());
		int result = 0;

		while (target != 1) {
			System.out.println("target :" + target);

			if (target % 3 == 0) {
				target = target / 3;
				result++;
				continue;
			} else if (target % 2 == 0) {
				target = target / 2;
				result++;
				continue;
			} else {
			target--;
			result++;
			}

		}
		
		System.out.println("result :" + result);

	}
}
