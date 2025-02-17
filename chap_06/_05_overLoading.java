package chap_06;

public class _05_overLoading {
    public static int getPower(int number){
        int result = number * number;
        return result;
    }

    /*public static double getPower(int number){
        return 0.0;
    }*/
    // 위의 메소드와 이름이 같아서 오버로딩이 생김

    public static int getPowerByExp(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static int getPowerStr(String strNumber){
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    public static void main(String[] args) {
        // 메소드 오버로딩
        // 같은 이름의 메소드를 여러 번 선언
        // 1. 전달값의 타입이 다르거나
        // 2. 전달값의 갯수가 다르거나
        System.out.println(getPower(3));
        System.out.println(getPowerByExp(11, 2));
        System.out.println(getPowerStr("5"));


    }
}
