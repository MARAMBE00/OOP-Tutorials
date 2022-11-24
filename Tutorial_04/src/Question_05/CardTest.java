package Question_05;

public class CardTest {

    public static void main(String[] args) {

        DriverLicense d1 = new DriverLicense("Pasindu", 2020);
        System.out.println("License of Pasindu expired: " + d1.isExpired());

        DriverLicense d2 = new DriverLicense("Kasun", 2010);
        System.out.println("License of Kasun expired: " + d2.isExpired());

        Passport p1 = new Passport("Pasindu", "Sri Lanka", 2000);
        System.out.println("Passport of Pasindu expired: " + p1.isExpired());

        Passport p2 = new Passport("Kasun", "India", 2011);
        System.out.println("Passport of Kasun expired: " + p2.isExpired());

        CreditCard c1 = new CreditCard("Pasindu", 2020, 12345678);
        System.out.println(c1.isExpired());

        CreditCard c2 = new CreditCard(1234, 45678790);
        System.out.println(c2.isExpired());
    }
}
