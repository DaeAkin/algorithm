package baekjoon;

import java.util.Scanner;

public class Problem2941 {
	//크로아티아 알파벳 선언
	static String[] croatiaAlphabat = {"c=","c-","dz=","d-","lj","nj","s=","z="};

	public static void main(String[] args) {
		
 /* 주의 해야 될것 
  * 1. 크로아티아 알파벳 짜르고 붙이면 붙인 문자열이 또 다른 크로아티아 알파벳이 될 수 있음 ex) nljj
  * 2. c=c= 와 같은 두개의 동일한 크로아티아 알파벳 들어갔을 경우 처리해주기.
  */
		Scanner s = new Scanner(System.in);
		String test = s.nextLine();
		System.out.println(resultCroatiaAlphabat3(test));
	}
	
	static private int resultCroatiaAlphabat3(String test) {
		String[] testArray; // split된거 담을 변수
		String concatString = test; // 공백없는 문자열
		String inputString = test;// 비교당할 문자열 " "공백넣어줘서 구별
		int result = 0;
		
		for (String croatiaAlphabats : croatiaAlphabat) {

			if(inputString.contains(croatiaAlphabats)) {
				testArray = test.split(croatiaAlphabats);
				concatString = "";
				for (String string : testArray) {
					concatString += string + " ";	
				}

				int resultLength = (test.length() - concatString.replaceAll(" ", "").length() ) / croatiaAlphabats.length();
				inputString = concatString;
				test = concatString.replaceAll(" ", "");
				result += resultLength;
			}
		}
		return concatString.replaceAll(" ", "").length() + result;
	}
	


}
