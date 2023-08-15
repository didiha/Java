package Baekjoon;
import java.io.*;
import java.util.StringTokenizer;
public class No10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        int N = Integer.parseInt(str.split(" ")[0]);
        int X = Integer.parseInt(str.split(" ")[1]);
        int[] A = new int[N];

        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
            if(A[i] < X)
                bw.write(A[i] + " ");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}