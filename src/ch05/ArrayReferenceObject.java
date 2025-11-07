package ch05;

public class ArrayReferenceObject {
    public static void main(String[] args) {
        String[] strArray = new String[3];
        strArray[0] = "java";
        strArray[1] = "java";
        strArray[2] = new String("java");

        System.out.println(strArray[0] == strArray[1]);
        System.out.println(strArray[0] == strArray[2]); //다른 객체 메모리 주소가 다름(false)
        System.out.println(strArray[0].equals(strArray[2]));
    }
}
