package basic;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class Test5
{
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream File=new FileInputStream("");
		 Workbook wb = WorkbookFactory.create(File));
		 Sheet sh = wb.getSheet("Sheet1");
		 Row rw=sh.createRow(3);
		 Cell cl=rw.createCell(0);
		 cl.setCellValue("pune");
		 FileOutputStream fos=new FileOutputStream("C:\Users\sahil\OneDrive\Desktop\.sk1.properties.xlsx");
	}
}
