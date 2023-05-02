package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.support.PageFactory;

public class fetchdata_excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		DataFormatter df=new DataFormatter();
FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\testdata\\excelpracticesheet.xlsx");
Workbook wbook = WorkbookFactory.create(fis);
Sheet sheetname = wbook.getSheet("practice");
Map<String, String> map=new HashedMap();
for(int i=0;i<=sheetname.getLastRowNum();i++)
{
	if(sheetname.equals("practice"))
	{
		for(int j=0;j<sheetname.getLastRowNum();j++)
		{
			 String key = df.formatCellValue(sheetname.getRow(i).getCell(j));
			 String value = df.formatCellValue(sheetname.getRow(i+1).getCell(j));
		map.put(key, value);
		
		}
		break;
	}
}
System.out.println(map);
	}


}
