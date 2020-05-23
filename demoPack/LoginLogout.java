package demoPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginLogout {

	public static void main(String[] args) throws InterruptedException {
		ExcelLibrary xlib=new ExcelLibrary();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		int si=xlib.getLastRowNumber("Sheet1");
		
		for (int i = 1; i <=si; i++) {
			String un=xlib.getExcelData("Sheet1", i, 0);
			String pw=xlib.getExcelData("Sheet1", i, 1);
			driver.findElement(By.id("username")).sendKeys(un);
			driver.findElement(By.name("pwd")).sendKeys(pw);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(10000);
			driver.findElement(By.id("logoutLink")).click();
			Thread.sleep(10000);
		}
		
	}

}
