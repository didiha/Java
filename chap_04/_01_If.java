package chap_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 if

        int hour  = 11; // 오후 3시

        // if 문 내에서 한 문장만 쓸 때는 {} 생략 가능
        if (hour >= 14)
            System.out.println("몬스터 에너지 드링크 +1");

        // 여러 문장 쓸 때는 {} 필수!
        if (hour < 14) {
            System.out.println("이온음료 + 1");
            System.out.println("초코바 추가");
        }
        System.out.println("음료 주문 완료 #1");

        // 오후 2시 이전, 잠을 많이 자지 못한 경우에는?
        hour = 10;
        boolean sleep = false; // 잠
        // if (hour < 14 && sleep == false){
        if (hour < 14 && !sleep){
            System.out.println("몬스터 에너지 드링크 +1");
        }
        System.out.println("음료 주문 완료 #2");

        // 오후 2시 이후이거나 잠을 충분히 많이 잔 경우?
        hour = 10;
        sleep = true;
        if(hour >= 14 || sleep){
            System.out.println("이온음료 +1");
        }
        System.out.println("음료 주문 완료 #3");
    }
}
