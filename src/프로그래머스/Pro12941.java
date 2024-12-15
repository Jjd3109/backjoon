package 프로그래머스;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Pro12941 {

    public int solution(int[] a, int[] b){

        //길이가 같은 배열 A, B
        // A = [1, 4, 2]
        // B = [5, 4, 4]

        //A에서 첫번째 숫자인 1 , 5 ...
        int answer = 0;
        Arrays.sort(a);
        Arrays.sort(b);


        for(int i = 0; i < a.length; i++){
            answer += a[i] * b[a.length -1 - i];
        }


        return answer;
    }
}
