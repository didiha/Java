package com.hcring.section02.variable;

public class Application1 {
    public static void main(String[] args) {
        // 변수를 선언하고 값을 대입하여 사용할 수 있다.

        // 변수 선언
        // 선언 방법: 자료형 변수명;

        // 정수현
        byte bnum;      // 1 바이트
        short snum;     // 2 바이트
        int inum;       // 4 바이트
        long lnum;      // 8 바이트

        // 실수형
        float fnum;     // 4 바이트
        double dnum;    // 8 바이트

        // 문자형
        char ch;        // 2 바이트

        // 논리형
        boolean isTrue; // 1 바이트

        // 문자열은 기본 자료형이 아닌 참조 자료형임을 기억한다.
        String str;     // 4 바이트


//        System.out.printf("");  // souf + 엔터
//        System.out.println();   // sout + 엔터

        // 매소드 내부에 작성한 변수는 지역 변수(local variable)
        // 지역변수는 초기화 되지 않으면 사용할 수 없다.
//        System.out.println(bnum);   // bnum 값이 초기화 되어 있지 않으면 bnum 부분에 컴파일 에러 표시가 뜸

        // 변수에 값 대입 (처음 대입하는 것을 초기화 한다고 한다.)
        bnum = 1;
        snum = 2;
        inum = 4;
        lnum = 8L;      // 8은 int 타입인데 long 타입에 숫자를 대입한다는 뚯으로 뒤에 L 접미사를 붙여준다.
        fnum = 4.0f;    // float 표시로 f 접미사 붙임
        dnum = 8.0d;    // double 표시로 d 접미사 붙임
        ch = 'a';
        ch = 98;
        isTrue = true;
        isTrue = false;
        str = "hello";

        // 변수 사용 (대입된 값을 출력)
        System.out.println(bnum);

        // 선언과 동시에 초기화
        int point = 100;    // ' = ' 은 대입연산자
        int bonus = 10;

        System.out.println("point = " + point);

        // 대입연산자 왼쪽은 변수 공간, 대입연산자 오른쪽은 변수가 가진 값으로 해석
        point = point + 100;

        System.out.println("point = " + point);
    }
}
