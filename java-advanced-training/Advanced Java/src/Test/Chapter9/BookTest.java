package Chapter9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void testDetermineType(){
        int pages = 12;
        String expected = "Article";

        //Actual
        Book objBook= new Book();
      //  String actual = objBook.determineType(pages);

        // Assert

        //assertEquals(expected,actual, "The expected book type is "+expected);

        Assertions.assertAll( ()-> assertEquals("No type",objBook.determineType(0),"Expected No type"),
                ()-> assertEquals("Article",objBook.determineType(1)),
                ()-> assertEquals("Article",objBook.determineType(15)),
                ()-> assertEquals(" Research Paper ", objBook.determineType(16), "Expected Research Paper"),
                ()-> assertEquals(" Research Paper ", objBook.determineType(50),"Expected Research Paper"),
                ()-> assertEquals("Book" ,objBook.determineType(51),"Expected Book")

                );
    }

    @Test
    @DisplayName("Should not create a book with zero pages")
    void shouldNotCreateABookWithNoPages(){
        int pages = 0;

        Book objBook = new Book("ABC123","Unit Testing Prof",pages);

        //Assert
        //assertThrows(IllegalArgumentException.class, (Executable) objBook);
       assertThrows(IllegalArgumentException.class, ()-> new  Book("ABC123","Unit Testing Prof",pages));

    }
    //Method with constant values of different types
    @ParameterizedTest
    @CsvSource(value = {"ABC123, Unit Testing Textbook , 100" , "CBA 321 , Unit Testing Article , 10", "java-123321, Software Testing, 45"})
    //name (String), age (int) ,height isMarried (boolean)
    void MultipleDataTypes(String isbn , String title , int pages){
        Book objBook= new Book();
        assertEquals("Book", objBook.determineType(pages),pages +" pages");

    }




}