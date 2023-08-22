package Baekjoon;
import java.io.*;
public class No2562 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max;
        int maxNumber = 1;
        int[] array = new int[9];

        for (int i = 0; i < 9; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        max = array[0];

        for (int i = 0; i < 9; i++) {
            if(max < array[i]){
                max = array[i];
                maxNumber = i + 1;
            }
        }

        bw.write(max + "\n" + maxNumber);

        br.close();
        bw.flush();
        bw.close();
    }
}