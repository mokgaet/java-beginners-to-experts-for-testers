package Chapter6; // added a package

public class DebugExercise2 {

    public static void main(String[] args) {         
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {  // removed = that cause out of bound exception
            System.out.println(numbers[i]);
     }     
   } 
}