package 프로그래머스;

public class Pro70129 {

    public int[] solution(String s) {
        int[] answer = {0,0};

        //1. x의 모든 0을 제거
        //2. 제거한 다음에 길이를 c 라고 하면 c를 2진법으로 표현한 문자열 로 바꾼다 !!


        int c = 0;

        while(!s.equals("1")){

            answer[0] += 1;

            for(int i = 0; i < s.length(); i++){

                if(s.charAt(i) == '0'){
                    answer[1] += 1;
                    //0을 제거한 갯수

                }else{
                    c += 1; //0이아니면 숫자 1씩추가
                }

            }

            s = Integer.toBinaryString(c);
            c = 0;
        }

        return answer;
    }
}
