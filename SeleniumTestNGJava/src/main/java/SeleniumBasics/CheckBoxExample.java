package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//Prabhakaran//Desktop//ChromeJares//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		//1.Check the first check box in Multiple
		
		WebElement java = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div[1]/input"));
		java.click();
		
		//2.Check box is selected or not
		
		WebElement selenium = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div[1]/input"));
		boolean seleniumSelected = selenium.isSelected();
		System.out.println(seleniumSelected);
		
		//3.We will identiy the selected check box and try to DeSelect
		
		WebElement firstElement = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div[1]/input"));
		
		if(firstElement.isSelected()) {
			firstElement.click();
		}
		
		WebElement secondElement = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div[2]/input"));
		
		if(secondElement.isSelected()) {
			secondElement.click();
		}
		
		
		
	}

}
