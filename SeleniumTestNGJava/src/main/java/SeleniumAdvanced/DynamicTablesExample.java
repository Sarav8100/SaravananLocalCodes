package SeleniumAdvanced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTablesExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//Prabhakaran//Desktop//ChromeJares//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.navigate().to("http://www.leafground.com/pages/table.html");
		
		List <WebElement> columns = driver.findElements(By.tagName("th"));
		int columnCount = columns.size();
		System.out.println("Number of columns " +columnCount);
		
		List <WebElement> rows = driver.findElements(By.tagName("tr"));
		int rowCount = rows.size();
		System.out.println("Number of rows "+ rowCount);
		
		WebElement getPercent = driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String percent = getPercent.getText();
		
		System.out.println("Percentage is " +percent);
		
		List <Integer> numberList = new ArrayList <Integer>();
		
		List <WebElement> allProgress = driver.findElements(By.xpath("//td[2]"));		
		
		for (WebElement webElement : allProgress) {
			String indiviualValue = webElement.getText().replace("%", "");
			numberList.add(Integer.parseInt(indiviualValue));
		}		
		
		System.out.println("Final List "+ numberList);
		
		int smallValue = Collections.min(numberList);
		System.out.println(smallValue);
		
		String smallValueString = Integer.toString(smallValue)+"%";
		
		String finalXapth = "//td[normalize-space()="+"\"" + smallValueString +"\""+"]"+"//following::td[1]";
		
		
		System.out.println(finalXapth);
		
		//td[normalize-space()='30%']//following::td[1]
		
		WebElement check = driver.findElement(By.xpath("//td[normalize-space()=\"30%\"]//following::td[1]/input"));
		check.click();
		
	}

}
