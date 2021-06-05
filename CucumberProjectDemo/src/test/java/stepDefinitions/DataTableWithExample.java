package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DataTableWithExample {
		
		WebDriver driver;
		
	@Given("^Proceed to login page$")
	public void proceed_to_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C://Users//Prabhakaran//Desktop//ChromeJares//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^users enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void users_enters_and(String username, String password) throws Throwable {
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);

	}

	@When("^clicked button$")
	public void clicked_button() throws Throwable {
		
		driver.findElement(By.id("btnLogin")).click();

	}



}
