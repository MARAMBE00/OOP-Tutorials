package Question_09;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Monthly extends Appointment{

    public Monthly(String description, int year, int month, int day) {
        super(description, year, month, day);
    }

    @Override
    public boolean occursOn(int year, int month, int day) {
        Calendar c = new GregorianCalendar(year, month, day);
        return c.get(Calendar.DAY_OF_MONTH) == c.get(Calendar.DAY_OF_MONTH);
    }
}
