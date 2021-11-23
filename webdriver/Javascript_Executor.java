package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Executor {

private static final JavascriptExecutor JavascriptExecutor = null;

public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\12345\\eclipse-workspace\\Selinium_Testing\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.co.in/");
	
	driver.get("https://www.amazon.in/");
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	
WebElement Logo = driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[3]/span[1]/div/a/div"));

JavascriptExecutor js =  (JavascriptExecutor) driver;

js.executeScript("arguments[0].scrollIntoView", Logo);

Thread.sleep(3000);
js.executeScript("window.scrollBy(0, -3000);");

Thread.sleep(2000);
js.executeScript("window.scrollBy(0, 2000);");
		
}	
}
