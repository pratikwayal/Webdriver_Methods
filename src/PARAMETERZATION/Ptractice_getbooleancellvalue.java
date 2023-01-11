package PARAMETERZATION;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ptractice_getbooleancellvalue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file= new FileInputStream("C:\\Users\\DjS\\Desktop\\parametrization_practice.xlsx");
boolean data = WorkbookFactory.create(file).getSheet("Sheet3").getRow(1).getCell(4).getBooleanCellValue();
	System.out.println(data);
	}
	

}
