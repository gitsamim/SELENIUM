package demoPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoConfirmation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		

		driver.get("https://krninformatix.com/selenium/testing.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		driver.findElement(By.xpath("//button[text()='Generate Confirm Box']")).click();
		

		Thread.sleep(3000);
		
		Alert alt=driver.switchTo().alert();
		
		
		
		alt.dismiss();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Generate Confirm Box']")).click();
		Thread.sleep(3000);
		
		String confirmText=alt.getText();
		System.out.println(confirmText);
		
		alt.accept();

	}

}
