package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // 문자열 치환, 변환
        System.out.println(s.replace(" and", ",")); // " and" 를 ","로 치환
        System.out.println(s.substring(7)); // 인덱스 기준 7부터 출력
        System.out.println(s.substring(s.indexOf("Java"))); // 위의 명령어와 같은 결과 출력
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); // "Java" 부터 "." 바로 앞까지만 출력됨

        // 공백 제거
        s = "     I love Java.       ";
        System.out.println(s);
        System.out.println(s.trim()); // 앞, 뒤 공백 제거

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2);
        System.out.println(s1 + ", " + s2);
        System.out.println(s1.concat(", ").concat(s2)); // 위의 명령어와 같은 결과 출력
    }
}
