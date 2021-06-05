package Gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class EbayLogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prabhakaran\\Desktop\\Sarav\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();

		driver.get("https://in.ebay.com/");
		
		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("Electric Guitar");
		
		driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[1]/div/div[2]/a/h3")).click();
		
		driver.findElement(By.xpath("//*[@id=\"binBtn_btn\"]")).click();
		
			
	}

}
