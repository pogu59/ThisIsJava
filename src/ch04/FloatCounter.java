package ch04;

public class FloatCounter {
    public static   void main(String args[]) {
        for(float i = 0.1f; i <= 1.0f; i+=0.1f) {
            System.out.println(i);
        }
        //for문에 부동소수점 float은 쓰면 좋지 않다.
    }
}
