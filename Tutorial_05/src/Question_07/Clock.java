package Question_07;

public class Clock {

    public String getHours(){
        String hours = java.time.Instant.now().toString();
        return hours;
    }

    public String getMinutes(){
        String minutes = java.time.Instant.now().toString();
        return minutes;
    }

    public String getTime(){
        String time = getHours() + ":" + getMinutes();
        return time;
    }
}
