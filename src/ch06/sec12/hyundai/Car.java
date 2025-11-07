package ch06.sec12.hyundai;

//다른 패키지 안에 있는 클래스 선언
import ch06.sec12.hankook.SnowTire;
import ch06.sec12.kumho.AllSeasonTire;

public class Car {
    public static void main(String[] args){
        //다른 패키지 안에 동일한 클래스가 있는 경우 직접 경로를 적어서 생성
        ch06.sec12.kumho.Tire tire1 = new ch06.sec12.kumho.Tire();
        ch06.sec12.hankook.Tire tire2 = new ch06.sec12.hankook.Tire();
        SnowTire tire3 = new SnowTire();
        AllSeasonTire tire4 = new AllSeasonTire();
    }
}
