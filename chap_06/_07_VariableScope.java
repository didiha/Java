package chap_06;

public class _07_VariableScope {
    /*public static void methodA(){
        System.out.println(num);
    }*/
    public static void methodB(){
        int result = 1; // 지역변수: 선언된 함수 내에서만 사용 가능한 변수
    }
    public static void main(String[] args) {
        int num = 3;

        // for문 안에서 선언된 i는 for문에서만 사용할 수 있음
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        // System.out.println(i);

        // {} 안에서만 j를 사용할 수 있음
        {
            int j = 0;
            System.out.println(j);
            System.out.println(num); // num은 사용 가능
        }
        // System.out.println(j);
    }
}