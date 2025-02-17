package chap_04;

public class _08_NestedLoop {
    public static void main(String[] args) {
        // 이중 반복문

        // 왼쪽 직각 삼각형 만들기
        for(int i = 0; i < 5; i++){
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        // 오른쪽 직각 삼각형 만들기
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < (5 - 1 - i); j++){
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // 트리 만들기
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < (6 - 1 - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
