package 프로그래머스;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pro138476 {

	public int solution(int k, int[] tangerine) {

		// 귤 크기별 개수를 저장할 HashMap
		Map<Integer, Integer> countMap = new HashMap<>();

		// 1. 귤 크기별 개수 카운트
		for (int size : tangerine) {
			countMap.put(size, countMap.getOrDefault(size, 0) + 1);
		}

		// 2. 개수 기준 내림차순 정렬
		List<Integer> counts = new ArrayList<>(countMap.values());
		counts.sort(Collections.reverseOrder());

		// 3. 최소한의 종류로 k개 선택
		int total = 0; // 선택한 귤의 개수
		int answer = 0; // 사용한 귤 크기 개수

		for (int count : counts) {
			total += count;
			answer++;
			if (total >= k) {
				return answer; // 최소한의 귤 종류 개수 반환
			}
		}

		return answer;
	}

}
