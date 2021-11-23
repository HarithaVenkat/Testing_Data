package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Single {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12345\\eclipse-workspace\\Selinium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		WebElement singleframe = driver.findElement(By.xpath("(//input[@type = 'text'])[1]"));
		
	}
}
