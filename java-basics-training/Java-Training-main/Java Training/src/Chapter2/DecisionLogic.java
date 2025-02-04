package Chapter2;

import java.util.Scanner;

public class DecisionLogic {

    public static void main(String[] args) {

        /*                  **** Notes: Decision Logic ****

               ------ single if statement--------
                * if statement with no else or more if
                * * Any statement inside curly brackets {} can not be accessed outside that block.
                * If you have more than one statement after your single if-statement, you must enclose them into curly brackets{}

                ------- binary if statement-----
                * if and else statement blocks enclosed in curly brackets

                -------- if..else if statements
                * Where you do multiple checks , also enclosed in curly brackets.


         */

        // ======================================Chapter 2 Exercise - Page 26 ==========================

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");

        String sentence = sc.nextLine();

        char rule = (sentence.toUpperCase()).charAt(0) ;

        if (sentence.charAt(0) == rule){
            System.out.println("Valid entry - sentence start with a capital letter. ");
        } else {
            System.out.println("Invalid entry – sentence should start with a capital letter. ");
        }

        // ============================== End of Chapter 2: Exercise ==================================


    } // end of main

}
/*          --In Conclusion--
    -> “if”—use when you want to do one thing or nothing.
    -> “if, else”—use when you want to do one thing or another.
    -> “if, else if”—use when there are three or more resulting actions.

 */