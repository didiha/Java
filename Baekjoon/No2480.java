package Baekjoon;
import java.util.Scanner;
public class No2480 {
    public static int MAX(int x, int y, int z) {
        int array[] = new int[3];
        array[0] = x;
        array[1] = y;
        array[2] = z;
        int max = array[0];

        for(int i = 0; i < 2; i++){
            if(max < array[i + 1])
                max = array[i + 1];
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if(x == y && y == z)
            System.out.println(10000 + x * 1000);
        else if(x == y && y != z)
            System.out.println(1000 + x * 100);
        else if(y == z && z != x)
            System.out.println(1000 + y * 100);
        else if(x == z && x != y)
            System.out.println(1000 + z * 100);
        else if(x != y && y != z && z != x)
            System.out.println(MAX(x, y, z) * 100);
    }
}
