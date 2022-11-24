package Question_05;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DriverLicense extends Card{

    private int expirationYear;

    public DriverLicense(String n, int expire){
        super(n);
        expirationYear = expire;
    }

    public DriverLicense(int expire){
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
