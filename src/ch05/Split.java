package ch05;

public class Split {
    public static void main(String[] args) {
        String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";

        String[] tokens = board.split(",");//String 배열에서 ,기준으로 배열을 나눈다
        for(int i=0;i<tokens.length;i++){
            System.out.println(tokens[i]);
        }
    }
}
