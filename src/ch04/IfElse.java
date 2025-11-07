package ch04;

public class IfElse {
    public static void main(String[] args) {
        int score = 85;
        
        if(score>=90){
            System.out.println("점수가 90보다 큽니다");
            System.out.println("A등급입니다.");
        } else {
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("B등급입니다.");
        }
    }
}
