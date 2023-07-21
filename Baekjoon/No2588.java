package Baekjoon;
import java.util.Scanner;
public class No2588 {
    public static int square(int num){
        int time = 1;
        if(num == 0)
            return time;
        else if (num > 0) {
            for(int i = 0; i < num; i++){
                time *= 10;
            }
            return time;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = 0;
        String num = String.valueOf(y);
        String tmp;
        int z;
        for (int i = 0; i < 3; i++){
            tmp = num.substring(2 - i, 3 - i);
            z = Integer.parseInt(tmp);
            System.out.println(x * z);
            result += (x * z * (square(i)));
        }
        System.out.println(result);
    }
}
