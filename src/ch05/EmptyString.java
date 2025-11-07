package ch05;

public class EmptyString {
    public static void main(String[] args) {
        String hobby ="";
        if(hobby.equals("")){
            System.out.println("변수가 참조하는 String 객체는 빈 문자열");
        }
    }
}
