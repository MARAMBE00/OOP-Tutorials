package Question5;

public class Main {

    public static void main(String[] args) {

        String x = "abc";
        String y = x;

        y = new String("123");
        String z = x;
        y = x;
        z = "456";

        System.out.println(x+y+z);
    }
}
