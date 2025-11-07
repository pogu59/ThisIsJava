package ch05;

public class GarbageObject {
    public static void main(String[] args) {
        String hobby = "여행";// 가비지 컬렉터의 의해 메모리 청소됌
        hobby = null;

        String kind1 = "자동차";
        String kind2 = kind1;
        kind1 = null;
        System.out.println("kind2: "+kind2);
    }
}
