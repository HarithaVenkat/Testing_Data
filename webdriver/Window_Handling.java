package com.webdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handling {
	
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12345\\eclipse-workspace\\Selinium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement mobile = driver.findElement(By.xpath("(//a[@tabindex='0'][5])"));
		Actions ac = new Actions(driver);
		ac.moveToElement(mobile).build().perform();
		ac.contextClick().build().perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement bestsellers = driver.findElement(By.xpath("(//a[@tabindex='0'][6])"));
		ac.moveToElement(bestsellers).build().perform();
		ac.contextClick().build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement electronics = driver.findElement(By.xpath("(//a[@tabindex='0'][7])"));
		ac.moveToElement(electronics).build().perform();
		ac.contextClick().build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement fashion = driver.findElement(By.xpath("(//a[@tabindex='0'][8])"));
		ac.moveToElement(fashion).build().perform();
		ac.contextClick().build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> whs= driver.getWindowHandles();
		for (String string : whs) {
		String title = driver.switchTo().window(string).getTitle();
		System.out.println(title);		
		}




		
		
		
		
	}

}
