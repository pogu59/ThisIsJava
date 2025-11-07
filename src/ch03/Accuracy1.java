package ch03;

public class Accuracy1 {
    public static void main(String[] args) {
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;

        double result = apple - number*pieceUnit;
        System.out.println("사과 한개에서 남은 양="+result);//실수로 계산할 때 정확하지 않은 값이 나옴
    }
}
