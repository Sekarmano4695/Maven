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
		
		
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("greens");
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("java");
		WebElement btn = driver.findElement(By.xpath("//input[@value='Log In']"));
		btn.click();
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("greens");
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("java");
		WebElement btn = driver.findElement(By.xpath("//input[@value='Log In']"));
		btn.click();
		
	}

}
