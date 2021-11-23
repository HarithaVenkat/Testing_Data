package com.revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Rev_Webele1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12345\\eclipse-workspace\\Selinium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email"));
	
		WebElement userid = driver.findElement(By.id("email"));
		
		userid.sendKeys("haritha.korsapati@gmail.com");
		
		boolean displayed = userid.isDisplayed();
		System.out.println("displayed or not :" +displayed);

		boolean enabled = userid.isEnabled();
		System.out.println("enabled or not:" +enabled);
		
		boolean selected = userid.isSelected();
		System.out.println("selected or not:" +selected);
	
			
		driver.findElement(By.id("pass"));
		
		WebElement password = driver.findElement(By.id("pass"));
		
		password.sendKeys("chanakya100");
		
		Thread.sleep(2000);
		
			
		driver.findElement(By.name("login"));
		
		WebElement login = driver.findElement(By.name("login"));
		
		login.click();
		
		driver.close();
		
	}
		
	
}
