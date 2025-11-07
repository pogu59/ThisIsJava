package ch04;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("메시지를 입력하세요.");
        System.out.println("프로그램을 종료하려면 q를 입력하세요.");

        Scanner sc = new Scanner(System.in);
        String inputString;
        do { //무조건 한번은 실행 되고, 조건식을 따짐
            System.out.print(">");
            inputString = sc.nextLine();
            System.out.println(inputString);
        } while(!inputString.equals("q"));
        System.out.println();
        System.out.println("프로그램 종료.");
    }
}
