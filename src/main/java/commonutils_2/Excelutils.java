package commonutils_2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelutils {

	public String getDataFromExcelFile(String Sheetname, int Rownum,int cellnum) throws EncryptedDocumentException, IOException
	{
// step1 create object of file input stream class
		
		FileInputStream fis=new FileInputStream("src\\test\\resources\\PSA.xlsx");
		Workbook WBF = WorkbookFactory.create(fis);
		Sheet Sheetnames = WBF.getSheet(Sheetname);
		Row rw = Sheetnames.getRow(Rownum);
		Cell cl = rw.getCell(cellnum);
		String value = cl.getStringCellValue();
		return value;
		
	}
}
