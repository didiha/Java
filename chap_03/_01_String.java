package chap_03;

public class _01_String {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length()); // 29

        // 대소문자 변환
        System.out.println(s.toUpperCase()); // 대문자로 변환
        System.out.println(s.toLowerCase()); // 소문자로 변환

        // 포함 관계
        System.out.println(s.contains("Java")); // 포함된다면 true
        System.out.println(s.contains("C#")); // 아니라면 false
        System.out.println(s.indexOf("Java")); // 위치 정보 확인, 7 출력됨
        System.out.println(s.indexOf("C#")); // 위치를 알 수 없으면 -1 출력됨
        System.out.println(s.indexOf("and")); // 12, and 처음 만나는 위치
        System.out.println(s.lastIndexOf("and")); // 23, and 마지막 만나는 위치
        System.out.println(s.startsWith("I like")); // 이 문자열로 시작한다면 true, 아니면 false
        System.out.println(s.endsWith("C.")); // 이 문자열로 끝나면 true, 아니면 false
    }
}
