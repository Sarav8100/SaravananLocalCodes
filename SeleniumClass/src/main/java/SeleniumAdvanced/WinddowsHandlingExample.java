package SeleniumAdvanced;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinddowsHandlingExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://Users//Prabhakaran//Desktop//ChromeJares//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("http://www.leafground.com/pages/Window.html");
		
		//1.Handle child window and operates then get back to parent window again
		
		String parentWindow = driver.getWindowHandle();
		
		WebElement firstButton = driver.findElement(By.id("home"));
		firstButton.click();
		
		Set<String> handles = driver.getWindowHandles();
		
		for (String newWindows : handles) {
			
			driver.switchTo().window(newWindows);
		}
		
		driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img")).click();
		
		Thread.sleep(2000);
		
		driver.close();
		
		driver.switchTo().window(parentWindow);
		
		//2.Opened Multiple window and will check how many windows are opened
		
		WebElement openMultiple = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));
		openMultiple.click();
		
		int numberOfWindows = driver.getWindowHandles().size();
		System.out.println("No of Windows opened " +numberOfWindows);
		
		driver.switchTo().window(parentWindow);
		
		//3.Close every multiple windows opened already except this parent window
		
		WebElement dontCloseMe = driver.findElement(By.id("color"));
		dontCloseMe.click();
		
		Set<String> newWindowHandles=driver.getWindowHandles();
		
		for (String allWindows : newWindowHandles) {
			
			if(!allWindows.equals(parentWindow)) {
				driver.switchTo().window(allWindows);
				driver.close();
			}
		}
	}

}
