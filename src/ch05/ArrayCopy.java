package ch05;

public class ArrayCopy {
    public  static void main(String[] args) {
        String[] oldStringArray = {"java", "array", "copy"};
        String[] newStringArray = new String[5];

        System.arraycopy(oldStringArray, 0, newStringArray, 0, oldStringArray.length);
        //배열을 복사, 0번 인덱스부터, 이배열에 붙여넣기, 0번 인덱스부터, 복사한 배열 만큼
        for( int i= 0; i < newStringArray.length; i++ ){
            System.out.println(newStringArray[i]);
        } 
    }
}
