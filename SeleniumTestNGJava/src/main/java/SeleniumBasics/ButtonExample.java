package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://Users//Prabhakaran//Desktop//ChromeJares//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("http://www.leafground.com/pages/Button.html");
		
		//1.Get the XY position
		WebElement getPositionButton = driver.findElement(By.id("position"));
		
		Point point = getPositionButton.getLocation();
		
		int XValue = point.getX();
		int YValue = point.getY();
		
		System.out.println("X Value is: " +XValue + "Y Value is: " +YValue);
		
		//2.Find the Color
		WebElement colorButton = driver.findElement(By.id("color"));
		String color = colorButton.getCssValue("background-color");
		System.out.println("Button color is "+color);
		
		//3.Find the size
		WebElement sizeButton = driver.findElement(By.id("size"));
		int height = sizeButton.getSize().getHeight();
		int width = sizeButton.getSize().getWidth();
		
		System.out.println("Height is: "+height+"Width is "+width);
		
		//4.Go to home page
		WebElement homeButton = driver.findElement(By.id("home"));
		homeButton.click();
		
	}

}
