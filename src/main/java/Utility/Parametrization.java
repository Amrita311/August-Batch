package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization 
{
	public static String getExcelData(String sheetNme,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\\\Users\\\\amrit\\\\OneDrive\\\\Desktop\\\\Parameterization.xlsx");
		String value=WorkbookFactory.create(file).getSheet("sheetName").getRow(row).getCell(cell).getStringCellValue();
		return value;
	}

}
