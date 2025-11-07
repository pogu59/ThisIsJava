package ch04;

public class If {
    public static void main(String[] args) {
        int score =93;

        if (score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("A등급입니다.");
        }
        if (score < 90)
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("B등급입니다.");

            //중괄호가 없어서 13줄부터 출력

    }
}
