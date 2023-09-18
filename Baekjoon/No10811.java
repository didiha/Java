package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class No10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int array[] = new int[N];
        int count = 0;

        for (int i = 0; i < N; i++) {
            array[i] = i + 1;
        }

    }
}
