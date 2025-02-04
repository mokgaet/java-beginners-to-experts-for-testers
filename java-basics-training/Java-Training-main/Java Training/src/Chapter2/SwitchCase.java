package Chapter2;

public class SwitchCase {

    public static void main(String[] args) {
        /*
        The switch statement uses four keywords:
                1. Switch – starts the statement.
                2. Case – followed by one of the possible values to test the expression.
                3. Break – terminates a switch statement.
                4. Default – optionally used when there is any other action that should occur if the test
                            variable does not match any cases.
         */

        int day = 3;
        String day_of_the_week;
        switch (day){
            case 1:
                day_of_the_week = ("Monday");
                break;
            case 2:
                day_of_the_week = ("Tuesday");
                break;
            case 3:
                day_of_the_week = ("Wednesday");
                break;
            case 4:
                day_of_the_week=("Thursday");
                break;
            case 5:
                day_of_the_week = ("Friday");
                break;
            case 6:
                day_of_the_week = ("Saturday");
                break;
            case 7:
                day_of_the_week = ("Sunday");
                break;
            default:
                day_of_the_week = ("Invalid");
        }
        System.out.println(day_of_the_week +"\n********************************************");

        String supervisor;
        int department_id = 5;

        switch (department_id){
            case 1:
            case 2:
            case 5: // or in short case 1,2,5:
                supervisor = ("Smith");
                break;
            case 3:
                supervisor = ("Jones");
                break;
            case 4:
                supervisor = ("Mokoena");
                break;
            default:
                supervisor = ("Unassigned Supervisor");
        }
        System.out.println(supervisor);
    }
}
