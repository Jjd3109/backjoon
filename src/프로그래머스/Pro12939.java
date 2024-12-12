package 프로그래머스;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.StringTokenizer;

public class Pro12939 {

    public String solution(String s) {

        StringTokenizer st = new StringTokenizer(s);

        int[] getValue = new int[st.countTokens()];

        for (int i = 0; i < getValue.length; i++) {
            getValue[i] = Integer.parseInt(st.nextToken());
        }


        return String.valueOf(Arrays.stream(getValue).min().getAsInt()) + " " + String.valueOf(Arrays.stream(getValue).max().getAsInt());


    }
}
