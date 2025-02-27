package 프로그래머스;

import java.util.Stack;

public class Pro12906 {

	public int[] solution(int[] arr) {

		int[] answer = {};

		Stack<Integer> stack = new Stack<>();

		for (int num : arr) {
			if (stack.size() == 0 || stack.peek() != num) {
				stack.push(num);
			}
		}

		answer = stack.stream().mapToInt(i -> i).toArray();

		return answer;
	}

}
