package PARAMETERZATION;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EX_for_alldatatype {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file= new FileInputStream ("C:\\Users\\DjS\\Desktop\\parametrization_practice.xlsx");
		Sheet SH = WorkbookFactory.create(file).getSheet("Sheet5");
		for (int i=0;i<=2;i++) {
			for (int j=0;j<5;j++) {
				Cell cellinfo = SH.getRow(i).getCell(j);
				CellType CT = cellinfo.getCellType();
				
				if(CT==CT._NONE) {
					CellType a = CT._NONE;
					a.toString();
					System.out.println("**"+a+"**");
				}
				
				if (CT==CellType.STRING) {
					System.out.print(cellinfo.getStringCellValue() + " ");
				}
				else if (CT==CellType.BOOLEAN) {
					System.out.print(cellinfo.getBooleanCellValue() + " ");
					
				}
				else if (CT==CellType.NUMERIC) {
					System.out.print(cellinfo.getNumericCellValue() + " ");
				}
				
			}
			System.out.println();
		}
	}

}
