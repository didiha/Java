package Baekjoon;
import java.io.*;
public class No3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] remainder = new int[10];
        int count;
        int count2 = 0;

        for (int i = 0; i < 10; i++) {
            remainder[i] = Integer.parseInt(br.readLine()) % 42;
        }

        for (int i = 0; i < 10; i++) {
            count = 0;
            for (int j = i + 1; j < 10; j++) {
                if(remainder[i] != remainder[j])
                    count++;
            }
            if(count == 9 - i)
                count2++;
        }

        bw.write(count2 + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}