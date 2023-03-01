package chap_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 if
        int hour  = 15; // 오후 3시

        // if 문 내에서 한 문장만 쓸 때는 {} 생략 가능
        if (hour >= 14)
            System.out.println("몬스터 에너지 드링크 +1");

        // 여러 문장 쓸 때는 {} 필수!
        if (hour < 14) {
            System.out.println("커피우유 + 1");
            System.out.println("초코바 추가");
        }
        System.out.println("음료 주문 완료");
    }
}
