package SeleniumAdvanced;

import java.awt.List;
import java.util.Collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFramesExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//Prabhakaran//Desktop//ChromeJares//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("http://www.leafground.com/pages/frame.html");
		
		//1.Inside the frame
		
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		WebElement button1 = driver.findElement(By.id("Click"));
		button1.click();
		
		String text = driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		
		//2.Nested frame
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click1")).click();
		
		//3.Find the total number of frames
		
		driver.switchTo().defaultContent();
		
		Collection<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));
		
		int size = totalFrames.size();
		System.out.println(size);
		
	}

}
