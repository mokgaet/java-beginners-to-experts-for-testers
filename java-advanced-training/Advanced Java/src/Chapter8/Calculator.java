package Chapter8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private int num1,num2;

    public Calculator(int num1,int num2){
       setNum1(num1);
        setNum2(num2);
    }

    public int getNum1() {
        return num1;
    }
    public int getNum2() {
        return num2;
    }

    public void setNum1(int num2) {
        if (num2 == 0)
            throw new ArithmeticException("Cannot divide by zero.");

        this.num2 = num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public double Sum (double a, double b){
        return a+b;
    }

    public double Product (double a, double b){
        return a*b;
    }
    public  double Quotient (double a, double b) throws ArithmeticException{
        return a / b;
    }

    public double Difference (double a, double b){
        return b-a;
    }



}
