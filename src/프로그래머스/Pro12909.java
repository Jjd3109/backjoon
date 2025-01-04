package 프로그래머스;

import java.util.Stack;

public class Pro12909 {

    public boolean solution(String s) {
        boolean answer = true;

        Stack<String> stack = new Stack<>();

        int value = 0;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            //1. 첫번째가 ) 일경우 무조건 false
            if(i == 0){
                if(c != '('){
                    return false;
                }
            }

            if(value == -1){
                return false;
            }

            //2. 숫자를 셌을때 ( 가 나온 수에 비해서 ) 가 먼저 나오면 안된다! 생각해보자...
            if (c == '(') {
                stack.push(String.valueOf(c));
                value += 1;
            }

            if (c == ')'){
                stack.push(String.valueOf(c));
                value -= 1;
            }

        }

        if(value != 0){
            return false;
        }

        return true;
    }
}
