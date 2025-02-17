package com.hcring.section05.typecasting;

public class Application3 {
    public static void main(String[] args) {
        // int 미만의 자료형에서 주의할 점
        // byte 와 short의 연산 결과는 int로 처리된다.
        byte byteNum1 = 1;
        byte byteNum2 = 2;
        // 오류 발생
//        byte result = byteNum1 + byteNum2;
        int result = byteNum1 + byteNum2;

        short shortNum1 = 1;
        short shortNum2 = 2;
        // 오류 발생
//        short result2 = shortNum1 + shortNum2;
        int result2 = shortNum1 + shortNum2;
    }
}
