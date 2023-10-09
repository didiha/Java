package Baekjoon;

import java.io.*;
public class No2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String S;
        S = br.readLine();

        bw.write(S.length() + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
