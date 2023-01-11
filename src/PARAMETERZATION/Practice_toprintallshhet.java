package PARAMETERZATION;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Practice_toprintallshhet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\DjS\\Desktop\\parametrization_practice.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
		for (int i=0;i<=sh.getLastRowNum();i++) {
			for(int j=0;j<=sh.getRow(i).getLastCellNum()-1;j++) {
				String data = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(data + " ");
	}
System.out.println();
}}}
