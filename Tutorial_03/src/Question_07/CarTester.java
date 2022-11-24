package Question_07;

public class CarTester {

    public static void main(String[] args) {

        Car car1 = new Car("ABC-2121", 100.0);
        System.out.println("-----------Car1-----------");
        car1.print();
        System.out.println();

        Car car2 = new Car("CDE-3543", 70.0, 170.0);
        System.out.println("-----------Car2-----------");
        car2.print();
        System.out.println();

        Car car3 = new Car("BBB-2134", 40.0, 100.0);
        System.out.println("-----------Car3-----------");
        car3.print();

    }
}
