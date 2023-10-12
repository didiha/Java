package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class No1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        double[] array = new double[N];
        double max = 0;
        double sum = 0;

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            array[i] = Double.parseDouble(st.nextToken());
            if(max < array[i])
                max = array[i];
        }

        for (int i = 0; i < N; i++) {
            array[i] = array[i] / max * 100;
            sum += array[i];
        }

        bw.write(sum / N + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
