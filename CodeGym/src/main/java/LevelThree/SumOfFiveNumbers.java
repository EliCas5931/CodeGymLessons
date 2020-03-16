package LevelThree;

public class SumOfFiveNumbers {

//    Display the sum of numbers from 1 to 5, line by line (there should be 5 lines):
//            1
//            1+2=3
//            1+2+3=6
//            ...
//
//    Example output:
//            1
//            3
//            6
//            ...
//
//    Requirements:
//            •	The program should output text.
//            •	The displayed text should contain 5 lines.
//            •	The number in each new line must be greater than the previous one.
//            •	The displayed text must match the task conditions.

//    How they want the code:

//    public static void main(String[] args) {
//
//        System.out.println(1);
//        System.out.println(1 + 2);
//        System.out.println(1 + 2 + 3);
//        System.out.println(1 + 2 + 3 + 4);
//        System.out.println(1 + 2 + 3 + 4 + 5);
//
//    }

//    My attempt with loops:
    public static void main(String[] args) {

        sum();

    }

    public static void sum() {
        int j = 0;

        for (int i = 1; i <=5; i++) {

            System.out.println(j += i);

        }
    }

}
