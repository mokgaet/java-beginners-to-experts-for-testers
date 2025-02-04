package Chapter1;

import javax.swing.*;
import java.util.Scanner;

public class UsingDialogBoxes {

    public static void main(String[] args) {
        int age;
        int birthYear;
        int hoursWorked;
        double salary;
        double deduction;
        String name, output;

        char role;

          /*
            ---> to declare constant variable use keyword -->> final
           */
        final int CURRENT_YEAR = 2025;
        final String COMPANY = "iLAB Quality";
        final double HOURLY_RATE = 350;
        final double TAX = 0.25;

        // get input from the user using DialogBoxes

        name = JOptionPane.showInputDialog("Enter your name: ");
        hoursWorked = Integer.parseInt(JOptionPane.showInputDialog("Enter Hours Worked: "));

        birthYear = Integer.parseInt(JOptionPane.showInputDialog("Enter Birth Year: "));

        role = JOptionPane.showInputDialog("Enter your role ( S-senior , J-Junior , I-Intern ) : ").charAt(0); // to access char input use that , since string is a collection of chars


        age = CURRENT_YEAR - birthYear;
        deduction = TAX * (hoursWorked * HOURLY_RATE);
        salary = (hoursWorked * HOURLY_RATE) - deduction;

        // display
     //   System.out.println("==== +++       " + COMPANY + "     +++ =====");
        //   System.out.println("Name: " + name + "\nAge: " + age + "\nRole: " + role + "\nHours Worked: " + hoursWorked + "\nSalary: " + salary);

        output = "==== +++       " + COMPANY + "     +++ ====="+"\n"+"Name: " + name + "\nAge: " + age + "\nRole: " + role + "\nHours Worked: " + hoursWorked + "\nSalary: " + salary;
        JOptionPane.showMessageDialog(null,output);

    }



    }
