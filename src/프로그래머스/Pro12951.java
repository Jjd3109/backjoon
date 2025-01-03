package 프로그래머스;

public class Pro12951 {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean isFirstChar = true; // 단어의 첫 문자인지 확인

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                answer.append(c); // 공백은 그대로 추가
                isFirstChar = true; // 다음 문자가 단어의 첫 문자
            } else if (isFirstChar) {
                answer.append(Character.toUpperCase(c)); // 첫 문자는 대문자로
                isFirstChar = false; // 단어의 첫 문자 처리 완료
            } else {
                answer.append(Character.toLowerCase(c)); // 나머지는 소문자로
            }
        }

        return answer.toString();
    }

}
