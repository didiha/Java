package chap_06;

public class _Quiz_06 {
    public static String getHiddenDate(String str, int i){
       String hiddenStr = str.substring(0, i);
        for (; i < str.length(); i++) {
            hiddenStr += "*";
        }
        return hiddenStr;
    }
    public static void main(String[] args) {
        String name = "하채린";
        String id = "020718-1234567";
        String phone = "010 9876 5432";

        System.out.println("이름 : " + getHiddenDate(name, 1));
        System.out.println("주민등록번호 : " + getHiddenDate(id, 8));
        System.out.println("전화번호 : " + getHiddenDate(phone, 9));
    }
}
