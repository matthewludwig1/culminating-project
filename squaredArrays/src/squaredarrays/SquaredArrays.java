/*
 * Matthew Ludwig 
 * May 3 2018
 * This program uses arrays to display the square of a number
 */

package squaredarrays;

/**
 *
 * @author malud0519
 */
public class SquaredArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Squares Array List");
        System.out.println("******************");
        // start of the array's
        int [] square = {0,1,2,3,4,5,6,7,8,9};
        square[0] = 0 * 0;
        square[1] = 1 * 1;
        square[2] = 2 * 2;
        square[3] = 3 * 3;
        square[4] = 4 * 4;
        square[5] = 5 * 5;
        square[6] = 6 * 6;
        square[7] = 7 * 7;
        square[8] = 8 * 8;
        square[9] = 9 * 9;
        
        for (int i = 0; i < square[9]; i++) {
            System.out.println("Number: " + (i) + " Square: " + square[i]);
        }
        
        
        
    }
    
}
