package chap_06;

public class _01_Method {
    public static void sayHello(){
        System.out.println("안녕하세요 이 문장은 메소드를 통해 출력하였습니다.");
    }
    public static void main(String[] args) {
        // 메소드 (함수랑 비슷함)
        System.out.println("메소드 호출 전");
        sayHello();
        sayHello();
        sayHello();
        System.out.println("메소드 호출 완료");
    }
}
