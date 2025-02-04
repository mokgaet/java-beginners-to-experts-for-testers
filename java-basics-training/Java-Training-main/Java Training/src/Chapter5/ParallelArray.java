package Chapter5;

import java.util.Scanner;

public class ParallelArray {


    // --> Parallel Arrays : are arrays of the same length but can be different data types
    // ---> Logically related and working together
    public static void main(String[] args) {
        final int SIZE = 3;

        int[] arTestMarks = new int[SIZE];
        String[] arNames = new String[SIZE];

        Scanner sc = new Scanner(System.in);
        String name;
        int mark;

        for (int i = 0; i < SIZE; i++) {
            System.out.print("Enter Student Name " + (i+1) +": ");
            name = sc.next();
            arNames[i] = name;


            System.out.print("Enter Test Marks for student "+(i+1) +": " );
            mark = sc.nextInt();
            arTestMarks [i] = mark;
        }


        System.out.println("********************** Student Details ***************");

        for (int i = 0; i < SIZE; i++) {
            System.out.println(arNames[i] +"\t" + arTestMarks[i]);
        }

    }
}
