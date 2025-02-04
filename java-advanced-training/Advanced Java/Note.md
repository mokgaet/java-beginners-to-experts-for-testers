# Chapter 7 - Class and Objects

## Class vs. Objects
| Class                   | Object                 |   |
|-------------------------|------------------------|------------|
| A blueprint of an object | an instance of a class | Definition |
| When a class is created, no memory is allocated.            | Objects are allocated memory space whenever they are created.         | Memory     |
| A class is a logical entity.         | An object is a physical entity.         | Entities   |

	
**A class is made us of variables and functions(methods)**
- class variable
- class methods (Accessors and Mutators)

## Constructor
- A method with the same name as the class
- A special method is used to instantiate the object of the class
- It has no return type
- Must be accessed outside the class, so it must be public access modifier

> A Constructor can be private only if you are using **Singleton design pattern** ,  ensures that a class has only one instance throughout the program and provides a global point of access to it.
> For Example , You want only one database connection to avoid conflicts 

## this keyword
- The _this_ keyword is a reference to the current instance of the class in which it is used.

- Use _this()_ to call another constructor in the same class (constructor chaining).

## Setter and Getter Methods

| Setters                                                                                   | Getter                 |
|-------------------------------------------------------------------------------------------|------------------------|
| Methods that set or change the value stored inside a field are called setters or mutators | methods that retrieve the value stored inside afield are called getters or accessors.|

## Enumeration
`enum BankType {
        FNB , ABSA , CAPITEC, TYME BANK; }`
- used to represent a group of related predefined values [Constants]
- enum they are structure like a class so they can be declare inside or outside a class for usage

## public , private and protected
`protected`
- Accessable within the class and outside the class of the same pakage.

`private`
- Only accessable within the class

`public` 
- Access in and outside the class

## super keyword

`super`
- keyword used to reference/ call the constructor of the parent class

## Abstraction
> An abstract class is a class that cannot be instantiated directly. 
> It serves as a blueprint for other classes to derive from.
## Interface
> An interface is a reference type in Java, it is similar to a class, 
> and it is a collection of abstract methods and static constants.
## abstract class vs. interface


| Abstract                                                                                                 | Interface                                                                           |                     |
|----------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------|---------------------|
| Cannot be instantiated; contains both abstract (without implementation) and concrete methods (with implementation) | Specifies a set of methods a class must implement; methods are abstract by default. | Definition          |
| class can inherit from only one abstract class.                                                          | A class can implement multiple interfaces.                                          | Inheritance         |
| `extends` the Parent Class                                                                               | `implements` the Parent Class                                                       | Inheritance         |
| Abstract classes cannot be directly instantiated, meaning you cannot create objects of an abstract class. | Methods are abstract and public by default                                          | Methods and Classes |
|                                                                                                          |                                                                                     |                     |



# Chapter 8 : Exceptional Handling

## Exceptions
> An exception is an unexpected or error condition, an event that disrupts the normal flow of
  instructions during program execution

> an event that disturb the normal flow of the program. Exception are used to give descriptive feedback

| Error                                                                                                     | Exception                                                                       |                     |
|-----------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------|---------------------|
| An Error indicates a serious problem that a reasonable application should not try to catch.               | Exception indicates conditions that a reasonable application might try to catch | Definition          |
| Caused by issues with the JVM or hardware.                                                                | Caused by conditions in the program such as invalid input or logic errors.      | Cause               |
| `OutOfMemoryError` and `StackOverFlowError`                                                                | `IOException` and `NullPointerException`                                            | Example             |
|                                                                                                           |                                                                                 |                     |

### try - catch statement
`try  
{ 
//statemets that might throw an exception 
} catch (Exception e) 
{ 
//actions to take if exception occurs 
} `

## throw vs. throws

