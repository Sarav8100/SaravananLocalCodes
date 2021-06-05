package SeleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

	public static void main(String[] args) {
			
		System.setProperty("webdriver.chrome.driver", "C://Users//Prabhakaran//Desktop//ChromeJares//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("http://www.leafground.com/pages/drop.html");
		
		WebElement From = driver.findElement(By.id("draggable"));
		WebElement To = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		
		//action.clickAndHold(From).moveToElement(To).release().build().perform();  //1st step
		//dragAndDrop(From,To ).build().perform();    //2nd step
		action.dragAndDropBy(From, 140, 20).build().perform();  //3rd step
		
		

	}

}
