package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;

public class No1181 {
    public static void main (String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        HashSet<String> arr = new HashSet<>();

        for(int i = 0; i < N; i++) {
            arr.add(br.readLine());
        }

        String[] result = arr.toArray(new String[0]);

        Arrays.sort(result, (a, b) -> {
            if(a.length() == b.length())
                return a.compareTo(b);

            return a.length() - b.length();
        });

        for(String x : result){
            bw.write(x + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
