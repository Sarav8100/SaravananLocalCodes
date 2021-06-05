package Dhoni;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.CaptureScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class MainProject {
		
		ExtentReports extent;
		
		WebDriver driver;
		
		@BeforeTest
		
		public void ExtentReportsDemo()
		{
		//ExtentReports, ExtentSparkReporter
			
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Saravanan");	
		
		
		}
		
		@BeforeMethod
		
		public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C://Users//Prabhakaran//Desktop//Chrome//chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
				
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		}
		
		public static void captureScreenshot() throws IOException {
			
			Date d = new Date ();
			String fileName = d.toString().replace(":", "_").replace(" ", "_")+".jpg";
			
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot, new File(".//screenshot//" + fileName ));
			
		}
		
		@Test(priority = 1, groups = "Sarav")
		public void rediff() throws IOException {
		driver.get("https://www.rediff.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@title='Lightning fast free email']")).click();
		
		WebElement username= driver.findElement(By.id("login1"));
		username.sendKeys("sarav1006@gmail.com");
	
		
		WebElement signin = driver.findElement(By.name("proceed"));
		signin.click();
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.alertIsPresent());
		
		
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		
		alt.accept();
		
		
		
		driver.findElement(By.id("password")).sendKeys("12345");
		
		captureScreenshot();
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		
		
//		@Test(priority = 2, groups = "Sarav")
		public void mouseHover() {
			
			driver.get("https://www.americangolf.eu/");
			driver.manage().window().maximize();
			WebElement clothlink = driver.findElement(By.xpath("//*[@id='header-navigation']/div[1]/ul/li[3]/a"));
			
			Actions action = new Actions(driver);
			action.moveToElement(clothlink).build().perform();
			
			WebDriverWait wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='CLOTHFOOTW_1']/ul/li[3]/ul/li[1]/a/span"))));
			
			driver.findElement(By.xpath("//*[@id='CLOTHFOOTW_1']/ul/li[3]/ul/li[1]/a/span")).click();;
			
			Assert.assertEquals("Golf Trousers · American Golf", driver.getTitle());
			
			
		}
		
//		@Test(priority = 3, groups = "Sarav")
		public void performDrag() {
			driver.get("https://jqueryui.com/");
			driver.findElement(By.linkText("Draggable")).click();
			
			driver.switchTo().frame(0);
			
			WebElement draggable = driver.findElement(By.id("draggable"));
			
			Actions action = new Actions(driver);
			action.dragAndDropBy(draggable, 110,120).build().perform();
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		
//		@Test
		public void testJavaScriptExecutor() {
			
			extent.createTest("testJavaScriptExecutor");
			JavascriptExecutor js =  (JavascriptExecutor) driver;
			js.executeScript("window.location='https://www.rediff.com/'");
			
			WebElement signin = driver.findElement(By.xpath("//a[@class='signin']"));
			js.executeScript("arguments[0].click()", signin);
			
			WebElement username = driver.findElement(By.id("login1"));
			js.executeScript("arguments[0].value='sarav1006@gmail.com'", username);
			
			WebElement submit = driver.findElement(By.xpath("//*[@type='submit' and @value='Sign in']"));
			js.executeScript("arguments[0].click()", submit);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			extent.flush();
		}
		
		
		@AfterMethod
		public void closeBrowser() {
			driver.quit();
		}
		
		
		
		
		
//		ChromeOptions options = new ChromeOptions();
//		
//		options.addArguments("--disable-infobars");
//		
//		driver.get("https://accounts.google.com");
//		
//		driver.manage().window().maximize();
//		
//		System.out.println(driver.getTitle());
//		
//		driver.findElement(By.id("identifierId")).sendKeys("sarav1006");
//		
//		driver.findElement(By.xpath("//*[@id=\'identifierNext\']/div/button/div[2]")).click();		
		
		
				
		
	

}
