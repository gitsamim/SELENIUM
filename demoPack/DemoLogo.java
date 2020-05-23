package demoPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoLogo {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/");
		
		boolean logoStatus=driver.findElement(By.xpath("//div[@class='atLogoImg']")).isDisplayed();
		System.out.println(logoStatus);

	}

}
