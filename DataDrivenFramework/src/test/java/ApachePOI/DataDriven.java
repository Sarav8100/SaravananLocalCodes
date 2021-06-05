package ApachePOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws IOException {
		
		//fileInputStream argument
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Prabhakaran\\Desktop\\Demodata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		int sheets = workbook.getNumberOfSheets();
		for (int i=0;i<sheets;i++)
		{
			if (workbook.getSheetName(i).equalsIgnoreCase("Testdata"))
			{
				
			XSSFSheet sheet = workbook.getSheetAt(i);
			
			Iterator<Row> rows = sheet.iterator(); //sheet is collection of rows
			Row Firstrow = rows.next();
			Iterator<Cell> cell = Firstrow.cellIterator();//row is collection of cells
			
			int k=0;
			int column = 0;
			while (cell.hasNext())
			{
				Cell value = cell.next();
				if(value.getStringCellValue().equalsIgnoreCase("Data4"))
				{
					column =k;
				}
					k++;
					}
			
			System.out.println(column);
			while (rows.hasNext())
			{
				Row r=rows.next();
				if(r.getCell(column).getStringCellValue().equalsIgnoreCase("Purchase"));
				{
					Iterator<Cell> cv = r.cellIterator();
					while(cv.hasNext())	
					{
				System.out.println(cv.next().getStringCellValue());
					}
					}
			
		}
		
	}

}
	
	}
}

