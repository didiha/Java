package Baekjoon;

import java.io.*;

public class No2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            String[] input = br.readLine().split(" ");
            int R = Integer.parseInt(input[0]);
            String S = input[1];

            StringBuilder sb = new StringBuilder();

            for(char c : S.toCharArray()){
                for(int j = 0; j < R; j++){
                    sb.append(c);
                }
            }

            bw.write(sb.toString());
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
