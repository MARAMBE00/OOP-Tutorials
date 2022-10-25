package Question_01;

public class VendingMachineTester {

    public static void main(String[] args) {

        VendingMachine machine = new VendingMachine();
        machine.insertToken();
        machine.insertToken();
        System.out.println("Token count = ");
        System.out.println(machine.getNumberOfTokens());
        System.out.println("Can count = ");
        System.out.println(machine.getNumberOfCans());

    }
}
