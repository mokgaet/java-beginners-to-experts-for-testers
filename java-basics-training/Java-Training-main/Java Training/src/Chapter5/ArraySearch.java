package Chapter5;

public class ArraySearch {

    public static void main(String[] args) {
        int[] arrNumbers = {19,7,120,12,6,-30,23,61,9};
        String[] arrNames = {"Leo","HushPuppy" , "Kate" , "Joy" , "Remember", "Snowpie"};
        // Method Calls
      //  SearchNumber(arrNumbers,12);
       // System.out.println(arrNames[0].length() +" "+arrNames[4].length());
       // System.out.println("Maximum value is: " + getHighest(arrNumbers));
//        System.out.println("Min value is:" + getLowest(arrNumbers));
        System.out.println(getNameWithMostCharacters(arrNames));


    }

    static void SearchNumber(int[] array, int num){
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]){
                System.out.println("Number: "+num +" found at position " + i);
                break;
            }

        }
    }


    static int getHighest(int[] arr){

        int max = Integer.MIN_VALUE; // int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    static int getLowest(int[] arr){

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    // return the name with most characters

    static String getNameWithMostCharacters(String[] names){

        int no_char = names[0].length() ; //Integer.MIN_VALUE;
        String name;
        name= names[0];

        for (int i = 1; i < names.length; i++) {
            if (no_char <= names[i].length() ) {
                name = names[i];
                no_char = names[i].length();
            }
        }
        return name;
    }



}
