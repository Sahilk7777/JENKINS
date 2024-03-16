package basic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import commonutils_2.Excelutils;

public class Toreaddatafromexecelsheet {
	public static void main(String[]args) throws EncryptedDocumentException, IOException
	{
		/*//to read data from ecxel
		
		
		// step1 create object of file input stream class
		
		FileInputStream fis=new FileInputStream("src\\test\\resources\\PSA.xlsx");
		
		// Step2 = call create(fileinputsream
		Workbook WBF = WorkbookFactory.create(fis);
		
		// Step 3=call get sheet method
		
		Sheet Sheetname = WBF.getSheet("Organizations");
		
		//step 4 call a method called get row numbe(int rownum)r
		
		Row rw = Sheetname.getRow(0);
		
		//step 5= call get cell(int cellnum)
		Cell cl = rw.getCell(1);
		
		//Step 6 call a method called getstringcellvalue()
		String data = cl.getStringCellValue();
		System.out.println(data);
		*/
		Excelutils eutil=new Excelutils();
		String a = eutil.getDataFromExcelFile("Organizations", 1, 1);
		System.out.println(a);
		
		
			
	}
}
