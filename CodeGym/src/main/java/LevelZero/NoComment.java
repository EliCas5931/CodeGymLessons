package LevelZero;

public class NoComment {

//    Uncomment one line so that the program displays the numbers 12 and 2 (first 12, and then 2).
//
//    Requirements:
//            •	The program should display the numbers 12 and 2.
//            •	Don't change the lines that declare variables.
//            •	The program must have only two int variables.
//            •	Don't change the lines responsible for screen output.
//            •	You need to uncomment one line and leave the remaining lines unchanged.

    public static void main(String[] args) {

        // Code given in example:
        int x = 2;
        int y = 12;

        // y = x * y;
         y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);

//        Solution:
        // Uncommented the y = x + y because:
        // y = 2 + 12
        // y = 14

//        x = 14 - 2
//        x = 12
//
//        y = 14 - 12
//        y = 2
//        This is what the program asked for, number 12 and then 2. Ran code in IDE to double check.
    }
}
