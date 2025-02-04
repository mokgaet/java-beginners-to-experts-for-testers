package Chapter1;

public class UsingConstant {

    public static void main(String[] args) {
          int age ;
          int birthYear;
          int hoursWorked;
          double salary;
          double deduction;
          String name;

          /*
            ---> to declare constant variable use keyword -->> final
           */
          final int CURRENT_YEAR = 2025;
          final String COMPANY  = "iLAB Quality";
          final double HOURLY_RATE = 350;
          final double TAX = 0.25;

          //Use - calculate age and salary
        name = "Remember";
        hoursWorked = 80;
        birthYear = 1995;
        age = CURRENT_YEAR - birthYear;
        deduction =  TAX *(hoursWorked * HOURLY_RATE );
        salary = (hoursWorked * HOURLY_RATE ) - deduction;

        // display
        System.out.println("==== +++       "+COMPANY +"     +++ =====");
        System.out.println("Name: "+name +"\nAge: "+age+ "\nHours Worked: "+hoursWorked+ "\nSalary: "+salary +"\nDeduction (tax): "+ deduction);





    }
}
