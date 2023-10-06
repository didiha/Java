package Baekjoon;

import java.io.*;
public class No27866 {
    public static void main(String[] args) throws IOException {
        String S;
        int n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        S = br.readLine();
        n = Integer.parseInt(br.readLine());

        bw.write(S.charAt(n - 1));

        br.close();
        bw.flush();
        bw.close();
    }
}
