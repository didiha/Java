package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환은 "정수 <-> 실수"를 변환하는 걸 얘기함

        // int score = 93 + 98.8; <--- 정수형 변수에 정수 + 실수 값을 넣으려고 하니까 오류 뜸

        // int to float, double
        int score = 93;
        System.out.println(score); // 93
        System.out.println((float)score); // 93.0
        System.out.println((double)score); // 93.0

        // float, double to int
        float score_f = 93.3f;
        double score_d = 98.8;
        System.out.println((int)score_f); // 93
        System.out.println((int)score_d); // 98

        // 정수 변수 = 정수 + 실수
        score = 93 + (int)98.8; // 93 + 98
        System.out.println(score); // 191

        // 실수 변수 = 정수 + 실수 <--- 값이 실수이기 때문에 형변환 필요 없음
        score_d = 93 + 98.8; // 93.0 + 98.8
        System.out.println(score_d);

        //변수에 형변환된 데이터 집어 넣기
        double convertedScoreDouble = score; // 191 -> 191.0
        // int -> long -> float -> double      자동으로 형변환 됨

        int convertedScoreInt = (int)score_d; // 191.8 -> 191
        // double -> float -> long -> int      수동으로 형변환 해줘야 함

        // 숫자를 문자열로 바꿀 수가 있다?!!?!?!
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1); // 93

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2); // 98.8

        // 문자열도 숫자로 바꿀 수가 있다? 뿌슝빠슝
        int i = Integer.parseInt("93");
        System.out.println(i); // 93

        double d = Double.parseDouble("98.8");
        System.out.println(d); // 98.8
    }
}
