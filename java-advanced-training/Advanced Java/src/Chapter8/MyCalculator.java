package Chapter8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyCalculator {

    static double Sum (double a, double b){
        return a+b;
    }

    static double Product (double a, double b){
        return a*b;
    }
    static  double Quotient (double a, double b) throws ArithmeticException{
        return a / b;
    }

    static double Difference (double a, double b){
        return b-a;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 ,num2 ;
        try {
            System.out.print("Enter value 1:");
            num1 = sc.nextDouble();
            System.out.print("Enter value 1:");
            num2 = sc.nextDouble();

            System.out.println("----------------------");
            System.out.println("Sum: "+ Sum(num1,num2) +"\nMultiplication:" +Product(num1,num2)+"\nDivision: "+ Quotient(num1,num2)+"\nSubtraction: "+Difference(num1,num2));

        }catch (InputMismatchException e){
            System.err.println("Error Message: "+ e.fillInStackTrace());
        }catch (ArithmeticException e)
        {
            System.err.println(e.getMessage());
        }finally {
            sc.close();
        }

    }
}
