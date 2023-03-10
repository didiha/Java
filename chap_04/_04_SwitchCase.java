package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case

        // 석차에 따른 장학금 지급 기준
        // 1등: 등록금 100% 차감
        // 2등: 등록금 70% 차감
        // 3등: 등록금 50% 차감
        // 그 외: 차감 없음

        // if else 사용
        int ranking = 4; // 1등

        if(ranking == 1)
            System.out.println("등록금 100% 차감");
        else if(ranking == 2)
            System.out.println("등록금 70% 차감");
        else if(ranking == 3)
            System.out.println("등록금 50% 차감");
        else
            System.out.println("등록금 차감 없음");
        System.out.println("조회 완료 #1");

        //switch case 사용
        ranking = 3;
        switch (ranking){
            case 1:
                System.out.println("등록금 100% 차감");
                break;
            case 2:
                System.out.println("등록금 70% 차감");
                break;
            case 3:
                System.out.println("등록금 50% 차감");
                break;
            default:
                System.out.println("등록금 차감 없음");
        }
        System.out.println("조회 완료 #2");

        // 2등과 3등의 장학금이 차감 50%로 같다고 쳤을 때
        ranking = 2;
        switch (ranking){
            case 1:
                System.out.println("등록금 100% 차감");
                break;
            case 2:
            case 3:
                System.out.println("등록금 50% 차감");
                break;
            default:
                System.out.println("등록금 차감 없음");
        }
        System.out.println("조회 완료 #3");

        // 중고상품의 등급에 따른 가격을 책정 (1급: 최상 <-> 4급: 최하)
        int grade = 2; // 등급
        int price = 7000; // 가격

        switch(grade){
            case 1:
                price += 1000;
                // break 가 없어서 case 2 의 명령이 실행됨. 이어서 case 3 명령도 실행됨.
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격" + ": " + price + "원");
    }
}
