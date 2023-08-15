package Baekjoon;
import java.io.*;
import java.util.StringTokenizer;
public class No10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] a = new int[N];
        int min, max;
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++)
            a[i] = Integer.parseInt(st.nextToken());

        max = a[0];
        min = a[0];

        for(int i = 0; i < N; i++) {
            if (max < a[i])
                max = a[i];
            if (min > a[i])
                min = a[i];
        }
        System.out.println(min + " " + max);
    }
}