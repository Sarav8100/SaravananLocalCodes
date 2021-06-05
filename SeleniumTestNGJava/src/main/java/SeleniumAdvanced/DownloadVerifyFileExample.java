package SeleniumAdvanced;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadVerifyFileExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://Users//Prabhakaran//Desktop//ChromeJares//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("http://www.leafground.com/pages/download.html");
		
		WebElement downloadLink = driver.findElement(By.linkText("Download Excel"));
		downloadLink.click();
		
		Thread.sleep(3000);
		
		//"C:\Users\Prabhakaran\Downloads\testleaf.xlsx"
		
		File fileLocation = new File("C:\\Users\\Prabhakaran\\Downloads");
		
		File[] totalFiles = fileLocation.listFiles();
		
		for (File file : totalFiles) {
			
			file.getName().equals("testleaf.xlsx"); {
				System.out.println("File is downloaded");
				break;
			}
		}
		
		
	}

}
