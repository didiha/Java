package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;
public class No10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = i + 1;
        }

        while(M != 0){
            st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int tmp;

            tmp = array[i - 1];
            array[i - 1] = array[j - 1];
            array[j - 1] = tmp;
            M--;
        }

        for (int i = 0; i < N; i++) {
            bw.write(array[i] + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}