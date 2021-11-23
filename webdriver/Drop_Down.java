package com.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\12345\\eclipse-workspace\\Selinium_Testing\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in/");
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("(//a[@role= 'button'])[2]")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.name("firstname")).sendKeys("Haritha");
	driver.findElement(By.name("lastname")).sendKeys("Korsapati");
    driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("jfhjkfjkfjk");
    driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("dgjfdgh7y4");
    WebElement bday = driver.findElement(By.id("day"));
    Select s= new Select(bday);
    s.selectByValue("16");
    WebElement bmonth = driver.findElement(By.id("month"));
    Select s1= new Select(bmonth);
    Thread.sleep(1000);
    s1.selectByIndex(10);
    WebElement byear = driver.findElement(By.id("year"));
    Select s2 = new Select(byear);
    Thread.sleep(1000);
    s2.selectByVisibleText("2006");
    List<WebElement>options = s2.getOptions();
    int si = options.size();
    boolean multiple = s.isMultiple();
    System.out.println("True or False:" +multiple);
    
    
	
}

}
