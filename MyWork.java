package com.selenium;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyWork {

	WebDriver driver = null;
	
	public void loginTask(String uName, String pass) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM_TESTING\\SELENIUM-AUTOMATION\\lib\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://180.179.129.78:30006/portal/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement secure = driver.findElement(By.xpath("//button[@id='details-button']"));
		String tex = secure.getText();
		
		//System.out.println(tex); 
		if(tex.equals("Advanced"))
		{
			driver.findElement(By.xpath("//button[@id='details-button']")).click();  
			driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
		}
			//Login credensials
		driver.findElement(By.id("j_username")).sendKeys(uName);
		driver.findElement(By.id("j_password")).sendKeys(pass);
		driver.findElement(By.xpath("//button[text()='Login']")).click();  
		driver.findElement(By.xpath("//li[text()='Administrator Profile']")).click();
		
		createMerchant();
	}
	
	//To create merchant
	public void createMerchant() throws InterruptedException
	{
		try {
		//Select merchantCategory
		WebElement merCategory = driver.findElement(By.id("merchantCategory"));
		Select se = new Select(merCategory);
		se.selectByIndex(4); 
		
		//driver.findElement(By.xpath("(//select[@id='selectedFeatures'])//option[8]")).click(); 
		driver.findElement(By.id("mccCode")).sendKeys("1004-AutoTest"); //MCC CODE  merchantName
		driver.findElement(By.id("merchantName")).sendKeys("AutoTest");
		driver.findElement(By.id("merchantAddress1")).sendKeys("123, ABC ROAD");
		driver.findElement(By.id("merchantPincode")).sendKeys("560056");
		
		WebDriverWait wait = new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='merchantPOArea']")));
		
		WebElement postOffice = driver.findElement(By.xpath("//select[@id='merchantPOArea']"));
		Select po = new Select(postOffice); 
		po.selectByVisibleText("Mallathahalli");
		
		//Thread.sleep(8000);
		WebElement city = driver.findElement(By.id("merchantCity"));
		Select ct = new Select(city);
		ct.selectByIndex(1);
		//ct.selectByVisibleText("Bengaluru");
		
		WebElement state = driver.findElement(By.id("merchantState"));
		Select st = new Select(state);
		st.selectByIndex(1);
		//st.selectByVisibleText("Karnataka");  
		
		//driver.findElement(By.xpath("//input[@id='addMerchantContractInfo']")).click(); 
		driver.findElement(By.xpath("//a[text()='Next']")).click();
		
		}
		catch(Exception e)
		{
			//System.out.println("My Exception is :" + e);
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		MyWork obj = new MyWork(); 
		obj.loginTask("admin", "Innoviti@123");
	}

}
