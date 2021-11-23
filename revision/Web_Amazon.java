package com.revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Amazon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12345\\eclipse-workspace\\Selinium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email"));
		WebElement userid = driver.findElement(By.id("email"));
		userid.sendKeys("634536547346");
		
		driver.findElement(By.id("pass"));
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("fbhkjnj");
		
		String att = userid.getAttribute("value");
		System.out.println(att);
		
		driver.findElement(By.name("login"));
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		
		
		
		
		
	}

}
