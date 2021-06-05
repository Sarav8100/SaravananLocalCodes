package ApachePOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ImportExcel {

	public static void main(String[] args) throws IOException {

		FileInputStream file=new FileInputStream("C:\\Users\\Prabhakaran\\Desktop\\Demodata.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		
		XSSFSheet sheet= workbook.getSheet("Demo"); //Provide sheet name or Sheet index
		
		int rowcount= sheet.getLastRowNum(); // returns the row count
		
		int colcount= sheet.getRow(0).getLastCellNum(); //returns the column/cell counts
		
		for(int i=0; i<rowcount;i++)
		{
			XSSFRow currentrow=sheet.getRow(i); //focus on current row
			
			for(int j=0; j<colcount;j++)
			{
				String value=currentrow.getCell(j).toString(); //read the value from a cell
				System.out.print(" " +value);
			}
			
			System.out.println();
				
		}
		
		
		
		
		
		

	}

}
