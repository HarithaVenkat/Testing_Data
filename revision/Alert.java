package com.revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\12345\\eclipse-workspace\\Selinium_Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		
		WebElement simpleAlert = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		simpleAlert.click();
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		WebElement confirmAlert = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
		confirmAlert.click();
		
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		WebElement promptalert = driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
		promptalert.click();
		
         org.openqa.selenium.Alert alert = driver.switchTo().alert();		
		String text = alert.getText();
	               System.out.println(text);
		
		driver.switchTo().alert().sendKeys("selenium");
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
	
	
	}

}
