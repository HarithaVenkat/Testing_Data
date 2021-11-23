package com.revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rev_Webele {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\12345\\eclipse-workspace\\Selinium_Testing\\Driver\\chromedriver.exe");
	
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.co.in/");
	
	driver.manage().window().maximize();
	
	String title = driver.getTitle();
	
	System.out.println(title);
	
	String cu = driver.getCurrentUrl();
	
	System.out.println(cu);
	
	driver.close();
	}

}
