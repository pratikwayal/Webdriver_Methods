package PARAMETERZATION;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Practice_to_print_1_row {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\DjS\\Desktop\\parametrization_practice.xlsx");
		Sheet SH = WorkbookFactory.create(file).getSheet("Sheet4");
		short cellsize = SH.getRow(0).getLastCellNum();
		for(int i=0;i<cellsize;i++) {
			String data = SH.getRow(4).getCell(i).getStringCellValue();
			System.out.print(data + " ");
		}
	}

}
