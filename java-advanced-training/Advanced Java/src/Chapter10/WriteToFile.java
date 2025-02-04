package Chapter10;

import java.io.File;
import java.io.PrintStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class WriteToFile {
    public static void main(String[] args) {
        FileSystem fs = FileSystems.getDefault();
        Path path = fs.getPath("C:\\Users\\Mokgaetsi Mmakola\\Desktop\\InPerson Training\\Advanced Java\\Course Content\\java-advanced-course\\Advanced Java\\src\\Chapter10\\resources\\WriteToFile.txt");

        File myFile = null;
        PrintStream pen = null;
        try {
            // Create file object
            myFile = new File(String.valueOf((path)));

            if (myFile.createNewFile()){

                System.out.println("File created: " + myFile.getName());
                pen = new PrintStream(myFile);

                pen.println("iLAB Advanced Java Training");
                pen.println("-----------| 30-01-2025 |-------------");
                pen.println("Java Advanced Fundamentals");
                pen.println("      /\\_/\\  \n" +
                        "     ( o.o )  \n" +
                        "      > ^ <\n" +
                        "  ** THE LION KING **\n");
            }else {
                System.out.println("File already exists.");
                // Create a new file and open it
               pen = new PrintStream(myFile); //open the stream
                fileFile(pen);
            }

            System.out.println("File Filled with text !");

            pen.close(); //close the stream - very important to free memory

        } catch (Exception exp) {
            System.err.println(STR."Ooops! Couldn't write to file: \{myFile.getName()}\{exp.getMessage()}");
        }
    }

    public static void fileFile(PrintStream pen){
        pen.append("*********Used append for this text***********");
        pen.println("iLAB Advanced Java Training");
        pen.println("-----------| 30-01-2025 |-------------");
        pen.println("Java Advanced Fundamentals");
        pen.println("      /\\_/\\  \n" +
                "     ( o.o )  \n" +
                "      > ^ <\n" +
                "  ** LION **\n");
    }
}
