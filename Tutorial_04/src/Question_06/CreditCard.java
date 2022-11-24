package Question_06;

import Question_05.Card;

public class CreditCard extends Card {

    private int pinNumber;
    private int number;

    public CreditCard(String n, int pin, int num) {
        super(n);
        pinNumber = pin;
        number = num;
    }

    public CreditCard(int pin, int num) {
        pinNumber = pin;
        number = num;
    }

    public boolean isExpired() {
        return false;
    }

    public String format() {
        String name = super.format();
        return name + ", pin: " + pinNumber + ", number: " + number;
    }

}
