package Chapter2;

import javax.swing.*;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int sum, difference,product;
        double remainder,  quotient;

        int num1  = 10;//= JOptionPane.showInputDialog("Enter the first number");
        int num2 = 25;

        sum = num1 + num2;
        difference = num2 - num1;
        remainder = num2 % num1;
        product = num2*num1;
        quotient = num2/num1;

        String output = "Sum: "+ sum + "\nQuotient: "+ quotient +"\nProduct: "+ product +"\nDifference: "+ difference  +"\nRemainder: "+ remainder;

        System.out.println(output);

    }
}
