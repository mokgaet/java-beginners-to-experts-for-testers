package Chapter6;  // package added

public class DebugExercise8 {
  public static void main(String[] args) {         
   for (int i = 0; i < 5; i++) {    // changed i-- to i++ , to solve the infinite execution of the for loop
     System.out.println("Index: " + i);         
   }     
  } 
}