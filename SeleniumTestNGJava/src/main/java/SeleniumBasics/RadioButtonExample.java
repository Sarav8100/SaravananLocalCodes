package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://Users//Prabhakaran//Desktop//ChromeJares//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("http://www.leafground.com/pages/radio.html");
		
		//1.Checking the default radio button 
		
		WebElement unchecked = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[2]/input"));
		WebElement checked = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/label[3]/input"));
		
		boolean status1 = unchecked.isSelected();
		boolean status2 = checked.isSelected();
		
		System.out.println("What is the status of 1 "+status1+" What is the status of 2 "+status2);
		
		//2.We need to select the particular radio button
		
		WebElement below20 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/input[1]"));
		below20.click();
		
		
		

	}

}
