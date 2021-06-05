package DataDrivenFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginFunctionalities {
	
	
	String [][] data = {
		{"Admin","admin123"},
		{"Admin1","Admin1"},
		{"Admin1","admin123"},
		{"Admin","admin"}
	};
	
	@DataProvider(name = "logindata")
	public String [][] loginDataProvider() {
		return data;
	}
	
	@Test(dataProvider = "logindata")
	public void loginWithCorrectUsername(String uName, String pWord) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Prabhakaran//Desktop//ChromeJares//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys(uName);
		
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys(pWord);
		
		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		loginButton.click();
		
		driver.quit();
		
	}

}
