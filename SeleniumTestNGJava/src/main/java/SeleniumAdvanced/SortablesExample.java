package SeleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class SortablesExample {

	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//Prabhakaran//Desktop//ChromeJares//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.navigate().to("http://www.leafground.com/pages/sortable.html");
		
		List <WebElement> elements = driver.findElements(By.xpath("//*[@id='sortable']/li"));
		
		WebElement fromELement = elements.get(6);
		WebElement toElemenet = elements.get(0);
		Thread.sleep(2000);
		Actions actions = new Actions (driver);
//		actions.clickAndHold(fromELement).moveToElement(toElemenet).release().build().perform();
		
		actions.dragAndDrop(fromELement, toElemenet).build().perform();
		
		
		
		
	}

}
