package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hai Guys\\eclipse-workspace\\Maven\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		
	WebElement d = driver.findElement(By.id("email"));
	d.sendKeys("jhhh");
	WebElement dd = driver.findElement(By.id("pass"));
	dd.sendKeys("78954");
	
	driver.findElement(By.id("loginbutton")).click();
		
		
	}

}
