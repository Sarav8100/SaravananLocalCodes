package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {

	@BeforeSuite
	public void setup() {
		System.out.println("Setup System Property for Chrome");
	}
	
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("launch chrome Browser");
	}
	
	@BeforeClass
	public void enterURL() {
		System.out.println("Login to app");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("Enter URL");
	}
	
	@Test
	public void googleTitleTest() {
		System.out.println("Google Title Test");
				
		
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Logout from app");
	}
	
	@AfterTest
	public void deleteallcookies() {
		System.out.println("Delete All cookies");
	}
	
	@AfterClass
	public void closeBrowser() {
		
		System.out.println("Close Browser");
	}
	
	@AfterSuite
	public void generateTestReport() {
		System.out.println("Generate Test Report");
	}
	
}
