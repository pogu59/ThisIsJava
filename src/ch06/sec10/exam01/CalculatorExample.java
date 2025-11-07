package ch06.sec10.exam01;

public class CalculatorExample {
    public static void main(String[] args) {
        //정적 멤버로 선언한 경우 메인 클래스에서 클래스를 생성하지 않아도 사용 가능하다.
        double result1 = 10 * 10 * Calculator.pi;
        int result2 = Calculator.plus(10,5);
        int result3 = Calculator.minus(10, 5);

        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);
    }
}
