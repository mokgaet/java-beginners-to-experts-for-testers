package Chapter5;

public class JaggedArrays {

    /*      Jagged Arrays : is an array of other arrays

               --->  An array of references to other arrays. <---

               Memory Allocation : Variable memory per row

     */
    public static void main(String[] args) {

        // Create a jagged array
        // Each row can have a different number of elements.

        String[][] arHobbies = new String[3][];     //----> {  {} , {} ,{}  }

        String[] arSports = {"Football" , "eSport", "Tennis"};


        // initialisation of the jagged array
        arHobbies[0] = arSports;
        arHobbies[1] = new String[] {"Netball","Hiking"};
        arHobbies[2] = new String[4];

        // initialise array at index 2 that sorts 4 elements : Golf, Chess , Jogging, Watching Anime

        arHobbies[2][0] = "Chess";
        arHobbies[2][1] = "Jogging";
        arHobbies[2][2] = "Golf";
        arHobbies[2][3] = "Watching Anime";


        // Print the array

        for (int i = 0; i < arHobbies.length; i++) {

            for (int j = 0; j < arHobbies[i].length; j++) {
                System.out.print(arHobbies[i][j] +" | ");
            }
            System.out.println();
        }







    }


}
