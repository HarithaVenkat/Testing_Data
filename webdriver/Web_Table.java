package com.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\12345\\eclipse-workspace\\Selinium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement data : alldata) {
			String text = data.getText();
			System.out.println(text);	
		 }
	  System.out.println("-------------------size-------------------");  
	  int size = alldata.size();
	  System.out.println("size:" +size);
	  List<WebElement> row_data = driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
	  for (WebElement row : row_data) {
		  String text1 = row.getText();
		  System.out.println(text1);
	  }
		  System.out.println("*************row*************");
		
		 List<WebElement> column_data = driver.findElements(By.xpath("//table/tbody/tr/td[4]"));
		 for (WebElement column : column_data) {
			 String text2 = column.getText();
			 System.out.println(text2);
		 }
			 System.out.println("*******particular value********");
			WebElement value = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
			String text3 = value.getText();
			System.out.println(text3);
	
	  
	}
	

}
