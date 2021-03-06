package Testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import ObjectRepository.RediffHomePage;
import ObjectRepository.RediffLoginPage;

public class LoginApplication {
	
	//Login page class implemented in normal page object pattern style
	//Home page class implemented in pagePage factory method 
	
	//@Test
	public void Login() throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prabhakaran\\Desktop\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		RediffLoginPage rd = new RediffLoginPage(driver);
		rd.emailid().sendKeys("sarav1006@gmail.com");
		rd.password().sendKeys("9940184153");
		rd.login().click();
		System.out.println(rd.textfile().getText());
		rd.Home().click();

				
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RediffHomePage rh = new RediffHomePage(driver);
		rh.Search().sendKeys("rediff");
		rh.Submit().click();
		
	}
	
	@Test
	public void AlertMethod () throws AWTException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhakaran\\Desktop\\Sarav\\Chrome\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("login1"));
		username.sendKeys(("Sarav"));
		RediffLoginPage page = new RediffLoginPage(driver);
		Robot robot =new Robot();
	
		robot.mouseMove(400, 5);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		
		
	}

}
