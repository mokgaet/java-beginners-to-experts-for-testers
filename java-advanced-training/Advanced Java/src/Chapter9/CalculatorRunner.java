package Chapter9;

public class CalculatorRunner {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int num1 = 10 , num2 = 0;

        System.out.println("Sum: "+num1 +" + " + num2 + " = " +(int) calculator.Sum(num1,num2) );
        System.out.println("Difference : "+ num2 +" - " + num1 + " = " +(int) calculator.Difference(num1,num2));
        System.out.println("Multiplication: "+ num1 +" x " + num2 + " = " +(int) calculator.Product(num1,num2));


        try{
            System.out.println("Quotient: "+ num1 +" / " + num2 + " = " + calculator.Quotient(num1,num2));
        } catch (ArithmeticException e) {
            System.out.println("Exception on Quotient: " + e.getMessage());
        }



    }
}
