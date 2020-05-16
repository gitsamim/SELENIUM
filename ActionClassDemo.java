package com.selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver", "../chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement course = driver.findElement(By.xpath("//span[text()='Courses Offered']"));
		Actions act = new Actions(driver);
		act.moveToElement(course).perform();
		Thread.sleep(4000);
		act.contextClick(course).perform();
		//act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(3000);
		//System.out.println("before");
		//act.sendKeys(Keys.ENTER).perform();
		//System.out.println("after");
		//driver.quit();

		act.sendKeys("T").perform();
		
		act.sendKeys(Keys.ALT).build();
		act.sendKeys(Keys.CONTROL).build();
		act.sendKeys(Keys.DELETE).perform();
		
	}

}
