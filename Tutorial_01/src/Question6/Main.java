package Question6;

public class Main {

    public static void main(String[] args) {

        int uniqueNumbersSize = 6;                     // Number of lucky numbers.
        int maxRange = 49;                             // Assume selecting integers range between 1 and 49.
        int lucky;                                     // Holds a lucky number candidate.
        int luckyCount;                                // Holds count of lucky numbers in a set.

        for(int i = 0 ; i < 1 ; ++i) {
            int lucky1 = 0;                            // Lucky numbers for the set of 6.
            int lucky2 = 0;
            int lucky3 = 0;
            int lucky4 = 0;
            int lucky5 = 0;
            int lucky6 = 0;

            luckyCount = 0;                                                  // Count of numbers found in the current set
            while(luckyCount < uniqueNumbersSize){
                // Generate a lucky number between 0 and 48 and add 1:
                lucky = (int) (maxRange * Math.random()) + 1;
                switch (luckyCount) {
                    case 0:                                                      // It is the first one and store it.
                        lucky1 = lucky;
                        luckyCount++;                    // increment the count
                        break;
                    case 1:
                        if (lucky != lucky1) {                                   // check that it is different from the first
                            lucky2 = lucky;
                            luckyCount++;
                        }
                        break;
                    case 2:
                        if (lucky != lucky1 && lucky != lucky2) {                // For the third we check against the previous two
                            lucky3 = lucky;
                            luckyCount++;
                        }
                        break;
                    case 3:
                        if (lucky != lucky1 && lucky != lucky2 && lucky != lucky3) {   // Check against the previous three
                            lucky4 = lucky;
                            luckyCount++;
                        }
                        break;
                    case 4:
                        if (lucky != lucky1 && lucky != lucky2 && lucky != lucky3 && lucky != lucky4) {   // Check against the previous four
                            lucky5 = lucky;
                            luckyCount++;
                        }
                        break;
                    case 5:
                        if (lucky != lucky1 && lucky != lucky2 && lucky != lucky3 && lucky != lucky4 && lucky != lucky5) {  // Check against the previous five
                            lucky6 = lucky;
                            luckyCount++;
                        }
                        break;
                }
            }

            System.out.print("\n6 unique numbers are: " + lucky1 + " " + lucky2  + " " + lucky3  + " " + lucky4  + " " + lucky5  + " " + lucky6);

        }

    }
}

