package backjoon.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class back11659 {

	public static void main(String[] arrgs) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int plusNumber = Integer.parseInt(st.nextToken()); // 데이터 개수
		int foreachNumber = Integer.parseInt(st.nextToken()); // 합을 구할 횟수

		long[] arr = new long[plusNumber + 1];
		long[] prefixSum = new long[plusNumber + 1];

		// 배열 입력
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= plusNumber; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			prefixSum[i] = prefixSum[i - 1] + arr[i]; // 누적 합 계산
		}

		// 구간 합 계산
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < foreachNumber; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());

			sb.append(prefixSum[end] - prefixSum[start - 1]).append("\n"); // 구간 합 계산
		}

		System.out.print(sb);

	}
}
