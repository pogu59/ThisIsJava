package ch06.sec09;

public class Car {
    String model;
    String speed;

    Car(String model){
        this.model=model;
    }

    void setSpeed(String Speed){
        this.speed=speed;
    }

    void run(){
        System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h)");
    }
}
