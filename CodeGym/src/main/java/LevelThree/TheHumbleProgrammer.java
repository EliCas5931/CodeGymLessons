package LevelThree;

import java.io.*;

public class TheHumbleProgrammer {

//    Use the keyboard to enter a name and display the following:
//    <name> makes $120,000 a year. Ha-ha-ha!
//
//    For example:
//    Sara makes $120,000 a year. Ha-ha-ha!
//
//    Requirements:
//            •	The program should output text.
//            •	The program must read data from the keyboard.
//            •	The displayed text must contain the entered name.
//            •	The displayed text must fully match the task conditions.

    public static void main(String[] args) throws Exception {

        InputStreamReader sread = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(sread);

        String name = br.readLine();

        System.out.println(name + " makes $120,000 a year. Ha-ha-ha!");

    }


}
