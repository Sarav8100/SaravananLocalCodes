package SeleniumBasics;

import java.awt.List;
import java.util.Collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://Users//Prabhakaran//Desktop//ChromeJares//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");	
		
		//1.Select by dropdown in three methods
		
		WebElement dropDown1 = driver.findElement(By.id("dropdown1"));
		
		Select select = new Select(dropDown1);
		
		select.selectByIndex(3);
		
		
		select.selectByValue("2");
		
		select.selectByVisibleText("Selenium");
		
		//2.Get the number of options in drop down list
		
		Collection<WebElement> listOfOptions = select.getOptions();
		int size = listOfOptions.size();
		System.out.println("Number of elements " +size);
		
		//3.Use of sendkeys and get the particular value
		
		dropDown1.sendKeys("LoadRunner");
		
		//4. Multiple drop down list need to select
		
		WebElement multiSelect = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		
		Select multiSelectbox = new Select(multiSelect);
		
		multiSelectbox.selectByIndex(1);
		multiSelectbox.selectByIndex(2);
		multiSelectbox.selectByIndex(3);
		
		
	}

}
