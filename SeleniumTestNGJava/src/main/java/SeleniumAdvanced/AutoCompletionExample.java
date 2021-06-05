package SeleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompletionExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://Users//Prabhakaran//Desktop//ChromeJares//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		
		WebElement input = driver.findElement(By.id("tags"));
		input.sendKeys("s");
		
		Thread.sleep(3000);
		List<WebElement> optionsList = driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
		
		System.out.println(optionsList.size());
		
		
		for (WebElement sara : optionsList) {
			if(sara.getText().equals("Rest API")) {
				sara.click();
				System.out.println("Select Rest API");
			} else {
				System.out.println("Not Select Rest API");
			}
		}
		
		for (WebElement webElement : optionsList) {
			
			if(webElement.getText().equals("Web Services")) {
				webElement.click();
				System.out.println("Selecting " +webElement.getText());
			}else {System.out.println("Not Selecting");}
			
			System.out.println("----------------------------------");
			
			if(webElement.getText().equals("Selenium")) {
				webElement.click();
				System.out.println("If part");
			
			}else {
				System.out.println("Else part");
			}
		}
		

	}

}
