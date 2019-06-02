package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.Media;

public class Problem5585 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int money = 1000 - Integer.parseInt(br.readLine());

		List<Integer> changes = new ArrayList<>();

		changes.add(500);
		changes.add(100);
		changes.add(50);
		changes.add(10);
		changes.add(5);
		changes.add(1);

		int result = 0;

		for (Integer change : changes) {
			result += (money / change);
			money -= (money / change) * change;
			// 돈이 0원 되면 나머지 루프를 돌지 않고 빠져나온다.
			if (money == 0)
				break;
		}
		System.out.println(result);
	}

}
