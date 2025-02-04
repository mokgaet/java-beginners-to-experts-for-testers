package Chapter10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromTextFile2 {

    public static void main(String[] args) {
        String filePath = "src/Chapter10/resources/read_favouritePlayer.txt";
        Scanner scanner = null;
        File myFile = null;

        try {
            myFile = new File(filePath);
            scanner = new Scanner(myFile);
            System.out.println("Names of my fav players: ");

            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println("\t* " + data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Exception : "+ e.getMessage());

        }
    }


}
