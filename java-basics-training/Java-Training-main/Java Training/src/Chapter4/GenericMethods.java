package Chapter4;

public class GenericMethods {


    //---> <T> : represent type (can be type parameter or return type
    //  we use generic for type safe/safety
    // Specify the data type when being used
    static <T> void displayNumbers(T x, T y){
        System.out.println("X= "+x +" , Y = "+y);
    }

    public static void main(String[] args) {

        displayNumbers(25.5,26);
        GenericMethods.<Integer>displayNumbers(4,6);
        GenericMethods.<Float>displayNumbers(25.5F,13.5F);
        GenericMethods.<Double>displayNumbers(25.58,183.5);
        GenericMethods.<String>displayNumbers("One","Twelve");
        GenericMethods.<Character>displayNumbers('B','R');
        GenericMethods.<Long>displayNumbers(12545L,25852L);


        // Limitations: Can not use built-in methods without specifying the
    }



}
