package com.revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop_Sin {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\12345\\eclipse-workspace\\Selinium_Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.get("http://www.leafground.com/pages/drop.html");
		driver.manage().window().maximize();
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));
		
		Actions a = new Actions(driver);
		a.dragAndDrop(from, to).build().perform();
		
	}

}
