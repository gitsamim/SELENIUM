package demoPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(20000);
		
		String expectedText="Enter Time-Track";
		String actualText=driver.findElement(By.xpath("(//td[@class='pagetitle'])[1]")).getText();
		
		if (actualText.equals(expectedText)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}	
	}
}
