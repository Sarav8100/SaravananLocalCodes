package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TagsExample {
		
		WebDriver driver;
		
	@Given("^user login page$")
	public void user_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C://Users//Prabhakaran//Desktop//ChromeJares//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^the user enters valid username and password$")
	public void the_user_enters_valid_username_and_password() throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

	@When("^clicks login function button$")
	public void clicks_login_function_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^user should navigated to home page$")
	public void user_should_navigated_to_home_page() throws Throwable {
		boolean status = driver.findElement(By.linkText("Welcome Linda")).isDisplayed();
		Assert.assertTrue(status);
	}


	
		

}
