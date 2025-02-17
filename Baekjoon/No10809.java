package Baekjoon;

import java.io.*;

public class No10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array = new int[26];
        String S = br.readLine();

        for (int i = 0; i < 26; i++)
            array[i] = -1;

        for (int i = 0; i < S.length(); i++) {
            for (int j = 0; j < 26; j++) {
                if ((S.charAt(i)) - 97 == j && array[j] == -1)
                    array[j] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            bw.write(array[i] + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
