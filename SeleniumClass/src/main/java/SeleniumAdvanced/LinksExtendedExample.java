package SeleniumAdvanced;


import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksExtendedExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://Users//Prabhakaran//Desktop//ChromeJares//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		
		WebElement homePageLink = driver.findElement(By.linkText("Go to Home Page"));
		homePageLink.click();
		
		driver.navigate().back();
		
		WebElement whereToGo = driver.findElement(By.partialLinkText("Find where"));
		String where = whereToGo.getAttribute("href");
		System.out.println("This link is going to "+ where);
		
		WebElement brokenLink = driver.findElement(By.linkText("Verify am I broken?"));
		brokenLink.click();
		
		String title = driver.getTitle();
		
		if(title.contains("404")) {
			System.out.println("Link is broken");
		}
		driver.navigate().back();
		
		//StaleElementReferenceException
		WebElement homePageLink1 = driver.findElement(By.linkText("Go to Home Page"));
		homePageLink1.click();
		
		driver.navigate().back();
		
		List <WebElement> totalLinks = driver.findElements(By.tagName("a"));
		
		int totalLink = totalLinks.size();
		
		System.out.println("Total Links is " + totalLink);
		
		
		
	}

}
