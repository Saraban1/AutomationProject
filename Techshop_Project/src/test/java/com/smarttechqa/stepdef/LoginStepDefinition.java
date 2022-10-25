package com.smarttechqa.stepdef;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.smarttechqa.basepage.BaseClass;
import com.smarttechqa.elements.ElementPage;
import com.smarttechqa.utils.Utilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition extends BaseClass{

	
	ElementPage pf = PageFactory.initElements(driver, ElementPage.class);
	
	
	@Given("User opens the browser")
	public void user_opens_the_browser() throws InterruptedException, IOException {
	   // BaseClass.setUp();
	    
	}

	@Given("User navigates to {string}")
	public void user_navigates_to(String string) {
	    
	    
	}

	@When("User clicks on the Sign In button")
	public void user_clicks_on_the_sign_in_button() {
		pf.getLoginButton().click();  //this equals buttom line
		//driver.findElement(By.xpath("//a[@href='/login']")).click(); //This is going to the login page
		//driver.findElement(By.xpath("(//a[@class='nav-link'])[3]")).click();
	}

	@When("User Enters the email")
	public void user_enters_the_email() throws IOException {
		pf.getEmail().sendKeys("testuser1@gmail.com");  //same as bottom line
		//driver.findElement(By.xpath("//*[@type='email']")).sendKeys("testuser1@gmail.com"); //Sending the email address
		//driver.findElement(By.id("email")).sendKeys("testuser1@email.com");
		Utilities.getHighLighter(driver.findElement(By.xpath("//*[@type='email']")));
		Utilities.takeScreenShot();
	} 

	@When("User Enters the password")
	public void user_enters_the_password() {
		pf.getPassword().sendKeys("Abc123");
		//driver.findElement(By.id("password")).sendKeys("Abc123");
		//driver.findElement(By.cssSelector("#password")).sendKeys("Abc123");
	}

	@When("User clicks on the login button")
	public void user_clicks_on_the_login_button() {
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	    
	}

	@Then("The user is successfully logged in and username is displayed")
	public void the_user_is_successfully_logged_in_and_username_is_displayed() {
	    //This step is used for verification
		//we have to match expected with the actual
	    //For expected  we already know the username, so we can store it in a string
		
		String expected = "TESTUSER1";
		String actual= driver.findElement(By.id("username")).getText();
	
		//use the assertions class from TestNG.
		//THERE ARE STATIC methods in the Assert Class
		//One of the static method is assertEquals
		
		Assert.assertEquals(actual,expected);
		
	
	}
	@Then("User  is navigated to home page")
	public void user_is_navigated_to_home_page() {
	    
	    
	}
	
	@When("User clicks on the Search Box and Searches for {string}")
	public void user_clicks_on_the_search_box_and_searches_for(String string) {
		Utilities.getExplicitWait(driver.findElement(By.name("q")), 10);
		driver.findElement(By.name("q")).sendKeys(string); //Sends keys to the searchbox iphone from login.feature
	    
	}

	@When("User clicks on the Search Button")
	public void user_clicks_on_the_search_button() {
		driver.findElement(By.name("q")).submit();
		//driver.findElement(By.cssSelector(".p-2 btn btn-outline-success")).click();
		//driver.findElement(By.xpath("//*[text()='Search']")).click();
	    
	}

	@Then("User can search for the {string} item")
	public void user_can_search_for_the_item(String string) {
	   String expected = "iPhone 11 Pro 256GB Memory";
	   String actual= driver.findElement(By.xpath("//div[@class='card-title']")).getText();
	     Assert.assertEquals(actual,expected);
	    
	}

	@When("User clicks on the latest product from the homepage")
	public void user_clicks_on_the_latest_product_from_the_homepage() {
	    
	    
	}

	@Then("User is able to view the item")
	public void user_is_able_to_view_the_item() {
	    
	    
	}
	
	@When("User clicks on the cart button")
	public void user_clicks_on_the_cart_button() {
		Utilities.getExplicitWait(driver.findElement(By.xpath("//a[@href='/cart']")),5);
		driver.findElement(By.xpath("//a[@href='/cart']")).click();
	    
	}

	@Then("User is nagivgated to the Cart page")
	public void user_is_nagivgated_to_the_cart_page() {
	   
	    
	}
	
	@Then("I can validate user payment")
	public void i_can_validate_user_payment() {
	    
	}

	@Then("I want to check user is able to pay for the item")
	public void i_want_to_check_user_is_able_to_pay_for_the_item() {
	    
	    
	}


}
