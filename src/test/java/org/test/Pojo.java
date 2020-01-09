package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindAll;

public class Pojo {
	
	WebDriver driver;
	
	public Pojo() {
		PageFactory.initElements(driver, this);
		}
	
	
	
	
	@FindBys({
			
		@FindBy(id="email")	,
		@FindBy(xpath="//input[@type='email']")	
			
	})
	private WebElement txtEmail;
	
	
	@FindAll({
		
		@FindBy(id="pass")	,
		@FindBy(xpath="//input[@type='pass']")	
			
	})
	private WebElement txtPass;
	
	
	
	
	

}
