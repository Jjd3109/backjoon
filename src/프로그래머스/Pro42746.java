package 프로그래머스;

import java.util.Arrays;

public class Pro42746 {

	public String solution(int[] numbers) {
		String[] strNumbers = Arrays.stream(numbers)
			.mapToObj(String::valueOf)
			.toArray(String[]::new);

		// 2. 정렬 기준: (X + Y) vs (Y + X)
		Arrays.sort(strNumbers, (a, b) -> (b + a).compareTo(a + b));

		// 3. "000"처럼 모든 숫자가 0이면 "0" 반환
		if (strNumbers[0].equals("0"))
			return "0";

		// 4. 정렬된 숫자들을 이어붙여 반환
		return String.join("", strNumbers);

	}

}
