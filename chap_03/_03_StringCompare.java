package chap_03;

import java.sql.SQLOutput;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java")); // 문자열 내용이 같으면 true, 아니면 false
        System.out.println(s2.equals("python")); // 결과: false
        // 대소문자 상관 없이 내용 같으면 true
        System.out.println(s2.equalsIgnoreCase("python"));

        // 문자열 심화

        // 1234가 두 개가 있는 것이 아닌 1234를 가리키는 변수가 두개인 것
        s1 = "1234"; // 종이에 적힌 비밀번호 (참조)
        s2 = "1234"; // 자물쇠 비밀번호
        System.out.println(s1.equals(s2)); // true (내용)
        System.out.println(s1 == s2); // true (참조)

        // s1과 s2는 각자 다른 1234를 저장하고 있음. 그래서 == 로 비교하면 결과가 false 로 뜸.
        s1 = new String("1234"); //
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true (내용), s1과 s2의 내용은 같으니까 true
        System.out.println(s1 == s2); // false (참조), s1과 s2는 다른 1234를 가지고 있으니 false
    }
}
