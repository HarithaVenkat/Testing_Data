





package com.revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rev_Weddriver {

	
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\12345\\eclipse-workspace\\Selinium_Testing\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.co.in/");
	
	driver.manage().window().maximize();
	
	
	Thread.sleep(2000);
	
	driver.navigate().to("https://web.whatsapp.com/");
	
	driver.navigate().forward();
	
	Thread.sleep(5000);
	
	driver.navigate().back();
	
	driver.navigate().refresh();
	
	Thread.sleep(2000);
	
	driver.close();
	
}
}
