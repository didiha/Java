package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 조건문 ElseIf

        // 한라봉 에이드가 있으면 +1
        // 망고 주스가 있으면 +1
        // 또는 아이스 초코 +1

        boolean ade =  true; // 한라봉 에이드
        boolean juice = true; // 망고 주스
        boolean ice = true; // 아이스 초코

        if (ade)
            System.out.println("한라봉 에이드 +1");
        else if (juice)
            System.out.println("망고 주스 +1");
        else
            System.out.println("아이스 초코 +1");

        System.out.println("음료 주문 완료 #1");

        //else if 는 여러번 사용 가능
        ade = false;
        juice = false;
        boolean juice2 = true;

        if (ade)
            System.out.println("한라봉 에이드 +1");
        else if (juice)
            System.out.println("망고 주스 +1");
        else if (juice2)
            System.out.println("오렌지 주스 +1");
        else
            System.out.println("아이스 초코 +1");

        System.out.println("음료 주문 완료 #2");

        // else 는 없어도 가능
        ade = false;
        juice = false;
        juice2 = false;

        if (ade)
            System.out.println("한라봉 에이드 +1");
        else if (juice)
            System.out.println("망고 주스 +1");
        else if (juice2)
            System.out.println("오렌지 주스 +1");

        System.out.println("음료 주문 완료 #3");
    }
}
