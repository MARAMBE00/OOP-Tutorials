package Question_04;
import java.util.Comparator;

public class MyComparator implements Comparator<BankAccount> {

    public int compare(BankAccount b1, BankAccount b2){
        if(b1.balance < b2.balance)
            return -1;
        else if (b1.balance > b2.balance)
            return 1;
        else
            return 0;
    }
}

