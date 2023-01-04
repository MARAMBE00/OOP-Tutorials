package Question_09;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Appointment> appointments = new ArrayList<>();
    public static void main(String[] args){

        // create some appointments
        Appointment a1 = new Onetime("Dentist", 2021, 0, 1);
        Appointment a2 = new Daily("Take medication", 2021, 0, 2);
        Appointment a3 = new Monthly("Pay bills", 2021, 0, 3);

        // add the appointments to the list
        appointments.add(a1);
        appointments.add(a2);
        appointments.add(a3);

        // test the occursOn method for each appointment
        System.out.println(a1.occursOn(2021, 0, 1)); // should return true
        System.out.println(a2.occursOn(2021, 0, 2)); // should return true;

    }
}
