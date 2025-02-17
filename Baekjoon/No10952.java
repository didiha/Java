package Baekjoon;
import java.io.*;
import java.util.StringTokenizer;
public class No10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int A = 1;
        int B = 1;

        while(A != 0 && B != 0){
            st = new StringTokenizer(br.readLine(), " ");
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());

            if(A != 0 && B != 0)
                bw.write(A + B + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}