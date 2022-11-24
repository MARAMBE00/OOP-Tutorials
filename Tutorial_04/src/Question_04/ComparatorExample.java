package Question_04;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorExample {

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(10000);
        BankAccount acc2 = new BankAccount(5000);
        BankAccount acc3 = new BankAccount(2000);

        ArrayList<BankAccount> list = new ArrayList<BankAccount>();
        list.add(acc1);
        list.add(acc2);
        list.add(acc3);

        Collections.sort(list, new MyComparator());

        for(BankAccount b : list)
            System.out.println(b.balance);
    }
}
