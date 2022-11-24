package Question_6;

import java.util.Arrays;
import java.util.Random;

public class Birthday {

    public static void main(String[] args) {

        int numberOfRuns = 10000;
        int totalPeople = 0;

        for (int i=1; i<numberOfRuns; i++){
            int people = singleRun();
            totalPeople = totalPeople + people;
        }
        System.out.println("Average: " + (totalPeople / numberOfRuns));
    }

    public static int singleRun() {

        boolean birthdayInRoom[] = new boolean[365];

        int numberOfPeople = 0;    //  how many people have entered the room so far
        while (true){
            ++numberOfPeople;       // 1 more person has entered the room
            int day = (int)(365*Math.random());
            if(birthdayInRoom[day])
                break;
            else
                birthdayInRoom[day] = true;
        }
        return numberOfPeople;
    }

}
