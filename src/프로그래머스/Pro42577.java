package 프로그래머스;

import java.util.Arrays;

public class Pro42577 {

	public boolean solution(String[] phone_book) {
		boolean answer = true;
		// 다른 번호의 접두어인 경우 FALSE, 아니면 RETURN
		// sort를 통해서 순서대로 정렬

		Arrays.sort(phone_book);

		for (int i = 0; i < phone_book.length - 1; i++) {
			if (phone_book[i + 1].startsWith(phone_book[i])) {
				return false;
			}
		}

		return answer;
	}

}
