package ch03;

public class ArithmeticOperator {
    public static void main(String[] args) {
        byte v1 = 10;
        byte v2 = 4;
        int v3 = 5;
        long v4 = 10L;

        int result1 = v1 + v2;
        System.out.println("result1: "+result1); // 타입 연산후 int 타입으로 변환

        long result2 = v1 + v2 - v4;
        System.out.println("result2: "+result2); // long 타입이 있을 때 연산 결과는 long 타입

        double result3 = (double) v1/v2; // 강제 타입 변환 후 나누기 연산
        System.out.println("result3: "+result3);

        int result4 = v1 % v2;
        System.out.println("result4: "+result4); //result 나머지값 입력
    }
}
