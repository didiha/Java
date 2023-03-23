package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        // 아스키 코드(ASCII) : 미국 표준 코드
        // 알파벳 대문자(A)는 65부터 시작, 소문자(a)는 97부터 시작, 숫자(0)는 48부터 시작

        char c = '0';
        System.out.println(c);
        System.out.println((int)c);

        c = '1';
        System.out.println(c);
        System.out.println((int)c);

        c++;
        System.out.println(c);
        System.out.println((int)c);

        System.out.println("--------------");

        String[][] seats = new String[10][15];
        c = 'A';
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats.length; j++) {
                seats[i][j] = String.valueOf(c) + (j + 1);
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
            c++;
        }
    }
}
