package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoTest {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.krninformatix.com/sample.html");
		
		String url = driver.getCurrentUrl();
		System.out.println("url :" + url); 
	/*	//System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM_TESTING\\SELENIUM-AUTOMATION\\lib\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		boolean checkBox = driver.findElement(By.id("rem")).isSelected();
		System.out.println("checkBox :" + checkBox); 
		
		driver.findElement(By.id("rem")).click();
		boolean checkBox1 = driver.findElement(By.id("rem")).isSelected();
		System.out.println("checkBox :" + checkBox1); */
	}

}
