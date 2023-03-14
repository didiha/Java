package chap_04;

public class _06_While {
    public static void main(String[] args) {
        // 반복문 while

        // 수영장에서 수영을 한다면
        int distance = 25; //  전체 거리 25m
        int move = 0; // 현재 이동 거리 0m

        while (move < distance) {
            System.out.println("수영을 계속 합니다.");
            System.out.println("현재 이동 거리: " + move);
            move += 3; //3m 씩 이동
        }
        System.out.println("도착했습니다.");

        // 무한 루프
        /*
        move = 0;
        while (move < distance) {
        	System.out.println("수영을 계속 합니다.");
        	System.out.println("현재 이동 거리: " + move);
        }
        System.out.println("도착했습니다.");
        */

    }
}
