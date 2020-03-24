package LevelThree;

import java.io.*;

public class Predictions {

//    Use the keyboard to separately enter the name, number1, and number2.
//    Display the following phrase:
//    <name> will receive <number1> in <number2> years.
//
//    Here's an example:
//    Nick will receive 10000 in 5 years.
//
//            Requirements:
//            •	The program should output text.
//            •	The program must read data from the keyboard.
//            •	The displayed text must contain the entered name.
//            •	The displayed text must contain the entered number1.
//            •	The displayed text must contain the entered number2.
//            •	The displayed text must fully match the task conditions.

    public static void main(String[] args) throws Exception {

        InputStreamReader sread = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(sread);

        String name = br.readLine();

        int number1 = Integer.parseInt(br.readLine());
        int number2 = Integer.parseInt(br.readLine());

        System.out.println(name + " will receive " + number1 + " in " + number2 + " years.");


    }

}
