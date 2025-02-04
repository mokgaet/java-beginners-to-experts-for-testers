package Chapter5;

import java.util.Scanner;

public class MultiDimensionalArrays {

    public static void main(String[] args) {

        //--> array made up of rows and columns
        //--> Syntax : dataType [][] variable = new datatype [rowSIZE][columnSIZE]
        final int ROW = 2;
        final int COL = 3;

        int[][] arTestMarks = new int[ROW][COL];

        String [] arrNames = new String[ROW];
        double[] arrMean = new double[ROW];

        double mean = 0;
        int sum = 0;
        String remark;

        // length : return the number of rows

     /*col  0   1  2  row
            78 58 96   0
            45 56 63   1

         */
        Scanner sc = new Scanner(System.in);
        String name;
        int test;

        for (int i = 0; i < ROW; i++) {
            System.out.print("Enter Student Name " + (i + 1) + ": ");
            name = sc.next();
            arrNames[i] = name;

            // get 3 test marks
            for (int j = 0; j < COL; j++) {
                System.out.print("Enter Test " + (j+1) + " marks for "+name + " :  ");
                test = sc.nextInt();

                arTestMarks[i][j] = test;

                // Sum the test
                sum+=test;
            }

            // Calculate Average for the TESTS
            mean = (double) sum / COL;
            arrMean[i] = mean;
            sum = 0; // initialise sum to zero for the next test mark summation

            System.out.println();

        }



        //System.out.println("Name\tTest 1\tTest2\tTest3");
        System.out.println("\n---------------||  Results ||----------------------");
        System.out.println("\nNames\tTest 1\tTest 2\tTest 3\tAverage\tRemarks");
        System.out.println("-----------------------------------------------------");
        for (int row = 0; row < ROW; row++) {

            // add the name
            System.out.print(row+1 +"- "+ arrNames[row] + "\t" );

            for (int col = 0; col < COL; col++) {
                System.out.print(arTestMarks[row][col] + "\t\t");
            }

            // Double format to two decimal place:
           // System.out.printf("%.2f",arrMean[row]); // -- > the rounded values are for output not in the array

            arrMean[row] = Math.round(arrMean[row] * 100)/100;
            remark = (arrMean[row] >= 60)? "PASS":"FAIL";

            System.out.println(arrMean[row]+"\t"+remark);
            System.out.println();

        }





    }
}
