package Question_04;

import java.util.ArrayList;

public class ContainerTest {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add(3.4);
        list.add(new Integer(4));

        Book myBook = new Book();
        list.add(myBook);

        double d;
        d = (Double) list.get(0);
        Integer d2 = (Integer) list.get(1);
        Book b3 = (Book) list.get(1);   // Problematic line
        Book b2 = (Book) list.get(2);  // Problematic line
    }
}
