package Chapter2;

public class TernaryOperator {

    public static void main(String[] args) {

        /*
                             -----  Notes: Ternary Operators -------

                Syntax : condition(theExpression) ? valueWhenTrue : valueWhenFalse
                aka conditional operator - a shorter vision of binary if statement ( if ... else statement)

                NB:Only use the ternary operator in simple situations that needs a single statement inside either true or
                false clause of the If statement.
         */

        int age = 15;

        String output = (age>=18) ? "Can vote :) " : "Cannot vote :( ";

        System.out.println(  output );
        System.out.println("========================================");

        int number = 10;
        String results = "unknown";

        results = (number % 2 == 0) ? "Even" : "Odd";  // Explanation : if (number % 2==0) then assign Even to results variable , else assign Odd.

        System.out.println(results);
        System.out.println("========================================");

        int num=5;
        String r;

        r =  (num %2 == 0 ) ? "Even" : ( (num %3 == 0 ) ? "Multiple of 3": ( (num % 5 == 0) ? "Multiple of 5" : "Odd" )  );

        System.out.println(num + " is: " + r);

    }
}
