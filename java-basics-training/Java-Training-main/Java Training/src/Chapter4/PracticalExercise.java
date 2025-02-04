package Chapter4;

import java.util.Scanner;

public class PracticalExercise {

    static final int CURRENT_YEAR = 2025;   //--> constant variable
    static String firstname, lastname;
    static int birthYear, testMark;

    // greeting : the method should display a greeting message.
    static void greetings(){
        System.out.println("Welcome to the Student Marks Portal");
    }

    // -- determineGrade : the method should receive a test mark, determines, and return  the grade.
    static String determineGrade(int testMark){
        String grade = "";

        if (testMark < 40 ){
            grade = "F";
        }else if (testMark >= 40 && testMark <=49){
            grade = "D-";
        }else if (testMark >= 50 && testMark <=59){
            grade = "D";
        }else if (testMark >= 60 && testMark <=69){
            grade = "C";
        }else if (testMark >= 70 && testMark <=79){
            grade = "B";
        }else if (testMark >= 80 && testMark <=89){
            grade = "A";
        }else if (testMark >= 90){
            grade = "A+";
        } else{
            grade = "Invalid marks given!";
        }
        return grade;
    }

    //determineAge(year) -  the method receives the student’s birth year, determines, and returns the current age of the student.
    static int determineAge(int birthYear){
        int age = CURRENT_YEAR - birthYear;
        return age;
    }

    // displayOutput() – the method should display the details of the student as follows: firstname, last name, age, and grade.
    static void displayOutput(){
        String output = "FirstName: "+ firstname +
                        "\nLastName: "+lastname +
                        "\nAge: " + determineAge(birthYear)+
                        "\nGrade: "+ determineGrade(testMark);

        System.out.println(output);
    }

    // get user input
    static void getUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Firstname: ");
        firstname = sc.nextLine();

        System.out.print("Enter LastName: ");
        lastname = sc.nextLine();

        System.out.print("Enter Birth-Year: ");
        birthYear = sc.nextInt();

        System.out.print("Enter TestMarks: ");
        testMark = sc.nextInt();

    }

    public static void main(String[] args) {

        //Method calls

        greetings();
        getUserInput();
        displayOutput();



    }


}

