package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No1032 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];

        for (int i = 0; i < N; i++){
            arr[i] = br.readLine();
        }

        StringBuilder result = new StringBuilder(arr[0]);

        for (int i = 1; i < N; i++){
            for(int j = 0; j < result.length(); j++) {
                if (result.charAt(j) != arr[i].charAt(j)) {
                    result.setCharAt(j, '?');
                }
            }
        }

        System.out.println(result);
    }
}
