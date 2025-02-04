package Chapter4;

import java.util.Scanner;

public class VoidMethods {

    /*
            --> Void Methods : are methods returns nothing , no return type.
                                return no data to the caller aka setter methods

            --> Static Methods:
                            Static methods belong to the class rather than any object of the class.
                            They can be called without creating an instance of the class and can only directly access other static members.
                            The most common example of a static method is the main method.
     */

    //-- Variable declaration at the class level : --> Global Variable

    static String firstName, lastName,employeeNumber;
    static int age ;
    static double height;


    //----------------Method Construction----------------------

    static void displayMessage(){
        System.out.println("\nChapter 4: Methods \nLearning Objective 1 : Method Constructions and Methods Calls");
    }


    static void getUserDetails(){
        /*
            --> getUserDetails method : used to get user details and do nothing about the details.
            --> Goal: to get used to method constructions and method calls
         */
        System.out.println("****************| Getting User Details | *****************");

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter firstname: ");
        firstName = sc.nextLine();

        System.out.print("Enter lastname: ");
        lastName = sc.nextLine();

        System.out.print("Enter employee number: ");
        employeeNumber = sc.nextLine();

        System.out.print("Enter age: ");
        age = sc.nextInt();

        System.out.print("Enter Height: ");
        height = sc.nextDouble();
    }

    static void displayUserDetails(){
        System.out.println("********************| Details for Employee Number : "+ employeeNumber + " |**********************");
        System.out.println("Fullname: "+ firstName +" "+lastName);
        System.out.println("Age: "+age + "\tHeight: "+ height);
    }


    public static void main(String[] args) {

        // ------------------- Method Calls

        displayMessage();

        getUserDetails();

        displayUserDetails();



    }

}
