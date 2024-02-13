package GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelUtility {
	public static String fetchData(String sheet, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(IConstant.excelPath);
		Workbook w = WorkbookFactory.create(fis);
		Sheet s = w.getSheet(sheet);
		Row r = s.getRow(row);
		 return r.getCell(cell).toString();
	}
	
	public static int rowSize(String sheet) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(IConstant.excelPath);
		Workbook w = WorkbookFactory.create(fis);
		Sheet s = w.getSheet(sheet);	
		return s.getPhysicalNumberOfRows();
		
	}
	/**
	 * This method is used to return the column size in excell sheet
	 * @param sheet
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public static int cellSize(String sheet) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(IConstant.excelPath);
		Workbook w = WorkbookFactory.create(fis);
		Sheet s = w.getSheet(sheet);	
		return s.getRow(0).getPhysicalNumberOfCells();
		
	}
	/**
	 * This method is used to fetch all the data in excel sheet
	 * @param sheet
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public static Object[][] fetchAllData(String sheet) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(IConstant.excelPath);
		Workbook w = WorkbookFactory.create(fis);
		Sheet s = w.getSheet(sheet);	
		int rowSize = s.getPhysicalNumberOfRows();
		int cellSize = s.getRow(0).getPhysicalNumberOfCells();
		
		Object[][] d = new Object[rowSize][cellSize];
		for(int i = 0; i<rowSize; i++) {
			for(int j = 0; j<cellSize; j++) {
				d[i][j] = s.getRow(i).getCell(j).toString();			
			}
		}
		return d;
	}
}
