package Question_06;

public class CardTest {

    public static void main(String[] args) {

        DriverLicense d1 = new DriverLicense("Pasindu", 2020);
        DriverLicense d2 = new DriverLicense("Kasun", 2010);

        Passport p1 = new Passport("Pasindu", "Sri Lanka", 2000);
        Passport p2 = new Passport("Kasun", "India", 2011);

        CreditCard c1 = new CreditCard("Pasindu", 2020, 12345678);
        CreditCard c2 = new CreditCard(1234, 45678790);

        System.out.println(d1.format());
        System.out.println(d2.format());
        System.out.println(p1.format());
        System.out.println(p2.format());
        System.out.println(c1.format());
        System.out.println(c2.format());
    }
}
