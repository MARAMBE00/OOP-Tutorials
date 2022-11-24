package Question_05;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Passport extends Card{

    private String birthLocation;
    private int expirationYear;

    public Passport(String n, String birth, int expire){
        super(n);
        birthLocation = birth;
        expirationYear = expire;
    }

    public Passport(String birth, int expire){
        birthLocation = birth;
        expirationYear = expire;
    }

    public boolean isExpired(){
        GregorianCalendar calendar = new GregorianCalendar();
        int currentYear = calendar.get(Calendar.YEAR);

        if(expirationYear < currentYear)
            return true;
        else
            return false;
    }
}
