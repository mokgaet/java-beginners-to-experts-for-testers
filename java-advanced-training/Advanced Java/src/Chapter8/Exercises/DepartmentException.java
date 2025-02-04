package Chapter8.Exercises;

public class DepartmentException extends Exception{

    public DepartmentException(String department, int department_id, int maxEmployees, String message){
        super("Error in department '" + department + "' with ID " + department_id + ". Max employees: " + maxEmployees + ". " + message);

    }
}

