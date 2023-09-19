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
        int[] array = new int[N];
        int change1, change2;
        

        for (int i = 0; i < N; i++) {
            array[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            change1 = Integer.parseInt(st.nextToken());
            change2 = Integer.parseInt(st.nextToken());

            int[] tmp = new int[change2 - change1 + 1];
            
            for (int j = change2, k = 0; j > (change1 - 1); j--, k++) {
                tmp[k] = array[j - 1];
            }

            for (int j = (change1 - 1), k = 0; j < change2; j++, k++) {
                array[j] = tmp[k];
            }
        }

        for (int j = 0; j < N; j++) {
            bw.write(array[j] + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}