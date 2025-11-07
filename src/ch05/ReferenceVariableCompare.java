package ch05;

public class ReferenceVariableCompare {
    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;
        int[] arr3;

        arr1 = new int[]{1,2,3};
        arr2 = new int[]{1,2,3};
        arr3 = arr2;


        System.out.println(arr1==arr2); // 다른 메모리 주소를 쓰기 때문에 false

        System.out.println(arr2==arr3);
    }
}
