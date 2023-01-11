package PARAMETERZATION;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Practice_1_cell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\DjS\\Desktop\\parametrization_practice.xlsx");
Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
      int rowsize= sh.getLastRowNum();
      
      for(int i=0;i<=rowsize;i++) {
    	 String data = sh.getRow(i).getCell(0).getStringCellValue();
    	 System.out.println(data + " ");
      }
	}

}
