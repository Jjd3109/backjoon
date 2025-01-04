package 프로그래머스;

public class Pro12924 {

    class Solution {
        public int solution(int n) {
            int answer = 0;
            //자연수 n을 연속한 자연수들로 표현하는 방법

            int plusNumber = 0;
            int j = 1;

            int devineValue = n / 2;



            while(j <= devineValue){

                for(int i = j; i <= n; i++){
                    plusNumber += i;

                    if(plusNumber == n){
                        answer += 1;
                        break;
                    }
                    if(plusNumber > n){
                        break;
                    }
                }

                plusNumber = 0;
                j += 1;
            }



            return answer + 1;


        }
    }
}
