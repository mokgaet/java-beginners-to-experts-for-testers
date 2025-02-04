package Chapter1;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        int age ;
        int birthYear;
        int hoursWorked;
        double salary;
        double deduction;
        String name;
        char role;

          /*
            ---> to declare constant variable use keyword -->> final
           */
        final int CURRENT_YEAR = 2025;
        final String COMPANY  = "iLAB Quality";
        final double HOURLY_RATE = 350;
        final double TAX = 0.25;

        // get input from the user

        Scanner input = new Scanner(System.in);  // in - input , then the System is the class

        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter Hours Worked: ");
        hoursWorked = input.nextInt();
       // input.nextLine();   // move the cursor to the next line

        System.out.print("Enter Birth Year: ");
        birthYear = input.nextInt();

        System.out.print("Enter your role ( S-senior , J-Junior , I-Intern ) : ");
        role = input.next().charAt(0); // to access char input use that , since string is a collection of chars


        age = CURRENT_YEAR - birthYear;
        deduction =  TAX *(hoursWorked * HOURLY_RATE );
        salary = (hoursWorked * HOURLY_RATE ) - deduction;

        // display
        System.out.println("==== +++       "+COMPANY +"     +++ =====");
        System.out.println("Name: "+name +"\nAge: "+age+"\nRole: "+ role +"\nHours Worked: "+hoursWorked+ "\nSalary: "+salary );





    }
}
