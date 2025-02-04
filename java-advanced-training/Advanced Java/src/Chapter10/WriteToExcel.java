package Chapter10;import org.apache.poi.xssf.usermodel.XSSFRow;import org.apache.poi.xssf.usermodel.XSSFSheet;import org.apache.poi.xssf.usermodel.XSSFWorkbook;import java.awt.*;import java.io.*;public class WriteToExcel {    /**     * write ExcelData is a void method that     */    public static void writeExcelData(){        String filePath = "C:\\Users\\Mokgaetsi Mmakola\\Desktop\\InPerson Training\\Advanced Java\\Course Content\\java-advanced-course\\Advanced Java\\src\\Chapter10\\resources\\WriteToExcel.xlsx" ;        try{            FileOutputStream fileOutput = new FileOutputStream(filePath);            //create a workbook instance for .xlsx file            XSSFWorkbook workbook = new XSSFWorkbook();            //create a spreadsheet            XSSFSheet spreadsheet = workbook.createSheet("Football Team Names");            //create a row header on the first row            XSSFRow row_head = spreadsheet.createRow(0);            spreadsheet.setDefaultColumnWidth(15000);            row_head.createCell(0).setCellValue("Club Name");            row_head.createCell(1).setCellValue("Number of Players");            //create second row            XSSFRow row1 = spreadsheet.createRow(1);            row1.createCell(0).setCellValue("Mamelodi Sundowns FC");            row1.createCell(1).setCellValue(50);            //create third row            XSSFRow row2 = spreadsheet.createRow(2);            row2.createCell(0).setCellValue("Liverpool FC");            row2.createCell(1).setCellValue(65);            //create fourth row            XSSFRow row3 = spreadsheet.createRow(3);            row3.createCell(0).setCellValue("Barcelona FC");            row3.createCell(1).setCellValue(45);            //write to Excel spreadsheet            workbook.write(fileOutput);  // ** With the help of outputStream write what is our workbook into the excel file            fileOutput.close(); //** close the output stream            workbook.close(); //** close the workbook            System.out.println("Writing to an Excel file completed! ");            Desktop.getDesktop().open(new File(filePath));        } catch (IOException e) {            System.out.println("Exception: "+ e.getMessage());        }    }    public static void main(String[] args) {        writeExcelData();    }}