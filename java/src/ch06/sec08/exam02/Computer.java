package ch06.sec08.exam02;

public class Computer {
    int sum(int ... values) { //가변 길이 변수를 생성
        int sum = 0;
    for(int i = 0; i < values.length; i++){
        sum += values[i];
    }
    return sum;
    }
}
