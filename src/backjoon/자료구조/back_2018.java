package backjoon.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class back_2018 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;

        while(end_index != N){
            if(sum == N){ // 현재 연속 합이 N과 같은 경우
                count ++;
                end_index++;
                sum = sum + end_index;
            } else if (sum > N){
                sum = sum - start_index;
                start_index++;
            } else {
                end_index++;
                sum = sum + end_index;
            }
        }

        System.out.println(count);

    }
}
