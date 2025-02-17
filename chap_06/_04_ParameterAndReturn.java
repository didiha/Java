package chap_06;

public class _04_ParameterAndReturn {
    public static int getPower(int number){
        int result = number * number;
        return result;
    }

    public static int getPowerByExp(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 전달값과 변환값이 있는 메소드
        int retVal = getPower(2);
        System.out.println(retVal);

        retVal = getPower(5);
        System.out.println(retVal);

        retVal = getPowerByExp(4, 3);
        System.out.println(retVal);

        System.out.println(getPowerByExp(5, 3));
    }
}
