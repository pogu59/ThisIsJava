package ch06.sec08.exam01;

public class Calculator {
    void powerOn(){
        System.out.println("전원을 킵니다.");
    }
    void powerOff(){
        System.out.println("전원을 끕니다.");//return 없는 메소드
    }

    int plus(int x, int y){
        int result = x + y;//더하기 메소드
        return result;
    }

    int divide(int x, int y){
        double result = (double)x / (double)y;//나누기 메소드
        return (int) result;
    }
}
