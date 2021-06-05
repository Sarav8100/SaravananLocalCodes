package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagePF {
	
		WebDriver driver;
	
		public RediffLoginPagePF (WebDriver driver)
		{
			
			this.driver = driver;
			PageFactory.initElements(driver,this);
			
		}
		
		/*By username = By.cssSelector("#login1");
		By password = By.cssSelector("#password");
		By signin = By.name("proceed");
		By text = By.xpath("//*[@id=\'div_login_error\']/b");
		By home = By.linkText("rediff.com");*/
		
		@FindBy (css = "#login1")
		WebElement username ;
		
		@FindBy (css = "#password")
		WebElement password;
		
		@FindBy (name = "proceed")
		WebElement signin;
		
		public WebElement emailid() {
			
			return username;
		}
		
		public WebElement password() {
			return password;
		}
		
		public WebElement login() {
			return signin;
		}
		
//		public WebElement textfile() {
//			return driver.findElement(text);
//		}
//		
//		public WebElement Home() {
//			return driver.findElement(home);
//		}
		
		
		
}
