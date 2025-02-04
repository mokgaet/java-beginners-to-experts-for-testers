package Chapter10;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromExcelFile {

    public static void readDataFromExcel() throws IOException {
        String filePath = "C:\\Users\\Mokgaetsi Mmakola\\Desktop\\InPerson Training\\Advanced Java\\Course Content\\java-advanced-course\\Advanced Java\\src\\Chapter10\\resources\\WriteToExcel.xlsx" ;


        try {
            FileInputStream fis = new FileInputStream(new File(filePath));

            //create a workbook instance for .xlsx file
            XSSFWorkbook wb = new XSSFWorkbook(fis);

            //create a sheet object
            XSSFSheet sheet = wb.getSheetAt(0);

            //create a nested loop to loop through the cells
            for (Row myRow: sheet){
                for (Cell myCell: myRow){

                    //use a switch statement to check different data types
                    switch(myCell.getCellTypeEnum()){
                        case STRING : //value of a cell as a string
                            System.out.print(myCell.getStringCellValue() +"\t\t");
                            break;
                        case NUMERIC : //value of a cell as a number
                            System.out.print(myCell.getNumericCellValue() + "\t\t");
                            break;
                        default :
                            throw new IllegalStateException("Unexpected value: " + myCell.getCellTypeEnum());
                    }
                }
                System.out.println();
            }
            fis.close();
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        } catch (EncryptedDocumentException e) {
            System.out.println("Encrypt Error: " + e.getMessage());
        }

    }

    public static void main(String[] args) throws IOException{
        readDataFromExcel();
    }
}
