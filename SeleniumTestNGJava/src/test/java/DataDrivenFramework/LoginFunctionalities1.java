package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.lang.WordUtils;
import org.junit.experimental.theories.PotentialAssignment.CouldNotGenerateValueException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class LoginFunctionalities1 {
	
	
	String [][] data = null;
	
	@DataProvider(name = "logindata")
	public String [][] loginDataProvider() throws BiffException, IOException {
		
		data = getExcelData();
		
		return data;
	}
	
	public String[][] getExcelData() throws BiffException, IOException {
		
		FileInputStream excel = new FileInputStream("C:\\Users\\Prabhakaran\\Desktop\\Test data\\Test.xls");
		
		Workbook workbook = Workbook.getWorkbook(excel);
		
		Sheet sheet = workbook.getSheet(0);
		
		int rowCount= sheet.getRows();
		int columnCount = sheet.getColumns();
		
		String testData[][] = new String [rowCount-1][columnCount];
		
		for(int i=1;i<rowCount;i++) {
			for(int j=0;j<columnCount;j++) {
				testData [i-1][j] = sheet.getCell(j,i).getContents();
				
			}
		}
		
		return testData;
		
		
	}
	
	@Test(dataProvider = "logindata") 
	public void loginWithCorrectUsername(String uName, String pWord) {
		System.setProperty("webdriver.chrome.driver", "C://Users//Prabhakaran//Desktop//ChromeJares//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys(uName);
		
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys(pWord);
		
		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		loginButton.click();
		
		driver.quit();
		
	}

}
