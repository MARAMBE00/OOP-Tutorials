package Question6;

import java.util.Random;

public class Main {

    static int[] lotteryNumbers = new int[6];

    public static void main(String[] args) {

        Random random = new Random();

        int count = 0;
        while(count < 6){
            int randomNumber = 1 + random.nextInt(49);

            if(!isItAlreadyThere(randomNumber)){
                lotteryNumbers[count] = randomNumber;
                ++count;
            }
        }
        for(int x: lotteryNumbers)
            System.out.print(x + " ");
    }

    static boolean isItAlreadyThere(int x){
        for(int i: lotteryNumbers){
            if(i == x)
                return true;
        }
        return false;
    }
}

