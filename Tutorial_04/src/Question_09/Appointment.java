package Question_09;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Appointment {

    private String description;
    private Calendar date;

    public Appointment(String description, int year, int month, int day){
        this.description = description;
        this.date = new GregorianCalendar(year, month, day);
    }

    public boolean occursOn(int year, int month, int day){
        Calendar c = new GregorianCalendar(year, month, day);
        return c.equals(date);
    }

    public String dayOfTheWeek() {
        int day = date.get(Calendar.DAY_OF_WEEK);
        switch(day) {
            case Calendar.MONDAY:
                return "Monday";
            case Calendar.TUESDAY:
                return "Tuesday";
            case Calendar.WEDNESDAY:
                return "Wednesday";
            case Calendar.THURSDAY:
                return "Thursday";
            case Calendar.FRIDAY:
                return "Friday";
            case Calendar.SATURDAY:
                return "Saturday";
            case Calendar.SUNDAY:
                return "Sunday";
            default:
                return "Invalid day";
        }
    }
}
