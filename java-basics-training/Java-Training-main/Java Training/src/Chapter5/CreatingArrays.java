package Chapter5;

public class CreatingArrays {

    /*
        - Array : a collection of values of the same data type
        Syntax : dataType [] varibleName = new dataType[No of items you want to store inside the array]

     */
    public static void main(String[] args) {

        // Array to store 5 elements
        int[] arrTestMarks = new int[5];

        // Array with initialized values
        String[] arrNames = new String[]{"Rethabile","Happiness","Seke","Lethabo"};

        char[] arrGrades = {'A','B','C','D','F'};

        // No intial values, not size defined due to being logic dependent

        int[] arrNumbers;   //--> Empty array.

        // Assignment
        arrTestMarks[0] = 90;
        arrTestMarks[1] = 85;
        arrTestMarks[2] = 29;
        arrTestMarks[3] = 77;
        arrTestMarks[4] = 65;

        // Use : Array Access using Enhanced For Loop
        System.out.println("**********| Test Marks |************");

        for(int mark: arrTestMarks){
            System.out.print(mark + " ");
        }

        // initialization
        arrNumbers = new int[2];
        int temo=0;
        for (int i = 0; i < arrNumbers.length ; i++) {
            arrNumbers[i] = temo*2+ 23 + 15 - 7;
            temo = arrNumbers[i] ;
        }
        System.out.println("\n**********| Numbers |************");
        for (int num : arrNumbers){
            System.out.print(num + " ");
        }
        System.out.println("\n*******************************");

       displayValues("Joy", 2023);
       displayValues(2025, "Happy New Year");
       displayValues("Keys", 20.58F);




    } // end MAIN
    static <T> void displayValues(T x, T y){
        System.out.println("X= "+x +" , Y = "+y);
    }

}
