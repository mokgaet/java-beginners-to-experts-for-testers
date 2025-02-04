package Chapter9;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionTester {

    @Test
    void testCalculation(){
        //Assign
        int num1 = 1 , num2 = 2;
        int expected = 3;
        String name1 = "Smith" , name2 = "smith";
        int[] numbers = {11,21,31};
        int[] ages = {11,21,31};

        // Act(ual) -
         int actual = num1 + num2;

        // Assert - Validation section

        //assertEquals(expected,actual,"The expected should be 3");

        /*
          *
         */
       // assertTrue(actual == expected);

        /*
         * This assertion checks whether two references point to the same object in memory
         * What Works? If you want assertSame() to pass, you must make both references point to the same object
         */
       // assertSame(numbers,ages);  // checks if both references point to the same object in memory
        /*
          * Compares content of the arrays not (reference) memory location
         */
       // assertArrayEquals(numbers, ages);
        //
        // assertNotSame(name1,name2);
        // Assertion. asserAll -- makes sure that all the assertions execute regardles of wherher some fail or not
        Assertions.assertAll( () -> assertTrue(actual == expected),
                () -> assertSame(numbers,ages),
                () -> assertNotSame(name1,name2),
                () -> assertEquals(expected,actual),
                () -> assertArrayEquals(numbers, ages)

        );



    }


}
