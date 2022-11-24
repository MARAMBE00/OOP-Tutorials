package Question_03;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableTest {

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(100.0);
        BankAccount acc2 = new BankAccount(200.0);
        BankAccount acc3 = new BankAccount(300.0);

        ArrayList<BankAccount> list = new ArrayList<BankAccount>();
        list.add(acc1);
        list.add(acc2);
        list.add(acc3);

        Collections.sort(list);

        for(BankAccount b : list)
            System.out.println(b.getBalance());
    }
}
