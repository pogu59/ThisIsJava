package ch04;

public class Continue {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            if(i%2!=0){
                continue; // 다음 반복문으로 넘어가기
            }
            System.out.println(i + " ");
        }
    }
}
