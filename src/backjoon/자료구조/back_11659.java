package backjoon.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class back_11659 {

    public static void main(String[] arrgs) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int dataValue = Integer.parseInt(st.nextToken());
        int questValue = Integer.parseInt(st.nextToken());

        int[] getValue = new int[dataValue + 1];


        StringTokenizer st2 = new StringTokenizer(br.readLine());

        getValue[0] = 0;

        for(int i = 1; i < dataValue + 1; i++){
            getValue[i] = getValue[i - 1] + Integer.parseInt(st2.nextToken());
        }


        for(int i = 0; i < questValue; i++){
            StringTokenizer st3  = new StringTokenizer(br.readLine());

            int initValue = getValue[Integer.parseInt(st3.nextToken()) - 1];
            int lastValue = getValue[Integer.parseInt(st3.nextToken())];



            System.out.println(lastValue - initValue);
        }


    }
}
