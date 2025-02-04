package 프로그래머스;

import java.util.HashMap;

public class Pro42576 {

	public String solution(String[] participant, String[] completion) {
		String answer = "";

		//1. participant에 hashmap 생성
		//2. completion이 나올때마다 1번의 함수에서 하나씩 제거
		//3. endPeople에서 1인 함수 찾기

		HashMap<String, Integer> endPeople = new HashMap<>();

		for (String value : participant) {
			endPeople.put(value, endPeople.getOrDefault(value, 0) + 1);
		}

		for (String value : completion) {
			int i = endPeople.get(value) - 1;
			endPeople.put(value, i);
		}

		for (String key : endPeople.keySet()) {
			if (endPeople.get(key) == 1) {
				answer = key;
			}
		}
		return answer;
	}

}
