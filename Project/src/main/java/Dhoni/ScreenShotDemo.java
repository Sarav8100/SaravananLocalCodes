package Dhoni;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotDemo {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {

		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		WebElement ele = driver.findElement(By.id("hplogo"));

		File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		BufferedImage fullimg = ImageIO.read(screenShot);

		Point point = ele.getLocation();

		int elewidth = ele.getSize().getWidth();
		int eleheight = ele.getSize().getHeight();		

		BufferedImage eleScreenShot = fullimg.getSubimage(point.getX(), point.getY(), elewidth,eleheight);

		ImageIO.write(eleScreenShot, "jpg", screenShot);

	}

}
