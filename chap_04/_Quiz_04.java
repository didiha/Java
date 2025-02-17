package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int hour = 10;
        boolean smallCar = false; // 경차
        boolean DisableCar = false; // 장애인차량
        int pay = hour * 4000;

        if(pay > 30000){
            pay = 30000;
        }

        if(smallCar || DisableCar){
            pay = (pay / 2);
        }

        System.out.println("주차요금은 " + pay + "원 입니다.");
    }
}
