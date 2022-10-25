package com.smarttechqa.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.smarttechqa.basepage.BaseClass;

public class ElementPage extends BaseClass {

	//initializing page factory
	//constructor is return type but don't use return keyword //no static no void
	public ElementPage() { //make it public so its accessable from other packages
		PageFactory.initElements(driver, this); //this is elementpage class
	}
	
	//how to store the elements?
	//Encapsulation in our framework 
	//we want to make our elements private
	
	@FindBy(xpath="//a[@href='/login']")
	@CacheLookup  //make element lookup much faster 
	private WebElement loginButton;  //variable
    public WebElement getLoginButton() {
		return loginButton;
	}
	
    
	@FindBy(xpath="//*[@type='email']")
	@CacheLookup
	private WebElement email;
	public WebElement getEmail() {   //done by selecting getters only, source>getters setters, select getters only
		return email;
	}
	
	
	@FindBy(id ="password")
	@CacheLookup
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(name = "q")
	@CacheLookup
	private WebElement search;
	public WebElement getSearch() {
		return search;
	}
	
	@FindBy(xpath = "//button[text()='Search']")
	private WebElement searchButton;
	public WebElement getSearchButton() {
		return searchButton;
	}
	@FindBy(xpath = "//*[text()='Airpods Wireless Bluetooth Headphones']")
	@CacheLookup
	private WebElement airpods;
	public WebElement getAirpods() {
		return airpods;
	}
	
	@FindBy(xpath = "(//*[text()='Airpods Wireless Bluetooth Headphones']) [2]" )
	private WebElement airpodspage;
	public WebElement getAirpodspage() {
		return airpodspage;
	}
}
