package Chapter3;

import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {
        // * Used: When the task must be completed at least once.
        // ---> essentially it execute the statement before checking the condition of the while
        Scanner sc = new Scanner(System.in);

        String fruit, output;
        boolean valid = false;
        do{
            System.out.println("Select a fruit :\nA - Apple\nB - Banana\nM - Mango\nO - Orange ");
            fruit = sc.nextLine();
            switch (fruit){
                case "A","B","M","O":
                    valid = true;
                    break;
            }

        } while(!valid);

        switch (fruit) {
            case "A":
                output = "Apple";
            case "B":
                output = "Banana";
                break;
            case "M":
                output = "Mango";
                break;
            case "O":
                output = "Orange";
                break;
        }

            System.out.println("Fruit Chosen : " +fruit);

    }

}
