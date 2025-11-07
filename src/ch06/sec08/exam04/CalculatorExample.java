package ch06.sec08.exam04;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCalcu =  new Calculator();
        //오버로딩으로 정사각형 넓이 구하는 공식과 직사각형 구하는 공식을 같이 사용
        double result1 = myCalcu.areaRactamgle(10);

        double result2 = myCalcu.areaRactamgle(10,20);
        System.out.println("정사각형 넓이: " + result1);
        System.out.println("직사각형 넓이: " + result2);
    }
}
