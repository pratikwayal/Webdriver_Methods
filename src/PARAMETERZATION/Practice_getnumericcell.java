package PARAMETERZATION;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Practice_getnumericcell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\DjS\\Desktop\\parametrization_practice.xlsx");
		 double data = WorkbookFactory.create(file).getSheet("Sheet2").getRow(12).getCell(2).getNumericCellValue();
System.out.println(data);
	}

}
