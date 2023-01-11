package PARAMETERZATION;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EX_GETNUMERICONLY {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		FileInputStream file = new FileInputStream("C:\\Users\\DjS\\Desktop\\Book1.xlsx");
		double data = WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getCell(6).getNumericCellValue();
System.out.println(data);
	}

}
