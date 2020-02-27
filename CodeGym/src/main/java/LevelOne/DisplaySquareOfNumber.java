package LevelOne;

public class DisplaySquareOfNumber {

//    The variable number is given.

        public static int number = 25;

//    Write a program that displays the square of this variable: (number * number).
//
//    Requirements:
//            •	Don't change the variable number. You can only change its value.
//            •	The program should output text.
//            •	The displayed text must be a number.
//            •	The displayed text must be the square of the variable number.


    public static void main(String[] args) {

//      How I solved. Then printed just the number since they want text.
        number = number * number;

        System.out.println(number);

    }
}
