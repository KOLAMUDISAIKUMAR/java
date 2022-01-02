package com.framework.app.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	public Homepage(WebDriver driver) {
		//  constructor 
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(name="q")
    WebElement textboxsearch;
	@FindBy(xpath="//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")
	WebElement buttonsearch;
	public void googlesearch(String keyword) {
		textboxsearch.sendKeys(keyword);
		buttonsearch.click();	
	}
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement username;
	@FindBy(xpath = "//input[@id='pass']")
	WebElement password;
	@FindBy(xpath = "//button[contains(@name,'login')]")
	WebElement button;
	public void facebook(String keyword) {
		username.sendKeys(keyword);
		password.sendKeys(keyword);
		button.click();
	}
	
	
	
	
	
	
}
	
	
	

