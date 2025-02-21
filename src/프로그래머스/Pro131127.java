package 프로그래머스;

import java.util.HashMap;

public class Pro131127 {

	class Solution {
		public int solution(String[] want, int[] number, String[] discount) {
			int answer = 0;

			//일정금액 지불시 회원 자격... 10일동안 회원 자격 부여
			//10일동안 최대한 많이 살 수 있게 정리

			//1. want 원하는 음식 / number 숫자
			//2. hashMap 배열을 만들어서 각 배열에 값을 넣어주기
			HashMap<String, Integer> discountTotal = new HashMap<>();

			int count = 0;

			while (count <= discount.length - 10) {
				for (int i = count; i < count + 10; i++) {
					//그 전에 값이 있으면 거기에 + 1 아니면 새로 만들어서 + 1

					if (discountTotal.get(discount[i]) == null) {
						discountTotal.put(discount[i], 1);
					} else {
						Integer keyValue = discountTotal.get(discount[i]);
						discountTotal.put(discount[i], keyValue + 1);
					}

				}

				int wantCount = 0;

				for (int i = 0; i < want.length; i++) {

					String wantKey = want[i];

					//몇개를 충족시키는가?
					Integer keyCount = discountTotal.get(wantKey);

					int value = 0;

					if (keyCount != null) {
						value = number[i] - keyCount;
					}

					if (value != 0 || keyCount == null) {

						break;
					}

					wantCount += 1;
				}

				if (wantCount == want.length) {
					answer += 1;
				}
				discountTotal.clear();

				count += 1;

			}

			return answer;
		}
	}

}
