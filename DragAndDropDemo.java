package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "../chromedriver.exe"); 
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement source = driver.findElement(By.xpath("//div[@id='block-1']/h1"));
		WebElement terget = driver.findElement(By.xpath("//div[@id='block-3']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source, terget).perform();

	}

}
