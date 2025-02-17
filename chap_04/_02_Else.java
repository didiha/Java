package chap_04;

import java.sql.SQLOutput;

public class _02_Else {
    public static void main(String[] args) {
        // 조건문 if else
        int hour = 15;

        // 오후 2시 이전이면 몬스터 주문
        if(hour < 14) {
            System.out.println("몬스터 에너지 드링크 +1");
        }
        // 그 외의 경우이면 이온음료 주문
        else {
            System.out.println("이온음료 +1");
        }
        System.out.println("음료 주문 완료 #1");

        // 오후 2시 이후이거나 잠을 충분히 잔 경우?
        hour = 13;
        boolean sleep = false;
        if (hour >= 14 || sleep)
            System.out.println("이온음료 +1");
        else
            System.out.println("몬스터 에너지 드링크 +1");
        System.out.println("음료 주문 완료 #2");
    }
}
