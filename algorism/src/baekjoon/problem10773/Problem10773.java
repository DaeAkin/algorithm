package baekjoon.problem10773;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Problem10773 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        Stack stack = new Stack();

        for (int i = 0; i < count; i++) {
            int number = Integer.parseInt(br.readLine());
            insertNumber(stack, number);
        }

        System.out.println(calculateStack(stack));

    }

    //스택에 넣는 함수
    public static void insertNumber(Stack stack, int number) {
        if (number == 0) {
            if (stack.isEmpty()) {
                return;
            } else {
                stack.pop();
            }
        } else {
            stack.push(number);
        }
    }

    //스택안의 수들을 계산
    public static int calculateStack(Stack stack) {
        return stack.stream().mapToInt(x -> (int) x).sum();
    }
}
