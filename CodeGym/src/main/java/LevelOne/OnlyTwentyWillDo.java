package LevelOne;

public class OnlyTwentyWillDo {

//    In the main method, place plus and minus signs correctly so that the variable result is equal to 20.
//    Signs must be placed only in the line where the variable result is declared.
//    Do not change the order of the variables in this line.
//    Each variable must be preceded by either a plus or minus sign.
//
//    Code given:
    public static int a = 1;
    public static int b = 3;
    public static int c = 9;
    public static int d = 27;

//    Requirements:
//            •	Values ​​of variables: Do not change a, b, c, or d.
//            •	Each of the variables (a, b, c, and d) in the line where the variable result is declared must be preceded by either a plus or minus sign.
//            •	The program should display the number 20 on the screen.
//            •	The plus and minus signs must be placed correctly.

    public static void main(String[] args) {

//      Code given:
//      int result = + a + b + c + d;

//      Correct answer:
        int result = - a + b - c + d;

        System.out.println(result);

    }
}
