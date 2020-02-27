package LevelOne;

public class SimpleAsTwoPlusTwo {

//    Write a program that calls the sum method with the arguments 2 and 2.
//
//    Requirements:
//            •	The program should display the sum of 2 and 2.
//            •	The main method should call the sum method with the arguments 2 and 2.
//            •	The main method should not call a screen output method.
//            •	Don't change the sum method.

    public static void main(String[] args) {

        sum(2, 2);
    }

    public static void sum(int a, int b) {
        int c = a + b;
        System.out.print(c);
    }
}
