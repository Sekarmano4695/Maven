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
		
		
		driver.findElement(By.id("email")).sendKeys("mk");
		driver.findElement(By.id("pass")).sendKeys("7896521");
		
		WebElement d = driver.findElement(By.xpath("//button[@value=loginbutton"));
		d.click();
		
		
		
	}

}
