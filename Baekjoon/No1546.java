package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class No1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];
        int M = array[0];
        int sum = 0;

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
            if(M < array[i])
                M = array[i];
        }
        bw.write(M + "\n");
        for (int i = 0; i < N; i++) {
            bw.write(array[i] + " ");
            bw.write(array[i] / M + " ");
            bw.write(array[i] / M * 100 + " ");
            array[i] = (array[i] / M) * 100;
            bw.write(array[i] + "\n");
            sum += array[i];
        }
        bw.write((float)sum / N + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
