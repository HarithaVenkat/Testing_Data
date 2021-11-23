package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dynamic_Path {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\12345\\eclipse-workspace\\Selinium_Testing\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in//");
	driver.manage().window().maximize();
	WebElement footware = driver.findElement(By.xpath("//h2[contains(text(),'Automotive')]//following::span[contains(text(),'Footwear+Handbags')]"));
	Actions a = new Actions(driver);
	a.moveToElement(footware).build().perform();
	a.click(footware).build().perform();
		
	}
}