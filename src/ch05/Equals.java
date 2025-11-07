package ch05;

public class Equals {
    public static void main(String[] args) {
        String strVar1 ="홍길동";
        String strVar2 ="홍길동";

        if(strVar1.equals(strVar2)){ // 문자열의 값만 따졌을 때 같은지 (==는 메모리 주소까지 비교하기 때문에 같은 참조가 아니면 false)
            System.out.println("strVar1==strVar2");
        }else {
            System.out.println("strVar1!=strVar2");
        }

        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");

        if(strVar3==strVar4){}
    }
}
