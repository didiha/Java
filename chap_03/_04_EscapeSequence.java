package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자 (Escape Sequence, Escape Character, Special Character)
        // \n \t \\ \" \'
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        // \n : 줄바꿈
        System.out.println("자바가\n너무\n재밌어요");

        // \t : Tab 키
        System.out.println("해물파전\t9000원");
        System.out.println("김치전\t8000원");
        System.out.println("부추전\t8000원");

        // \\ : \ (역슬래시 하나)
        System.out.println("C:\\ProgramFiles\\Java");

        // \" : " (큰 따옴표 하나)
        System.out.println("쿵이가 \"야옹\"이라고 했어요.");

        // \' : '(작은 따옴표 하나)
        System.out.println("몽이는 '배고파' 하는 표정을 지었어요.");
        System.out.println("몽이는 \'배고파\' 하는 표정을 지었어요."); // 두 명령문 다 같은 결과 출력됨.

        char c = '\'';
        System.out.println("c: " + c);
    }
}
