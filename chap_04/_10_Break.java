package chap_04;

public class _10_Break {
    public static void main(String[] args) {
        // break

        //for 문
        int max = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "번 손님, 주문하신 음식 나왔습니다.");
            if(i == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");

        System.out.println("-------");

        // while 문
        int num = 1; // 대기 번호
        while(num <= 10) {
            System.out.println(num + "번 손님, 음식 나왔습니다.");
            if (num == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
            num++;
        }
        System.out.println("영업을 종료합니다.");
    }
}
