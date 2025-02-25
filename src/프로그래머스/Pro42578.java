package 프로그래머스;

import java.util.HashMap;

public class Pro42578 {

	public int solution(String[][] clothes) {
		HashMap<String, Integer> clothesMap = new HashMap<>();

		// 의상 종류별 개수 저장
		for (String[] cloth : clothes) {
			String type = cloth[1];
			clothesMap.put(type, clothesMap.getOrDefault(type, 0) + 1);
		}

		// 경우의 수 계산
		int answer = 1;
		for (int count : clothesMap.values()) {
			answer *= (count + 1); // 안 입는 경우 포함
		}

		return answer - 1;
	}

}
