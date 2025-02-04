import org.junit.jupiter.api.*;

public class AnnotationTest {
    @Test
    void welcomeTestMethod(){
        System.out.println("@Test : Welcome to Chapter 9 - Unit Testing (Message 1)");
    }
    @BeforeAll
    static void beforeEverthingElse(){
        System.out.println("@BeforeAll : Execute before all the test methods");
    }
    @BeforeEach
    void beforeEachMethod(){

        System.out.println("@BeforeEach : the preconditions for the test, this method must be " +
                "executed  before every test in the class. ");
    }

    @AfterEach
    void afterEachMethod(){
        System.out.println("@AfterEach : Specifies that this method will be executed " +
                "following the completion of each test. ");
    }

    @AfterAll
    static void afterEverythingElse(){
        System.out.println("@AfterAll: Execute after all the test methods");
    }
    @Test
    void anotherTestMethod(){
        System.out.println("@Test - Another Welcome to Chapter 9 - Unit Testing ( Message 2)");
    }



}
