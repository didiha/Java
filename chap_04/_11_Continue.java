package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // continue

        // for
        int max = 10; // 최대 판매 수량
        int sold = 0; // 판매한 수량
        int noShow = 7; // 음식을 받아가지 않은 손님 번호

        for (int i = 1; i <= 15; i++) {
            System.out.println(i + "번 손님, 주문하신 음식 나왔습니다.");
            if(i == noShow){
                System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue; // 바로 for 위쪽으로 넘어감. 즉, sold 카운트가 안 됨.
            }
            sold++;
            if(sold == max){
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");

        System.out.println("---------------");

        // while 문
        sold = 0;
        int num = 0;
        // while (num < 15){
        while (true){
            num++;
            System.out.println(num + "번 손님, 주문하신 음식 나왔습니다.");
            if(num == noShow){
                System.out.println(num + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue;
            }
            sold++;
            if(sold == max){
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");
    }
}
