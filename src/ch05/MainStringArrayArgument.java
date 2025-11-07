package ch05;

public class MainStringArrayArgument {
    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("프로그램 입력 값이 부족");
            System.exit(0);
        }//args는 실행 시 입력값을 주지 않아 길이가 0인 String 배열을 참조한다.

        String strNum1 = args[0];
        String strNum2 = args[1];

        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);

        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }
}
