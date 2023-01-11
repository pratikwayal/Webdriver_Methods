package PARAMETERZATION;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EX_ALLDATATYPE {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\DjS\\Desktop\\parametrization_practice.xlsx");
	 Cell CELLINFO = WorkbookFactory.create(file).getSheet("Sheet5").getRow(0).getCell(0);
	CellType CT = CELLINFO.getCellType();
	if (CT==CellType.STRING) {
		System.out.println(CELLINFO.getStringCellValue());
	}
	else if (CT==CellType.BOOLEAN) {
		System.out.println(CELLINFO.getBooleanCellValue());
	}
	else if (CT==CellType.NUMERIC) {
		System.out.println(CELLINFO.getNumericCellValue());
	}

	}

}
