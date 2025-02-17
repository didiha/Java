package Baekjoon;

import java.io.*;
import java.io.IOException;
public class No11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        char c = s.charAt(0);

        bw.write((int)c + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
