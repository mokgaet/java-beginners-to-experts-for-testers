package Chapter3;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {

        /*
            While Loop - execute will the condition is true and terminate when it is false.
            Two things :
                     ---> Need a loop control variable , which is initialized before the while loop
                     ---> inside the loop should change the value of the loop control variable
            REMEMBER:
                c = c+1 ; is the same as --> c+=1; or/and c++;

         */


        // The user should enter a name that is atleast 3 characters long
        System.out.println("*****************************");

        String name;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();
        int length = name.length();

        while(length != 3){
            System.out.print("Invalid entry, please enter name that has 3 characters: ");
            name = sc.nextLine();
            length = name.length();
        }
        System.out.println("Name: " +name);


    }
}
