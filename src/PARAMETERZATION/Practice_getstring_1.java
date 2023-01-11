package PARAMETERZATION;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Practice_getstring_1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file = new FileInputStream("C:\\Users\\DjS\\Desktop\\parametrization_practice.xlsx");
	String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(8).getStringCellValue();
System.out.println(data);
	}

}
