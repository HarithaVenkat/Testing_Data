package com.revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Path {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12345\\eclipse-workspace\\Selinium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
		WebElement id = driver.findElement(By.xpath("//input[@data-testid='royal_email']]"));
		id.sendKeys("8576587968");		
	
		driver.findElement(By.xpath("//input[@name='pass']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		password.sendKeys("hgdhegjkjfh");
		
	
	}

}
