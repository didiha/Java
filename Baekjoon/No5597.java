package Baekjoon;

import java.io.*;
public class No5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number;
        boolean[] students = new boolean[30];

        for (int i = 0; i < 28; i++) {
            number = Integer.parseInt(br.readLine());
            students[number - 1] = true;
        }

        for (int i = 0; i < 30; i++) {
            if(!students[i])
                bw.write(i + 1 + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}