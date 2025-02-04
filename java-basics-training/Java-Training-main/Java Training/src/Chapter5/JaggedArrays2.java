package Chapter5;

import java.util.Scanner;

public class JaggedArrays2 {

    public static void main(String[] args) {

        final int SIZE = 3;
        String[] arNames = new String[SIZE];
        String[][] arrPerson = new String[3][];     //----> {  {} , {} ,{}  }
        String[] arrHobbies;
        int noHobbies;
        String stName,stHobby;
        Scanner sc = new Scanner(System.in);

        // Get User Input
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Enter name for person "+(i+1) +" : ");
            stName = sc.next();
            arNames[i] = stName;

            System.out.print("How many hobbies does "+stName+" have? ");
            noHobbies = sc.nextInt();

            // initiate the array size
            arrHobbies = new String[noHobbies];

            for (int j = 0; j < noHobbies; j++) {
                System.out.print("Enter hobby "+(j+1) +" for " + stName+ ":");
                stHobby = sc.next();
                arrHobbies[j] = stHobby;
            }
            System.out.println();
            arrPerson[i] = arrHobbies;

        }

        System.out.println("<----------------------- | Results | ---------------------->");
        for (int i = 0; i < SIZE; i++) {
            System.out.println("------------> "+arNames[i] +"<--------------" );

            for (int j = 0; j < arrPerson[i].length; j++) {
                System.out.println((j+1)+"- " + arrPerson[i][j]);
            }
        }

    } //end MAIN

} //end CLASS
