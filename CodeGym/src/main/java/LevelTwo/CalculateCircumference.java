package LevelTwo;

public class CalculateCircumference {

//    Display the circumference of a circle, which is calculated using the formula: C = 2 * pi * radius.
//    The result is a fractional number (double).
//    Use 3.14 as the value of pi.
//
//            Requirements:
//            •	In the printCircleCircumference method, you need to display the circle circumference,
//              which is calculated using the formula: 2 * pi * radius.
//            •	The main method should call the printCircleCircumference method with 5 as an argument.
//            •	The main method should not call a screen output method.
//            •	The program should display the circumference of a circle with a radius of 5.

    public static void main(String[] args) {
//     Given:
        printCircleCircumference(5);

    }

//    Given:
    public static void printCircleCircumference(int radius) {
        //write your code here
        double C;
        double pi = 3.14;

        C = 2.0 * pi * radius;

        System.out.println(C);

    }


}
