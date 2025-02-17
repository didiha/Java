package chap_06;

public class _03_Return {
    // 호첼 전화번호
    public static String getPhoneNumber(){
        String phoneNumber = "070-1234-5678";
        return phoneNumber;
    }

    // 호텔 주소
    public static String getAddress(){
        return "서울시 종로";
    }

    // 호텔 엑티비티
    public static String getActivity(){
        return "볼링장, 탁구장, 노래방";
    }

    public static void main(String[] args) {
        // 반환값
        String contactNumber = getPhoneNumber();
        System.out.println("호텔 전화번호: " + contactNumber);

        String address = getPhoneNumber();
        System.out.println("호텔 주소: " +address);

        System.out.println("호텔 엑티비티: " + getActivity());
    }
}
