package LevelTwo;

public class MinimumOfFourNumbers {

//    Write a function that computes the minimum of four numbers.
//    The function min(a, b, c, d) should use (call) the function min(a, b)
//
//    Hint:
//    You need to write the body of the two existing min functions.
//
//    Requirements:
//            •	The program should display text on the screen.
//            •	The min methods should not display text on the screen.
//            •	The main method should call min(a, b) and min(a, b, c, d).
//            •	The main method should display the result of the min methods. Each time, on a new line.
//            •	The min(a, b) method must return the minimum of the numbers a and b.
//            •	The min(a, b, c, d) method must use the min(a, b) method.
//            •	The min(a, b, c, d) method must return the minimum of the numbers a, b, c, and d.

    public static int min(int a, int b, int c, int d) {
        //write your code here
        int min1 = min(a, b);
        int m;

        if (min1 <= c && min1 <= d) {
            m = min1;
        } else if (c <= min1 && c <= d) {
            m = c;
        } else if (d <= min1 && d <= c) {
            m = d;
        } else {
            return 0;
        }

        return m;
    }

    public static int min(int a, int b) {
        //write your code here
        int m;

        if (a < b) {
            m = a;
        } else {
            m = b;
        }

        return m;

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
        System.out.println(min(-40, -10, -30, 40));
    }

}
