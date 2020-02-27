package LevelOne;

public class SquareOfANumber {

//    Write a program that displays the square of 5 on the screen.
//
//            Requirements:
//            •	The program should output text.
//            •	The main method should call the sqr method with 5 as an argument.
//            •	The main method should display the result of the sqr method.
//            •	Don't change the sqr method.
//            •	The displayed text must match the task conditions.

    public static void main(String[] args) {

        System.out.println(sqr(5));

    }

    public static int sqr(int a) {
        return a * a;
    }
}
