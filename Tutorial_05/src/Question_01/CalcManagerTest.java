package Question_01;

public class CalcManagerTest {

    public static void main(String[] args) {

        double sum1 = CalcManager.add(1.7, 3.1);
        System.out.println("Sum1 = " + sum1);
        double sum2 = CalcManager.add(5.2, 9.2);
        System.out.println("Sum2 = " + sum2);

        System.out.println();

        System.out.println("isEven(2): " + CalcManager.isEven(4));
        System.out.println("isEven(7): " + CalcManager.isEven(7));

        System.out.println();

        System.out.println("cube(2): " + CalcManager.cube(2));
        System.out.println("cube(5): " + CalcManager.cube(5));
    }
}
