package LevelThree;

import java.io.*;


public class PlanToConquerTheWorld {

//    Enter the number and name from the keyboard. Display the following string:
//    <name> will take over the world in <number> years. Mwa-ha-ha!
//
//    Here's an example:
//    Kevin will take over the world in 8 years. Mwa-ha-ha!
//
//    The order in which the data is input matters a lot.
//    Requirements:
//            •	The program should output text.
//            •	The program must read data from the keyboard.
//            •	The displayed text must contain the entered name.
//            •	The displayed text must contain the entered number.
//            •	The displayed text must fully match the task conditions.

//    This works, but does not meet final requirement.
//    public static void main(String[] args) throws Exception {
//
//        InputStream inputStream = System.in;
//
//        Reader inputStreamReader = new InputStreamReader(inputStream);
//
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//
//        String name = bufferedReader.readLine(); //Read a string from the keyboard
//
//        String number = bufferedReader.readLine(); //Read a string from the keyboard
//
//        int number1 = Integer.parseInt(number); //Convert the string to a number.
//
//        System.out.println(name + " will take over the world in " + number1 + " years. Mwa-ha-ha!");
//    }

    public static void main(String[] args) throws Exception {

        InputStreamReader sreader = new InputStreamReader (System.in);

        BufferedReader br = new BufferedReader (sreader);

        int age = Integer.parseInt(br.readLine());
        String name = br.readLine();

        System.out.println(name + " will take over the world in " + age + " years. Mwa-ha-ha! " );


    }


}
