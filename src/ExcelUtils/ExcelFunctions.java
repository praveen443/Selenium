package ExcelUtils;

import java.io.FileOutputStream;
import java.io.IOException;

import jxl.Cell;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFunctions {

	private static HSSFWorkbook hssfWorkBook;
	private static XSSFWorkbook xssfWorkBook;
	private static HSSFSheet hssfSheet;
	private static XSSFSheet xssfSheet;
	
	public static void createNewWorkBook(String workbookFormat) throws IOException{
		if(workbookFormat.equalsIgnoreCase(".xls")){
			hssfWorkBook = new HSSFWorkbook();
			hssfSheet = hssfWorkBook.createSheet("Sheet1");
			FileOutputStream fileOut = new FileOutputStream(System.getProperty("user.dir")+"\\"+"SampleExcel.xls");
			hssfWorkBook.write(fileOut);
			hssfWorkBook.close();
		
		}else if(workbookFormat.equalsIgnoreCase(".xlsx")){
			xssfWorkBook = new XSSFWorkbook();
			xssfSheet = xssfWorkBook.createSheet("Sheet1");
			FileOutputStream fileOut = new FileOutputStream(System.getProperty("user.dir")+"\\"+"SampleExcel.xls");
			xssfWorkBook.write(fileOut);
		    fileOut.close();
		}
	}
	
	public static void createRowData(){
			// Create a row and put some cells in it. Rows are 0 based.
		    Row row = xssfSheet.createRow((short)0);
		    // Create a cell and put a value in it.
		    /*Cell cell = row.createCell(0);
		    cell.setCellValue(1);

		    // Or do it on one line.
		    row.createCell(1).setCellValue(1.2);
		    row.createCell(2).setCellValue(
		         createHelper.createRichTextString("This is a string"));
		    row.createCell(3).setCellValue(true);

		    // Write the output to a file
		    FileOutputStream fileOut = new FileOutputStream("workbook.xls");
		    hssfWorkBook.write(fileOut);
		    fileOut.close();*/
		}
	}
