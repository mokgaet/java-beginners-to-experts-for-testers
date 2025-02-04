package Chapter8.Exercises;

public class DepartmentExceptionTester {

    public static void main(String[] args) throws DepartmentException {

       /*{ TEST DATA
           Department department = new Department("IT", 101, 5); --> {"IT", 101, 5},       // Valid
           Department department = new Department("HR", 200, 5); ---> {"HR", 200, 4},       // Valid
           Department department = new Department("ABCDE", 150, 6);---> {"A", 150, 6},      // Invalid department name
           Department department = new Department("CS", 500, 7);---> {"CS", 500, 7},       // Invalid department ID
           Department department = new Department("RD", 300, 3); --->{"RD", 300, 3},       // Invalid max employees
           Department department = new Department("FN", 120, 11);    {"FN", 120, 11}       // Invalid max employees
        };*/
        Department[] departments = {
                new Department("IT", 101, 5),// valid
                new Department("HR", 200, 5), //valid
                new Department("CS", 500, 7), //invalid department id
                new Department("ABCDE", 150, 6), // Invalid department name
                new Department("RD", 300, 3),// Invalid max employees
                new Department("FN", 120, 11) // Invalid maxEmployees
        };

        try {
            //Department department = new Department("IT", 101, 5);

            for (int i = 0 ; i < departments.length ; i++){
                System.out.println("Successfully created: " + departments[i]);
            }



        } catch (IllegalArgumentException e) {
            System.out.println("Unsuccessful creation: " + e.getMessage());
        }

    }


}
