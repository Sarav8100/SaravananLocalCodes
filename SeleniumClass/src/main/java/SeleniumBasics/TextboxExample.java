package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextboxExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://Users//Prabhakaran//Desktop//ChromeJares//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		driver.manage().window().maximize();
		
		WebElement emailBox = driver.findElement(By.id("email"));
		emailBox.sendKeys("sarav1006@gmail.com");
		
		WebElement appendBox = driver.findElement(By.xpath("//input[@value='Append']"));
		appendBox.sendKeys("Text");
		
		WebElement getTextBox = driver.findElement(By.xpath("//input[@value='TestLeaf']"));
		String value = getTextBox.getAttribute("value");
		
		System.out.println(value);
		
		WebElement clear = driver.findElement(By.xpath("//input[@value='Clear me!!']"));
		clear.clear();
		
		WebElement disabledBox = driver.findElement(By.xpath("//input[@disabled='true']"));
		boolean enabled = disabledBox.isEnabled();
		
		System.out.println(enabled);
		
		
		
	}

}
