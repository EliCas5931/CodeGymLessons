package LevelThree;

public class TimeConversion {

//    Add a public static int convertToSeconds(int hour) method that converts hours to seconds.
//    Call it twice in the main method with any arguments.
//    Display the results, each time on a new line.
//
//            Requirements:
//            •	Add the convertToSeconds method. It must be public static, and take and return ints.
//            •	The convertToSeconds method must convert the passed number of hours to seconds.
//            •	The main method must call the convertToSeconds method twice.
//            •	The main method should display the result of the calls, each time on a new line.
//            •	The convertToSeconds method should not display anything.

    public static void main(String[] args) {
        System.out.println(convertToSeconds(2));
        System.out.println(convertToSeconds(5));

    }

    public static int convertToSeconds(int hour) {
        int min = hour * 60;
        int sec = min * 60;

        return sec;
    }

}
