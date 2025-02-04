package Chapter8.Exercises;

public class Department {

    private String department_name  ;
    private int department_id, maxEmployee;

    /**
     *
     * @param department_name organization's department (for example,IT)
     * @param department_id a department ID (for example, 101)
     * @param maxEmployee  maximum number of employees  (for example, 5)
     */

    public Department(String department_name, int department_id, int maxEmployee) throws DepartmentException , IllegalArgumentException{

           setDepartment_name(department_name);
           setDepartment_id(department_id);
           setNumOfEmployee(maxEmployee);
    }

    public void setDepartment_name(String department_name) {
        if ( ( department_name.length() != 2) || (department_name == null))
            throw new IllegalArgumentException("Department name must consist of exactly two letters.");
        this.department_name = department_name;
    }

    public void setDepartment_id(int department_id) {
        if ( (department_id < 100) || (department_id > 499) )
            throw new IllegalArgumentException("Department ID does not consist of three digits between 100 and 499");
        this.department_id = department_id;
    }

    public void setNumOfEmployee(int maxEmployee) {
        if ( ( maxEmployee <= 3) || (maxEmployee >= 10))
            throw new IllegalArgumentException("Max employees must be between 4 and 10");
        this.maxEmployee = maxEmployee;
    }

    public String toString() {
        return "Department [ Name: " + department_name + ", ID: " + department_id + ", MaxEmployees: " + maxEmployee+"]";
    }

    public int getNumOfEmployee() {
        return maxEmployee;
    }
    public String getDepartment_name() {
        return department_name;
    }
    public int getDepartment_id() {
        return department_id;
    }

}
