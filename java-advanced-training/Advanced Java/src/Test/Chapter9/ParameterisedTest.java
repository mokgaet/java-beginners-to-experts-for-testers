package Chapter9;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) //
public class ParameterisedTest {

    /*
        * The concept of parameterized tests allows us to execute a test method several times with
        * the possibility of passing in values for method parameters.
     */
    @ParameterizedTest(name = "Execution: {index} - Number: {arguments}")
    @ValueSource(ints = {12 , 19 ,10 ,30,22,100})
    void checkEvenNumbers(int numbers){
        assertEquals(0, numbers %2, numbers + " is not an even number");
    }
    @ParameterizedTest(name = "Execution: {index} - Word: {arguments}")
    @ValueSource(strings = {"dad", "aibohpphobia","taco cat","moon","sagas",})
    void testPalindrome(String words){
        StringBuilder sb = new StringBuilder(words);
        sb.reverse();
        assertEquals(words,sb.toString());
    }

    /*
        ********************** Using ScvSource****************************
     */
    //Method with constant values of different types
    @ParameterizedTest
    @CsvSource(value = {"Kate Smith, 25, 170.50, false" , "Rayners Thomas, 35 ,68.68, true"})
    //name (String), age (int) ,height isMarried (boolean)
    void MultipleDataTypes(String name , int age , double height, boolean isMarried){

        assertTrue(isMarried,name+" is not married");

    }
    /*
            *************************** Using Method Values *********************
     */

    /**
     * @param words items the list represented from the list
     */
    @ParameterizedTest
    @MethodSource("palindronmes")
    void testForPalindrome(String words){
        StringBuilder sb = new StringBuilder(words);
        sb.reverse();
        assertEquals(words,sb.toString());
    }

    static List<String> palindromes(){
        return new ArrayList<>(List.of("mom","sad", "coco", "level","cat",
                "tomato"));

    }

    static List<Integer> C(){
        return new ArrayList<>(List.of(11,54,21,12,61,25));
    }
//*********************************** Using MethodSource ********************************

    /**
     * Method fetches the books method from the chapter9 package , BooksBanks java file
     * @param book word to be searched in the book method
     */
    @ParameterizedTest
    @MethodSource("Chapter9.BookBanks#books")
    void testIfBookContainsMoney(String book){
        assertTrue(book.contains("Night"), "["+book +" ] doesn't contain the word 'Night' ");
    }


    //****************************** Using CsvFileSource ******************************
    @ParameterizedTest( name = "[ {index} ] - {0} is {2}")
    @CsvFileSource(files = "src/Test/resource/SuperStars.csv",numLinesToSkip = 1)
    void testForMarriedPersonnel(String name, int age , String career, double height, String nationality, boolean married){
        assertTrue(married,name + " is not married yet! ");
    }


}
