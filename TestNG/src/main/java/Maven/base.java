package Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	
	static WebDriver driver;
	
	public void StartBrowser (String BrowserName) {
		
		try {
			switch (BrowserName)
			{
			case "Chrome":
				String path = System.getProperty("user.dir")+"/TestNG/src/main/java/Resources/chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", path.replace("\\","/"));
				ChromeOptions chromeoptions = new ChromeOptions ();
				chromeoptions.addArguments("start-maximized");
				chromeoptions.addArguments("--dom-automation");
				chromeoptions.addArguments("--safebrowsing -disable-download-protection");
				driver = new ChromeDriver(chromeoptions);
				break;
					
			case "IE":
				path = System.getProperty("user.dir")+"/TestNG/src/main/java/Resources/IEDriverServer.exe";
				System.setProperty("webdriver.ie.driver", path.replace("\\", "/"));
				driver = new InternetExplorerDriver ();
				driver.manage().window().maximize();
				break;
				
			case "Firefox":
				path = System.getProperty("user.drir")+"/TestNG/src/main/java/Resources/geckodriver.exe";
				System.setProperty("webdriver.gecko.driver", path.replace("\\", "/"));
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				break;
				
				default: path= System.getProperty("user.dir")+"/TestNG/src/main/java/Resources/chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", path.replace("\\","/"));		
				driver = new ChromeDriver();
								
			}
			
			
			
		} catch (Exception e) {
			
		}
		
	}

}
