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
        // 짝수만 출력 (fori 적고 엔터 치면 자동으로 for문 작성됨)
        for (int i = 0; i < 10; i += 2){
            System.out.print(i + " ");
        }
        System.out.println();
        // 홀수만 출력
        for (int i = 1; i < 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        // 숫자를 거꾸로 출력
        for (int i = 5; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 1 + 2 + 3 ... + 10 = 55
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
