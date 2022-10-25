package Question_07;

public class Car {

    private String licensePlate;
    private double speed;
    private double maxSpeed;

    public Car(){

    }

    public Car(String licensePlate1, double maxSpeed1){
        this.licensePlate = licensePlate1;
        this.speed = 0.0;
        if(maxSpeed1 >= 0.0){
            maxSpeed = maxSpeed1;
        }
        else{
            maxSpeed = 0.0;
        }
    }

    public Car(double speed1, double maxSpeed1){
        if(speed1 < 0){
            speed = 0.0;
        }
        else if(speed1 >= maxSpeed1){
            speed = maxSpeed1;
        }
    }

    public String getLicensePlate(String licensePlate) {
        return licensePlate;
    }

    public double getSpeed(double speed) {
        return speed;
    }

    public double getMaxSpeed(double maxSpeed) {
        return maxSpeed;
    }
}
