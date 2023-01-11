package PARAMETERZATION;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GETBOOLEANCELLVALUE {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\DjS\\Desktop\\Book1.xlsx");
           boolean data = WorkbookFactory.create(file).getSheet("Sheet4").getRow(1).getCell(1).getBooleanCellValue();
	System.out.println(data);
	}
	

}
