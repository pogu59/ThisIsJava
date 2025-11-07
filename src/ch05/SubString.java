package ch05;

public class SubString {
    public  static void main(String[] args) {
        String ssn = "880815-1234567";
        String firstNum = ssn.substring(0, 6); // 인덱스0부터6까지 값을 대입
        System.out.println(firstNum);

        String secondNum = ssn.substring(7); //인덱스 7부터 끝까지 갖고와서 대입
        System.out.println(secondNum);
    }
}
