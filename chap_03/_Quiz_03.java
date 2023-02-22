package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String A = "020718-4567890";
        String B = "220223-1234567";

       System.out.println(A.substring(0, 8));
       System.out.println(B.substring(0, B.indexOf("-") + 2));
    }
}
