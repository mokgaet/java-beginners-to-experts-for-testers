package Chapter8.UserExceptions;

/*
    * Throw illegal argument exception if the student name is null or less than 3 characters, test 1 , test 2 and assignemnt are less than 0 or 100
 */
public class Student {
    private String studentNumber , studentName;
    private int test1 , test2, Assignment;

    public Student(String studentNumber, String studentName, int test1, int test2, int assignment) throws NoExamEntryException , IllegalArgumentException {
        setStudentNumber(studentNumber);
        setStudentName(studentName);
        setTest1(test1);
        setTest2(test2);
        setAssignment(assignment);
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
       this.studentNumber = studentNumber;
 }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
         if ( ( studentName.length() <= 3) || (studentName == null))
            throw new IllegalArgumentException("Student Name can not be less that 3 characters OR null");
         this.studentName = studentName;
    }

    public int getTest1() {
        return test1;
    }

    public void setTest1(int test1) {
        if ( (test1> 100) || (test1 < 0))
            throw new IllegalArgumentException("Current Test 1 Mark is " +test1+" , which is not between 0 and 100"+test1);
        this.test1 = test1;
    }

    public int getTest2() {
        return test2;
    }

    public void setTest2(int test2) {
        if ( (test2> 100) || (test2 < 0))
            throw new IllegalArgumentException("Current Test 2 Mark is " +test2+" , which is not between 0 and 100");
        this.test2 = test2;
    }

    public int getAssignment() {
        return Assignment;
    }

    public void setAssignment(int assignment) {
        if ( (assignment> 100) || (assignment < 0))
            throw new IllegalArgumentException("Assignment Marks must be between 0 and 100, Current Assignment Mark is "+ assignment);
        this.Assignment = assignment;
    }

    /**
     *  calculates and return semester marks as:
     *  (33% of test 1) + (34% of test 2) + (33% of assignment)
     * @return Semester marks
     */
    public double calcSemesterMark(){
        double Semester_Mark = ( (0.33*this.test1 ) +(0.34*this.test2) +(0.33*this.Assignment) );
        if (Semester_Mark < 45)
            throw new NoExamEntryException("Student (" +getStudentName() + " ) didn't qualify for the Exam. The current semester mark is " + Semester_Mark);
        return Semester_Mark;
    }

    /**
     *  Calculate the exam Mark Methods
     * @param examMark Exam Mark
     * @return Final Mark ( calculated as average of examMark and SemesterMark)
     */
    public  double calFinalMark(double examMark){

        return  (int) ( (examMark + calcSemesterMark())/2 );
    }

    @Override
    public String toString() {
        return "Student Name: "+ getStudentName()+
                "\nStudent Number: "+ getStudentNumber()+
                "\nTest 1: "+getTest1()+
                "\nTest 2: "+ getTest1()+
                "\nAssignment: "+ getAssignment() +
                "\nSemester Mark: "+ calcSemesterMark() ;
    }
}
