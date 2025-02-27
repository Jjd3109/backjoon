package 프로그래머스;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Pro42586 {

	public int[] solution(int[] progresses, int[] speeds) {

		// 귤 크기별 개수를 저장할 HashMap
		//1. 각 기능이 100퍼 센트가 되는 날 진행

		Queue<Integer> complete = new LinkedList();
		List<Integer> result = new ArrayList<>();

		int days = progresses.length;

		for (int i = 0; i < days; i++) {
			int rest = 0;

			if ((100 - progresses[i]) % speeds[i] == 0) {
				rest = (100 - progresses[i]) / speeds[i];
			} else {
				rest = (100 - progresses[i]) / speeds[i] + 1;
			}

			complete.add(rest);

		}

		while (!complete.isEmpty()) {
			int deployDay = complete.poll(); //개발 날
			int count = 1;

			// 현재 배포 날짜보다 작거나 같은 기능들을 함께 배포
			while (!complete.isEmpty() && complete.peek() <= deployDay) {
				complete.poll();
				count++;
			}

			result.add(count);
		}

		int[] answer = result.stream().mapToInt(i -> i).toArray();

		return answer;
	}

}
