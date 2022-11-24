package Question_4_5;

public class VendingMachine {

    private int numberOfCans;
    private int numberOfTokens;

    public VendingMachine(){

    }

    public VendingMachine(int numberOfCans, int numberOfTokens) {
        this.numberOfCans = numberOfCans;
        this.numberOfTokens = numberOfTokens;
    }

    public void fillUp(int cans){
        numberOfCans = numberOfCans + cans;
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

