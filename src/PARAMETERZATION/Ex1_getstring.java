package PARAMETERZATION;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex1_getstring {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		FileInputStream file= new FileInputStream("C:\\Users\\DjS\\Desktop\\Book1.xlsx");
String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(19).getCell(6).getStringCellValue();
System.out.println(data);
//getstringcellvalue
	}

}
