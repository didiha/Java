package Baekjoon;
import java.util.Scanner;
public class No10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] num = new int[N];
        int v;
        int count = 0;

        for(int i = 0; i < N; i++)
            num[i] = sc.nextInt();

        v = sc.nextInt();
        for(int i = 0; i < N; i++)
            if(num[i] == v)
                count++;

        System.out.println(count);
    }
}