package Chapter10;

import java.io.*;
import java.util.ArrayList;

public class ReadFromTextFile {

    public static void readNumbers(){
        String filePath = "src/Chapter10/resources/Numbers.txt";
        String Number_line;
        File myFile = null;

        try {
            myFile = new File(filePath);
            FileReader reader = new FileReader(myFile);
            BufferedReader read = new BufferedReader(reader);

            System.out.println(STR."Even Numbers from the \{myFile.getName()} file.");

            while ((Number_line = read.readLine()) != null){
               String[] numbers = Number_line.split(",");

                for (int num = 0; num < numbers.length; num++) {
                    if ( ((Integer.parseInt(numbers[num])) % 2 )== 0) {
                        System.out.println(" * " + numbers[num]);
                    }
                }
            }
            read.close();
        } catch (FileNotFoundException e) {
            System.out.println(STR."File not found! '\{myFile.getName()}'");
        }catch (IOException e) {
            System.out.println(STR."Oops! Could not read file '\{myFile.getName()}'");
        }
    }

    public static void readPlayers(){
        String filePath = "src/Chapter10/resources/read_favouritePlayers.txt";
        String line ;
        File myFile = null;

        try {
            myFile = new File(filePath);
            FileReader reader = new FileReader(myFile);
            BufferedReader read = new BufferedReader(reader);

            System.out.println("Data from the "+myFile.getName()+" file.");

            while ((line = read.readLine()) != null){
                System.out.println("\t*"+line);
            }
            read.close();
        } catch (FileNotFoundException e) {
            System.out.println(STR."File not found! '\{myFile.getName()}'");
        }catch (IOException e) {
            System.out.println(STR."Oops! Could not read file '\{myFile.getName()}'");
        }
    }

    public static void main(String[] args) {

    readNumbers();


    }

}
