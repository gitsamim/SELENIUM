package demoPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoTitle {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com");
		
		
		String expectedTitle="actiTIME - Login";
		String actualTitle=driver.getTitle();
		
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		

	}

}
