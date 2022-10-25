package com.smarttechqa.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGPractice {

	//you won't need main method if you do the following
	//@test will do unit testing
//	@Test  
//	public void login() {
//		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe"); //tell location
//		WebDriverManager.chromedriver().setup(); //same as above, automatically uodates versions
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.id("email")).sendKeys("example@gmail.com");
//	}
	
	WebDriver driver;
	
	
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup(); //same as above, automatically updates versions
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	
	
	
	@Test
	public void googleSearch() {
		
		driver.findElement(By.name("q")).sendKeys("hello world");
	}
	
	
	//@Test (enabled =false)  //will get ignored 
	
	@Test(dependsOnMethods = {"googleSearch"} )
	public void clickImageButton() {
		driver.findElement(By.linkText("Images")).click();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
//	public static void main(String[] args) {
//		TestNGPractice obj = new TestNGPractice();
//		obj.login();
//	}
}
