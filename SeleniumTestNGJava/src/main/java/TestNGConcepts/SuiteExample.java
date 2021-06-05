package TestNGConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
		WebDriver driver;
		long startTime;
		long endTime;
		//Aim: open chrome and go to
		//1. google.co.in 2.bing.com and 3.yahoo.com and then close the browser
		
		@BeforeSuite
		public void launchBrowser() {
			System.setProperty("webdriver.chrome.driver", "C://Users//Prabhakaran//Desktop//ChromeJares//chromedriver.exe");
			driver = new ChromeDriver ();
			startTime = System.currentTimeMillis();
			
		}
	
	
		@Test	
		public void openGoogle() {
			driver.get("https://www.google.co.in");
			
		}
		@Test
		public void openBing() {
			driver.get("https://www.bing.co.in");
		}
		@Test
		public void openYahoo() {
			driver.get("https://www.yahoo.co.in");
		}
		
		@AfterSuite
		public void closeBrowser() {
			driver.quit();
			endTime = System.currentTimeMillis();
			
			long totalTime = endTime-startTime;
			System.out.println("Total time taken " +totalTime);
		}

}
