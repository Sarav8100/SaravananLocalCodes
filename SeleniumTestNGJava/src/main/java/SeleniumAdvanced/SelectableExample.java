package SeleniumAdvanced;

import java.util.List;

import javax.swing.Action;
import javax.swing.plaf.basic.BasicSliderUI.ActionScroller;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Prabhakaran//Desktop//ChromeJares//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		//1.Select first 3 methods out of 7 methods
		List<WebElement>selectable = driver.findElements(By.xpath("//*[@id='selectable']/li"));
		
		int listSize = selectable.size();
		System.out.println(listSize);
		
		/*Actions actions = new Actions(driver);
		
		 * actions.keyDown(Keys.CONTROL).click(selectable.get(0))
		 * .click(selectable.get(1)) .click(selectable.get(2)).build().perform();
		 */
		
		Actions actions = new Actions(driver);
		actions.clickAndHold(selectable.get(0));
		actions.clickAndHold(selectable.get(1));
		actions.clickAndHold(selectable.get(2));
		actions.build().perform();
		
		
	}

}
