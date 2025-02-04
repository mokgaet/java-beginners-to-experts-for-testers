package Chapter4;

public class ReturnTypeMethods {
    /*
            --> Return type methods focus is what you want to return back to the caller
            --> Specify a return type
     */

    static String getMessage(){

        return "\nChapter 4:Methods\t Learning Objective 1: Return Type Method Construction and Method Call";
    }

    static boolean isEven(){
        int num1 = 222;
        return (num1 % 2 ==0); //(num1 % 2 ==0)? true : false;
        //--> an expression always gives us true or false, hence the expression is returned
    }


    public static void main(String[] args) {
        // Method Call

        String message = getMessage();
        System.out.println(message);

        // isEven method calling
        boolean is_even = isEven();

        System.out.println("Is the number even? (T/F) ? " + is_even);
   }


}
