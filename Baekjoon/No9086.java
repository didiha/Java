package Baekjoon;

import java.io.*;
public class No9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S;
        int T;
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            S = br.readLine();
            bw.write(S.charAt(0));
            bw.write(S.charAt(S.length() - 1)  + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
