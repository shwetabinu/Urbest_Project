package adactin.urbest.util;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import adactin.urbest.base.BaseClass;


/**
 * Class to read the Test Data from an Excel sheet
 * @author aswinvijayan
 *
 */
public class TestDataReader {
	
	
/**
 * Method to Read data from an excel sheet
 * @param Sheetname The name of the sheet from where data has to be retrieved
 * @param rno The row number where the data is present
 * @param celno The column no: where the data is present
 * @return
 * @throws IOException
 */
	public String readdata(String Sheetname,int rno,int celno) throws IOException
	{
		FileInputStream fis=new FileInputStream("Testdata/TestDataUrbest.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		Sheet s=wb.getSheet("Common_Test_Data");
		String value=s.getRow(rno).getCell(celno).getStringCellValue();
		return value;
		
	}

}
