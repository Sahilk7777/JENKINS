import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import commanUtils.ExcelUtils;
public class Test1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		ExcelUtils excel=new ExcelUtils();
		excel.getDataFromExcel("Sheet1", 0, 0);
	}
}
