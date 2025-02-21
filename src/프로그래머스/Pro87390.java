package 프로그래머스;

public class Pro87390 {

	public int[] solution(int n, long left, long right) {

		int size = (int)(right - left + 1);
		int[] answer = new int[size];

		for (long idx = left; idx <= right; idx++) {
			int row = (int)(idx / n);  // i 위치
			int col = (int)(idx % n);  // j 위치
			answer[(int)(idx - left)] = Math.max(row, col) + 1;
		}

		return answer;
	}

}
