package Baekjoon;

import java.io.*;
public class No11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int time;
        int x, sum = 0;

        time = Integer.parseInt(br.readLine());
        String st = br.readLine();

        for (int i = 0; i < time; i++) {
            x = Character.getNumericValue(st.charAt(i));
            sum += x;
        }
        bw.write(sum + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
