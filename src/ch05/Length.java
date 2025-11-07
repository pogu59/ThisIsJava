package ch05;

public class Length {
    public static void main(String[] args) {
        String ssn = "9506241230123";
        int length = ssn.length();
        //인덱스값이 아니라 길이를 구하는 메소드

        if (length==13){
            System.out.println("주민등록번호 자릿수가 맞습니다.");
        }else{
            System.out.println("주민등록번호 자릿수가 틀립니다.");
        }
    }
}
