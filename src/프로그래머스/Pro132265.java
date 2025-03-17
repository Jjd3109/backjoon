package 프로그래머스;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Pro132265 {

	public int solution(int[] topping) {

		int answer = 0;
		// 토핑 개수를 저장하는 Map
		Map<Integer, Integer> rightMap = new HashMap<>();
		Set<Integer> leftSet = new HashSet<>();

		// 1. 전체 토핑 개수를 먼저 계산
		for (int t : topping) {
			rightMap.put(t, rightMap.getOrDefault(t, 0) + 1);
		}

		// 2. 한 조각씩 옮기면서 개수 비교
		for (int i = 0; i < topping.length; i++) {
			int t = topping[i];

			// 왼쪽에 추가
			leftSet.add(t);

			// 오른쪽에서 제거
			rightMap.put(t, rightMap.get(t) - 1);
			if (rightMap.get(t) == 0) {
				rightMap.remove(t);
			}

			// 두 집합의 크기가 같으면 경우의 수 증가
			if (leftSet.size() == rightMap.size()) {
				answer++;
			}
		}

		return answer;
	}

}
