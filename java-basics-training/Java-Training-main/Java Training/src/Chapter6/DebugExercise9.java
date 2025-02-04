package Chapter6;  // package added

import java.util.Scanner;       // Scanner import added

public class DebugExercise9{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();

        if (s.length() > 6) {   // fixed s.length() >= 6 to s.length() > 6
            
            char c1 = s.charAt(1); 
            char c2 = s.charAt(4);
            char c3 = s.charAt(6);
            /*
               char c3 = s.charAt(6); Will always fail whenever the length of the s is 6 (Index ) out of bounds for length 6
                The chartAt() methods is zero-based index hence with length 6 it will fail.
                ---> Resolved:
                            by removing '=' on line 12
             */

            System.out.println(c1 + " " + c2+ " " + c3); // from System.out.println("" + c1 + c2+ c3); to + " " , for output readability
        } else {
            
            System.out.println("Invalid indices"); 
        }
    }
}