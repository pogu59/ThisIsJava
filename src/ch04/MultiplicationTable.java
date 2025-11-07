package ch04;

public class MultiplicationTable {
    public static void main(String[] args) {
        for(int m=2; m<=9; m++) {
            System.out.println("*** "+m+"단 ***");
            for(int n=1; n<=9; n++) {
                System.out.println(m+"x"+n+" = " + (m*n));
            }
        }//반복 중첩문으로 구구단 출력
    }
}
