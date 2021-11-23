package com.webdriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FileUtilsCopyDirectoryToDirectoryTestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Screen_Shorts {

	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\12345\\eclipse-workspace\\Selinium_Testing\\Driver\\chromedriver.exe");
	ChromeOptions ch = new ChromeOptions();
	ch.addArguments("incognito");
	WebDriver driver = new ChromeDriver(ch);
	driver.get("https://www.google.co.in/");
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("12345");
	driver.findElement(By.id("pass")).sendKeys("jhcfdkjf");
	WebElement login = driver.findElement(By.name("login"));
	login.click();
	TakesScreenshot take = (TakesScreenshot) driver;
	File source = take.getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\12345\\eclipse-workspace\\Selinium_Testing\\Screenshorts\\pic1.png");
	FileUtils.copyFile(source, destination);
	

}
}