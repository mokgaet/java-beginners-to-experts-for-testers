package Chapter1;

public class GetStarted {

    public static void main(String[] args) {
        System.out.println("Getting Started with JAVA FUNDAMENTALS");

        // declare
        //  Primitive Data Types
        int age;
        double height;
        float salary;
        boolean isContractor;
        char position; // S-senior , J-Junior , I-Intern

        String name; // String is an object type


        // Assign
        name = "Reitumetse";
        position = 'J';
        age = 23;
        height = 175.50;
        salary = 35000.50F;  // dealing with hard coded values--. Consider using float literals --> "F"
        isContractor = true;

        // display

        System.out.println("Name: "+name +"\nAge: "+age+ "\nPosition Code: "+position+ "\nHeight: "+height+ "\nSalary: "+salary+"\nIs a Contractor: "+isContractor);




    }

}
