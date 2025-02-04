package Chapter5;

import java.util.Arrays;
import java.util.Random;

public class ArrayManipulation {

    /*
     --> Populate an array with 20 random numbers between 10 and 75.

     From the 20 random numbers , populate the even numbers and odd numbers array respectively

     */
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(10,75); //gives a random value between lowest bound of integer and highest bound of integers

        int even = 0 , odd = 0;


        int[] arrRandomNumbers = new int[20];
        int[] arrEven, arrOdd;;


        // Get 20 random numbers into an array
        for (int i = 0; i < 20; i++) {
            arrRandomNumbers[i] = x;
            x = random.nextInt(10,75);

            // check even and odd
            if (arrRandomNumbers[i] % 2 == 0) {
                even++;
            } else{ odd++;}


        }
        System.out.println("------------------------|  Array Manipulation Exercise  |---------------------------------");

        System.out.println(Arrays.toString(arrRandomNumbers));

        System.out.println("------------------------------------------------------------------------------------------");
         System.out.println("Even Numbers are : " + even + "\tOdd numbers are : "+odd);
        System.out.println("------------------------------------------------------------------------------------------");

        // Create those arrays
        arrEven = new int[even];
        arrOdd = new int[odd];

        int count_even = 0 , count_odd = 0; // keep track of the size of the loops

        for (int i = 0; i < arrRandomNumbers.length; i++) {
            if (arrRandomNumbers[i] % 2 == 0) {
                arrEven[count_even] = arrRandomNumbers[i];
                count_even++;
            }
            else {
                arrOdd[count_odd] = arrRandomNumbers[i];
                count_odd++;
            }
        }

        System.out.println("Even Numbers: " + Arrays.toString(arrEven));
        System.out.println("Odd Numbers: " + Arrays.toString(arrOdd));


    }
}
