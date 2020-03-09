package LevelTwo;

public class MinimumOfTwoNumbers {

//    Write a function that returns the minimum of two numbers.
//
//    Hint:
//    You need to write the body of the existing min function.
//
//            Requirements:
//            •	The program should display text on the screen.
//            •	The min method should not display text on the screen.
//            •	The main method should call the min method three times.
//            •	The main method should display the result of the min method. Each time, on a new line.
//            •	The min method must return the minimum of the numbers a and b.

    public static void main(String[] args) throws Exception {

        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));


    }

    public static int min(int a, int b) {
        //write your code here

        int m;

        if (a > b) {

            m = b;

        } else {

            m = a;

        }

        return m;
    }
}
