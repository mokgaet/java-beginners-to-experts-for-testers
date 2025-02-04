package Chapter8.UserExceptions;

public class StudentTester {
    public static void main(String[] args) {
        try {
            Student student = new Student("Ka", "KTSMTH001", 22, 50, 71);

            System.out.println(student.toString());
            System.out.println("Final Mark: " + student.calFinalMark(85));

        }catch (NoExamEntryException ex){
            System.err.print(ex.getMessage());
        } catch (IllegalArgumentException e){
            System.err.print(e.getMessage());
        }
    }
}
