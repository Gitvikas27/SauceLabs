package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ReadXLData {

	@DataProvider(name = "multiplelogin")
	public String[][] getMultipleLogin(Method m) throws EncryptedDocumentException, IOException {
		String excelSheetName = "loginTest";
		return getData(excelSheetName);
	}

	@DataProvider(name = "validcredential")
	public String[][] getValudUser(Method m) throws EncryptedDocumentException, IOException {
		String excelSheetName = "validuser";
		return getData(excelSheetName);
	}

	private String[][] getData(String excelSheetName) throws EncryptedDocumentException, IOException {

		File f = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\testdata.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(excelSheetName);
		int totalRows = sheet.getLastRowNum();
		Row rowCells = sheet.getRow(0);
		int totalCols = rowCells.getLastCellNum();

		DataFormatter format = new DataFormatter();
		String testData[][] = new String[totalRows][totalCols];

		for (int i = 1; i <= totalRows; i++) {
			Row row = sheet.getRow(i);
			if (row != null)
				for (int j = 0; j < totalCols; j++) {
					testData[i - 1][j] = format.formatCellValue(row.getCell(j));

				}
		}

		return testData;
	}

}
