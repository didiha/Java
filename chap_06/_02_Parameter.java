package chap_06;

public class _02_Parameter {
    // 전달값이 있는 메소드
    public static void power(int number) {
        int result = number * number;
        System.out.println(number + "의 제곱은 " + result + " 입니다.");
    }

    public static void powerByExp(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + "의 " + exponent + "제곱은 " + result + "입니다.");
    }

    public static void main(String[] args) {
        // 전달값
        power(2);
        power(6);
        power(11);
        System.out.println("---------------");
        powerByExp(2, 3);
        powerByExp(7, 3);
        powerByExp(5, 4);
    }
}
