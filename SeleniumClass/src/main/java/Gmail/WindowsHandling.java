package Gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prabhakaran\\Desktop\\ChromeJares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();

		driver.get("https://hdfcbank.com");
		
		
	}

}
