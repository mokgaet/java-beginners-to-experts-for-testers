package Chapter9;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)  // USe a single test instance

public class CalculatorTest {

    Calculator calculator = new Calculator();
    static private final int num1 = 10;
    static private final int num2 = 12;

    /**
     * Testing sum using two numbers
     */
    @Test
    @DisplayName("Test for Sum: " + num1+" + "+num2)
    void testSum(){
        assertEquals(num1 + num2 , calculator.Sum(num1,num2), "Incorrect addition !");
    }

    /**
     * Test the difference of two numbers
     */
    @Test
    @DisplayName("Test for Subtraction: " + num2+" - "+num1)
    void testDifference(){
        assertEquals(num2-num1 , calculator.Difference(num1,num2), "Incorrect difference !");
    }

    /**
     * Test the quotient of two numbers using multiple values
     * @param i1 first number
     * @param i2 second number
     */
    @ParameterizedTest(name = "Test for Quotient: {index} Formula: {0} / {1}")
    @CsvSource(value = {"111,11", "-6,2", "0,5"})
    void testQuotient(int i1, int i2){
        double expected = (double) i1 /i2;
        assertEquals(expected , calculator.Quotient(i1,i2), "Incorrect quotient !");
    }

    /**
     * Test the product of two numbers using multiple values
     * @param a number 1
     * @param b number 2
     */
    @ParameterizedTest(name = "Test for Product: {index} Formula: {0} x {1}")
    @CsvSource(value = {"111,11", "-6,2", "0,5"})
    void testProduct(int a , int b){
        int expected = a * b;
        assertEquals(expected , calculator.Product(a,b), "Incorrect multiplication !");
    }

    /**
     * testDividideByZero is a method that test for dividing with 0
     * @param a numerator
     * @param b base number that is zero
     */
    @ParameterizedTest(name = "Test for dividing by 0: {index} Formula: {0} / {1}")
    @CsvSource(value = {"111,0",  "-6,0", "0,0"})
    public void checkForDivideByZero(int a , int b) {
       ArithmeticException exception = assertThrows(ArithmeticException.class, () -> calculator.Quotient(a,b));
        assertThrows(ArithmeticException.class, () -> calculator.Quotient(a,b));
    }


    @ParameterizedTest(name = "Test for dividing by 0: {index} Formula: {0} / {1}")
    @CsvSource(value = {"111,0",  "-6,0", "0,0"})
    public void testDivideByZero(int a , int b) {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> calculator.Quotient(a,b));
        String expected = ArithmeticException.class + ": Cannot divide by zero.";

        assertEquals(expected, exception.toString());
      // System.out.println(expected + " --- "+exception.toString() );
        //getMessage() --> "Cannot divide by Zero" , toString() --> Exception class + message
    }
    /**
     * Cleaning up the object variable
     */
    @AfterAll
    void tearDown(){
        calculator = null;
    }



}
