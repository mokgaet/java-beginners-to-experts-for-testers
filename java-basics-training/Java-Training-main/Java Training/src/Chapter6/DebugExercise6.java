package Chapter6;  // package added

import java.util.Arrays;  // import added

public class DebugExercise6 {

public static void main(String[] args) {         
   int[] numbers = new int[5];         
   for (int i = 0; i < numbers.length; i++)  // removed = , to solve the out of bound exception
   {             
      numbers[i] = i * 2;        
   }         
    System.out.println(Arrays.toString(numbers));
 } 
}