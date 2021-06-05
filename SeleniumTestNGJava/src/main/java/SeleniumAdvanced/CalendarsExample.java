package SeleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarsExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//Prabhakaran//Desktop//ChromeJares//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.navigate().to("http://www.leafground.com/pages/Calendar.html");
		
		WebElement calendar = driver.findElement(By.id("datepicker"));
		calendar.click();
//		calendar.sendKeys("01/10/2019" +Keys.ENTER);
		
		WebElement nextButton = driver.findElement(By.xpath("//a[@title='Next']"));
		nextButton.click();
		
		WebElement date = driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		date.click();
		

	}

}
