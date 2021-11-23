package com.webdriver;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mini_New {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\12345\\eclipse-workspace\\Selinium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.id("email")).sendKeys("haritha.korsapati@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("chanakya123");
		driver.findElement(By.id("SubmitLogin")).click();
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions a = new Actions(driver);
		a.moveToElement(women).build().perform();
		WebElement tshirt = driver.findElement(By.xpath("(//a[text()='T-shirts'])[1]"));
		a.moveToElement(tshirt).build().perform();
		a.click(tshirt).build().perform();
		WebElement frame = driver.findElement(By.xpath("//div[@class='product-container']"));
		a.moveToElement(frame).build().perform();
		a.click(frame).build().perform();
		WebElement Quickview = driver.findElement(By.xpath("//a[@class='quick-view']"));
		a.click(Quickview).build().perform();
		driver.switchTo().frame(0);
		WebElement addtocart = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
		addtocart.click();
		driver.switchTo().defaultContent();
		Thread.sleep(8000);
		WebElement proceed1 = driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]"));
		proceed1.click();
		WebElement checkout1= driver.findElement(By.xpath("(//span[contains(text(),'Proceed to checkout')])[2]"));
		checkout1.click();
		WebElement checkout2 = driver.findElement(By.xpath("(//span[contains(text(),'Proceed to checkout')])[2]"));
		checkout2.click();
		 WebElement Agree = driver.findElement(By.id("cgv"));
		 Agree.click();
		 WebElement checkout3 = driver.findElement(By.xpath("(//span[contains(text(),'Proceed to checkout')])[2]"));
		 checkout3.click();
		 WebElement payment = driver.findElement(By.xpath("//a[@class='cheque']"));
		 payment.click();
		 WebElement confirm = driver.findElement(By.xpath("//span[text()= 'I confirm my order']"));
		 confirm.click();
		 JavascriptExecutor j =(JavascriptExecutor)driver;
		 j.executeScript("window.scrollBy(0,500);");
		 Thread.sleep(3000);
		 TakesScreenshot take =(TakesScreenshot)driver;
		 File source = take.getScreenshotAs(OutputType.FILE);
	   	 File destination = new File("C:\\Users\\12345\\eclipse-workspace\\Selinium_Testing\\Screenshorts\\img1.png");
	   	 FileUtils.copyFile(source, destination);    
	}
		
		
	}


