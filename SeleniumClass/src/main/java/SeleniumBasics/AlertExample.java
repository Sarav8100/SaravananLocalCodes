package SeleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://Users//Prabhakaran//Desktop//ChromeJares//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		//1.Alert example
		WebElement alertBox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/button"));
		alertBox.click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		
		//2.Accept or Dismiss Alert
		WebElement confirmbutton = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));
		confirmbutton.click();
		
		Alert confirmAlert = driver.switchTo().alert();
		Thread.sleep(2000);
		confirmAlert.dismiss();
		
		//3.PromptBox alert
		WebElement promptBox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/button"));
		promptBox.click();
		
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Duckling");
		Thread.sleep(2000);
		promptAlert.accept();
				
		

	}

}
