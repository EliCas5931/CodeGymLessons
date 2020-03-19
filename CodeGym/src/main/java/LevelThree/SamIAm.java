package LevelThree;

public class SamIAm {

//    Display all possible combinations of the words "Sam", "I", "Am".
//
//    Hint: there are 6 combinations.
//    Display each combination on a new line. Do not separate the words.
//
//            Consider this example:
//              IAmSam
//              AmSamI
//              ...
//
//    Requirements:
//            •	The program should output text.
//            •	The displayed text should contain 6 lines.
//            •	The text on each line must be unique.
//            •	All possible combinations should be displayed.


    public static void main(String[] args) {

        String a = "I";
        String b = "Am";
        String c = "Sam";

        System.out.println(a + b + c);
        System.out.println(b + c + a);
        System.out.println(c + a + b);
        System.out.println(a + c + b);
        System.out.println(b + a + c);
        System.out.println(c + b + a);

    }

}
