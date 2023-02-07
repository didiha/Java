package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "didiha";
        int hour = 17;

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.4;
        char grade = 'A';
        name = "하채린";

        System.out.println(name + "님의 평균 점수는 " + score +"점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14123456789;
        float f = 3.14123456789F;
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L; //l = 1_000_000_000_000L;
        System.out.println(l);

        /*
        int : integer, 정수형
        float : 4비트 자료형, 실수형
        double : float의 두배(8비트 자료형), 실수형
        char : character, 문자형
        boolean : 참(true), 거짓(false) 두개의 값을 가진 자료형, 0 or 1
        long : long integer, 긴 정수형
         */
    }
}
