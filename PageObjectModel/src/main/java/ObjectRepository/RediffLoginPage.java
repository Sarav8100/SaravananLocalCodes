package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPage {
	
		WebDriver driver;
	
		public RediffLoginPage (WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver,this);
			
		}
		
		
		By username = By.cssSelector("#login1");
		By password = By.cssSelector("#password");
		By singin = By.name("proceed");
		By text = By.xpath("//*[@id=\'div_login_error\']/b");
		By home = By.linkText("rediff.com");
		
		public WebElement emailid() {
			
			return driver.findElement(username);
		}
		
		public WebElement password() {
			return driver.findElement(password);
		}
		
		public WebElement login() {
			return driver.findElement(singin);
		}
		
		public WebElement textfile() {
			return driver.findElement(text);
		}
		
		public WebElement Home() {
			return driver.findElement(home);
		}
		
		
		
}
