package LevelTwo;

import static jdk.nashorn.internal.objects.Global.print;

public class ImplementPrintMethod {

//    In the print method, display the passed string 4 times. Each time, on a new line.
//
//            Requirements:
//            •	The program should display text on the screen.
//            •	The main method should not call System.out.println or System.out.print.
//            •	The print method should display the text on the screen.
//            •	The main method should call the Solution class's print method exactly three times.
//            •	The print method should display the string 4 times. Each time, on a new line.

    public static void main(String[] args) {

//        Given code:
        print("Java is easy to learn!");
        print("Java is object-oriented!");
        print("Java is platform-independent!");

    }

//    public static void print(String s) {
//        //My code that they approved
//
//        System.out.println(s);
//        System.out.println(s);
//        System.out.println(s);
//        System.out.println(s);
//
//    }
//    For fun but not sure if accepted:
    public static void print(String s) {

        for (int x = 1; x <= 4; x++) {

            System.out.println(s);

        }
    }

}
