package baekjoon.problem4949;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//https://www.acmicpc.net/problem/4949
//균형잡힌 세상
public class Problem4949 {

    private static char[] indicator = {'[', ']', '{', '}'};

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();
            //종료조건
            if (str.equals(".")) {
                return;
            }
            if (InspectString(str)) {
                System.out.println("yes");
            } else {
                System.out.println("false");
            }
        }


    }

    public static boolean InspectString(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (IsIndicator(ch)) {
                stack.push(ch);
            }
        }
        return Validation(stack);
    }

    public static boolean IsIndicator(char ch) {
        for (int i = 0; i < indicator.length; i++) {
            if (ch == indicator[i]) {
                return true;
            }
        }
        return false;
    }

    //Validation
    public static boolean Validation(Stack stack) {
        return LengthValidation(stack);
    }

    public static boolean MainCheck(Stack stack) {
        return true;
    }

    public static boolean LengthValidation(Stack stack) {
        return stack.size() % 2 == 0 ? true : false;
    }

    //[()()(())[]]]


}

class SquareBracket {
    String mean;

}

