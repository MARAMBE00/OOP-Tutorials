package Question_07;

public class CarTester {

    public static void main(String[] args) {

        Car car = new Car();
        System.out.println("Current speed: " + car.getSpeed(-12) + "\n" +
                "Maximum speed: " + car.getMaxSpeed(100) + "\n" +
                "License plate: " + car.getLicensePlate("ABC - 1234"));

    }
}
