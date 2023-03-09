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
    }
}