| throw                                                                                       | throws                                                          |            |
|---------------------------------------------------------------------------------------------|-----------------------------------------------------------------|------------|
| It is used to explicitly throw an exception. | It is used to declare that a method might throw one or more exceptions. | Definition |
| It is used inside a method or a block of code                                                 | It is used in the method signature.      | Location   |
| The method or block throws the exception.                                                 | The method’s caller is responsible for handling the exception.  | Responsibility    |
|                                                                                             |                                                                 |            |
|    `throw new ArithmeticException(“Error”);`                                                                                         |      `public void myMethod() throws IOException {}`                                                           |        Example    |

* Self Created Exceptions must extend the `Exception`class.

[More Explanation of Exceptions](https://www.w3schools.com/java/java_ref_errors.asp)

# Chapter 9 - Unit Testing
 
> Unit Testing - aka Component testing, testing of individual units of the code. ( classes, packages, functions)

> Test Coverage -  number of testcases executed over the number of testcases needed.

### Tool used for unit testing is JUnit

#### JUnit is an open-source testing framework used for creating and executing automated tests that are repeatable, it is extensively used in industry. 

**JUnit provides:**

* Assertions for testing expected results.
* Test feature for sharing common test data.
* Test suits easily organizing and running tests.
* Graphical and textual test runners

**Unit is used for testing:**
* An entire object
* Part of the object – a method or module 
* Interaction between objects. 

### Parameterization Test
> The concept of parameterized tests allows us to execute a test method several times with
the possibility of passing in values for method parameters


### Using @ValueSource – pass constant values.
`@ParameterizedTest
@ValueSource(ints = {12,34,17,18,23})
void testIsEven(int numbers){
assertEquals(0, numbers %2, numbers + " is not an even number");
}`

- This method takes five integer values and uses them as parameters, the logic of the method
checks if each integer value is an even number.

`@ParameterizedTest
@ValueSource(strings = {"dad", "mom","taco cat","moon","sagas"})
void testPalindrome(String words){
        StringBuilder sb = new StringBuilder(words);
         sb.reverse();
        assertEquals(words,sb.toString());
}`
- This method takes five strings values as parameters, the logic of the method checks if each word is a palindrome. 

### Using CsV ( Comma Separated Values)
> Using @CvSource – pass comma separated values of different data types:

`//Method with constant values of different types
@ParameterizedTest
@CsvSource(value ={"Roger,1.79,Swiss,true","Jordan,1.85,USA,true","Charlize,1.77,RSA,false"})
`
`void csv_stringIntBoolean(String name, double height, String nationality,boolean isMarried){
    System.out.println("name = " + name + ", height = " + height + ",
    nationality = "+ nationality + ", isMarried = " + isMarried);
    assertEquals(true,isMarried);`
 
` } `
### Using MethodSource
- Using `@MethodSource` – allows you to reference one or more methods within the test class
or from external class. 


### difference between Method Values and Method Source
Method Values - used with the same class
Method Source - used when you access methods from different file/package

### The importance of `@TestInstance(TestInstance.Lifecycle.PER_CLASS)` before class definition when doing unit testing
- Only one instance of the test class is created and reused for all test methods.

### assertThrows()
`assertThrows(Class<T> expectedType, Executable executable);`
- `expectedType` – The type of exception expected (e.g., `IllegalArgumentException.class`)
- `executable` – The code that should throw the exception (usually a lambda expression)

* `assertThrows()`is used to test whether a method throws an exception as expected.
* It ensures that a specific exception type is thrown during execution.



# Chapter 10 - File Input and Output


## Difference between Absolute path and relative path

*Absolute path* 
* full and complete path, it does not need any other information to
locate the file on the system. 
* For example, C:\Java\Chapter.10\Example.txt is an absolute path.

*Relative path*
* this depends on other information. If only the file name is specified,the file is assumed to be located within the same directory as the program using it. 
* For example, a path such as Chapter.10\Example.txt, the Chapter.10 folder is assumed to be the subfolder of the current directory. 




