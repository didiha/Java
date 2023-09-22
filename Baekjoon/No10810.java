package Baekjoon;
import java.io.*;
import java.util.StringTokenizer;
public class No10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] array = new int[N];

        while(M != 0){
            st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            for(; i <= j; i++){
                array[i - 1] = k;
            }
            M--;
        }

        for (int i = 0; i < N; i++) {
            bw.write(array[i] + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}