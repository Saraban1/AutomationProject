package com.smarttechqa.basepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BaseClass {
   
	
	public static void setUP() {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //create a chromedriver object 
		driver.manage().window().maximize();  //maximize your window
		driver.get("https://www.smarttechqa.com/login");
		
		//driver.findElement(By.id("email")).sendKeys("testuser1@gmail.com");  //same as below line 
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("testuser1@gmail.com");
		
		
		driver.findElement(By.id("password")).sendKeys("Abc123");  //use pass that you created, bottom line is same as this
		//driver.findElement(By.cssSelector("#password")).sendKeys("Abc123");  //doing by css #  //we don't use CssSelector
		
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	  
		//driver.findElement(By.name("")).click();
		System.out.println( "The title of the website of the application is :" +driver.getTitle());  //get title on console  //to verify if you are logged in
	  // driver.quit(); //will quit browser and server
		//driver.close(); //will close the window only (1 current tab) used on internet explorer
	
	   
	
	
	}
	
	
	
	
	public static void main(String[] args) {
		BaseClass.setUP();
	}
}
