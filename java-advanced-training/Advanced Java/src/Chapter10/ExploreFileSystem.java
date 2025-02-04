package Chapter10;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
    * This file is intended to explore the File System and File Systems
 */
public class ExploreFileSystem {

    public static void main(String[] args) {

        /*
            * FileSystem is an abstract class and Path is an interface , so we do not create an object of those classes.
            * Hence, the following :
         */
        FileSystem fileSystem = FileSystems.getDefault();

        Path path = fileSystem.getPath("C:\\Users\\Mokgaetsi Mmakola\\Desktop\\InPerson Training\\Advanced Java\\Course Content\\java-advanced-course\\Advanced Java\\src\\Chapter10\\Java_Advanced_Chapters.txt");
        File file = new File(String.valueOf(path));
        if (file.exists()){

        //** Returns the file or directory denoted by this Path; this is the last item in the sequence of name elements
        System.out.println("Filename: "+ path.getFileName());

        //** Returns the name in the position of the Path specified by the integer parameter
        System.out.println("Path Name: " + path.getName(0));

        //** Returns the number of name elements in the Path
        System.out.println("Name Count : "+ path.getNameCount());


        // *** Absolute path – full and complete path, it does not need any other information to locate the file on the system.
        System.out.println("Is the path provided an Absolute path ? "+ path.isAbsolute() );
    }
    }

}
