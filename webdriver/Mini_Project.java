package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\12345\\eclipse-workspace\\Selinium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("haritha.korsapati@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Haritha");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Reddy");
		driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		driver.findElement(By.id("passwd")).sendKeys("chanakya123");
		
		WebElement bday = driver.findElement(By.id("days"));
		Select s = new Select(bday);
		s.selectByValue("8");
		WebElement month = driver.findElement(By.id("months"));
		Select s1 = new Select(month);
		s1.selectByValue("1");
        WebElement year = driver.findElement(By.id("years"));
        Select s2 = new Select(year);
        s2.selectByValue("1985");
        
        driver.findElement(By.id("optin")).click();
        driver.findElement(By.id("firstname")).sendKeys("Haritha");
        driver.findElement(By.id("lastname")).sendKeys("Reddy");
        driver.findElement(By.id("company")).sendKeys("Newtech");
        driver.findElement(By.id("address1")).sendKeys("Plot7,miami");
        driver.findElement(By.id("city")).sendKeys("Miami");
        WebElement state = driver.findElement(By.xpath("//*[@id=\"id_state\"]"));
        Select A = new Select(state);
        A.selectByVisibleText("Florida");
        driver.findElement(By.id("postcode")).sendKeys("33101");
        driver.findElement(By.xpath("(//input[@type='text'])[13]")).sendKeys("6380433499");
        driver.findElement(By.id("alias")).sendKeys("chennai");
        driver.findElement(By.id("submitAccount")).click();
        
	}

}
