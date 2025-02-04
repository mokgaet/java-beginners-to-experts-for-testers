package Chapter6;  // package added

public class DebugExercise7 {
   public static void main(String[] args) {         
     printMessage("Hello, World!");     
 }   
   
private static void printMessage(String message) {         
    System.out.println("Message: " + message);         
    //return message;  -- removed , the method is void so it does not have a return type
  }  
}