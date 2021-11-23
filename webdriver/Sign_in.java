
package com.webdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Sign_in {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\12345\\eclipse-workspace\\Selinium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.id("email")).sendKeys("haritha.korsapati@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("chanakya123");
		driver.findElement(By.id("SubmitLogin")).click();
		
		 WebElement women = driver.findElement(By.xpath("//a[text()= 'Women']"));
		 Actions ac = new Actions(driver);
		 ac.moveToElement(women).build().perform();
			
	   	WebElement tshirt = driver.findElement(By.xpath("(//a[text()='T-shirts'])[1]"));
			ac.moveToElement(tshirt).build().perform();
			ac.click(tshirt).build().perform();
			WebElement outview = driver.findElement(By.xpath("//div[@class='product-image-container']"));
			ac.moveToElement(outview).build().perform();
			ac.click(outview).build().perform();
		
		WebElement Quickview = driver.findElement(By.xpath("//a[@class='quick-view']"));
		ac.click(Quickview).build().perform();
		driver.switchTo().frame(0);
		WebElement add = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
		ac.click(add).build().perform();
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		WebElement checkout = driver.findElement(By.xpath("//span[contains(text(),'Proceed')]"));
		checkout.click();
		WebElement checkout1= driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')][2]"));
		checkout1.click();
		WebElement checkout2 = driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')][2]"));
		checkout2.click();
	    driver.findElement(By.id(("cgv"))).click();;
	}
	
	}

