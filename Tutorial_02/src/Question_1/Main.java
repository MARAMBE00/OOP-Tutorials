package Question_1;

public class Main {

    public static void main(String[] args) {

        String greeting = "Hello, World!";
        int n = greeting.length();
        System.out.println("The number of characters are: " + n);

        System.out.println();           //For extra line...

        String river = "Mississippi";
        String bigRiver = river.toUpperCase();
        System.out.println("'Mississippi' converted to uppercase: " + bigRiver);

        System.out.println();           //For extra line...

        String newRiver = bigRiver.toLowerCase();
        System.out.println("'MISSISSIPPI' converted to lowercase: " + newRiver);
    }
}
