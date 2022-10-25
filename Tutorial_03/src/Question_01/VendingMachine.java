package Question_01;

public class VendingMachine {

    private int numberOfCans;
    private int numberOfTokens;
    private int canCount = 0;

    public VendingMachine() {
        this(10);
        numberOfTokens = 0;
    }

    public VendingMachine(int cans) {
        numberOfCans = cans;
        numberOfTokens = 0;
    }

    public void insertToken(){
        numberOfTokens = numberOfTokens + 1;
        numberOfCans = numberOfCans - 1;
    }

    public int getNumberOfCans() {
        return numberOfCans;
    }

    public int getNumberOfTokens() {
        return numberOfTokens;
    }
}

