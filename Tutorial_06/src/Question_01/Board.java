package Question_01;

import java.util.Arrays;
import java.util.Random;

class Board {
    int ar[][];

    // creates a nxn size board
    public Board(int n) {

        ar = new int[n][n];

        // fill in array with random ints in the range [0, 100]
        Random generator = new Random();
        for (int i=0; i < n; i++)
            for (int j=0; j < n; j++)
                ar[i][j] = generator.nextInt(101);
    }

    // display the contents of the board
    public void print() {
        for (int[] r : ar) {    // for all rows
            for (int c : r)     // for every element in current row
                System.out.print(c + " ");
            System.out.println();
        }
    }

    // find max element in given row
    public int findMaxInRow(int row){
        int max = Integer.MIN_VALUE;

        for(int i=0; i < ar[row].length; i++){
            if(max < ar[row][i])
                max = ar[row][i];
        }
        return max;
    }

    // find max element in given column
    public int findMaxInColumn(int column){
        int max = Integer.MIN_VALUE;

        int n = ar[0].length;
        for(int row=0; row < n; row++){
            if(max < ar[row][column])
                max = ar[row][column];
        }
        return max;
    }

    // return max across all diagonals, i.e. return the max of all array elements
    public int findMaxInDiagonal(){
        int max = Integer.MIN_VALUE;

        for (int [] r : ar)     // for all rows
            for(int c : r)      // for every element in current row
                if(max < c)
                    max = c;

        return max;
    }
}


