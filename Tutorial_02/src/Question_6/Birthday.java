package Question_6;

import java.util.Arrays;
import java.util.Random;

public class Birthday {

    public static void main(String[] args) {

        int[] dayArray = new int[365];
        int day;
        int[] countArray = new int[50]; //Assuming there are 50 people in the party
        Random random = new Random();
        int total=0;

        for (int i=0; i<countArray.length; i++){
            int count = 0;
            Arrays.fill(dayArray,0); //filling the array from 365 to 0
            while (true){
                count++;
                day = random.nextInt(365);
                if (dayArray[day] == 1){
                    break;
                }else{
                    dayArray[day] = 1;
                }
            }
            countArray[i] = count;
        }
        for (int j:countArray){
            total = total + j;
        }
        int average = total / 100;
        System.out.println("Average number of people : " + average);
    }

}
