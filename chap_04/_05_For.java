package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 for

        // ㅇㅇ 매장 알바생

        System.out.println("어서오세요. ㅇㅇ입니다.");
        // 또 손님이 들어오면
        System.out.println("어서오세요. ㅇㅇ입니다.");
        System.out.println("어서오세요. ㅇㅇ입니다.");

        // 인사법이 바뀌면
        System.out.println("환영합니다. ㅇㅇ입니다.");
        System.out.println("환영합니다. ㅇㅇ입니다.");
        System.out.println("환영합니다. ㅇㅇ입니다.");

        // 매장 이름이 바뀌면
        System.out.println("환영합니다. ㅁㅁ입니다.");
        System.out.println("환영합니다. ㅁㅁ입니다.");
        System.out.println("환영합니다. ㅁㅁ입니다.");

        // 반복문 사용
        System.out.println("---이 밑으로는 반복문 사용한 출력---");

        for(int i = 0; i < 10; i++){
            // System.out.println("어서오세요. ㅇㅇ입니다." + i);
            // System.out.println("환영합니다. ㅇㅇ입니다." + i);
            System.out.println("환영합니다. ㅁㅁ입니다." + i);
        }

    }
}
