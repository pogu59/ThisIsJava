package ch06.sec11.exam01;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("123456-124567", "감자바");

        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);
        
        //이후 final로 선언된 주민번호와 국가는 변경불가
        
        k1.name = "김자바";
    }
}
