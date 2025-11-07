package ch05;

public class Replace {
    public static void main(String[] args) {
        String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
        String newStr = oldStr.replace("자바", "java");

        System.out.println(oldStr); // oldStr문자열에 "자바를" "java"로 변경한다.
        System.out.println(newStr);
    }
}
