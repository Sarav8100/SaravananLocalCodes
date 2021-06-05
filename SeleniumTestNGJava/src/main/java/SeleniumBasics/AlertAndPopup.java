package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertAndPopup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prabhakaran\\Desktop\\ChromeJares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		String text = alert.getText();
		
		if(text.equals("Please enter a valid user name")) {
			System.out.println("Correct alert message");
		} else {
			System.out.println("Incorrect alert message");
		}
		
		alert.accept(); //Click on OK button
		
		//alert.dismiss(); //Click on dismiss button
		
		/*
		 * driver.navigate().to("https://html.com/input-type-file/");
		 * 
		 * driver.manage().window().maximize();
		 * 
		 * driver.findElement(By.id("fileupload")).
		 * sendKeys("C:\\Users\\Prabhakaran\\Desktop\\Saravanan Resume");
		 */
		
		
		
		
		
		
	}

}
