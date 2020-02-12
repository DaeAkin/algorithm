package baekjoon;

import java.util.ArrayList;
//셀프넘버
//https://www.acmicpc.net/problem/4673
public class Problem4673 {

    public static void main(String[] args) {
        SelfNumber selfNumber = new SelfNumber(10000);
        selfNumber.start();
        selfNumber.printResultNumber();
    }

}

class SelfNumber {

	private int number;
	private ArrayList<Integer> list;

	public SelfNumber(int number) {
		this.number = number;
		list = new ArrayList<>();
	}

	//시작함수
	public void start() {
		makeAndAddNumber();
	}

	// 1부터 number 까지 셀프넘버가 아닌 숫자를 만든다.
	private int makeSelfNumber(int value) {
        int result = value;
		String[] split = String.valueOf(value).split("");
		for (int i = 0; i < split.length; i++) {
            value += Integer.parseInt(split[i]);
        }
        return value;
    }
	// 셀프 넘버가 아닌 숫자를 list에 넣는다.
    private void makeAndAddNumber() {
		for (int i = 1; i <= number; i++) {
			int value = makeSelfNumber(i);
			if (value > number)
				continue;
			list.add(value);
		}
	}

	// 1~number 까지 list와 비교하며 셀프넘버를 출력한다.
	public void printResultNumber() {
		for (Integer i = 1; i <= number; i++) {
			if (list.contains(i)) {
				list.remove(i);
			} else {
				System.out.println(i);
			}
		}
	}
}
