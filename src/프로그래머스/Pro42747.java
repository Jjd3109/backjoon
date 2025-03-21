package 프로그래머스;

import java.util.Arrays;

public class Pro42747 {

	class Solution {
		public static int solution(int[] citations) {
			Arrays.sort(citations); // 오름차순 정렬
			int n = citations.length;

			for (int i = 0; i < n; i++) {
				int h = n - i; // 현재 논문 개수
				if (citations[i] >= h) {
					return h;
				}
			}

			return 0;
		}
	}

}
