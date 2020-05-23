package demoPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoPageOnload {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://admin:manager@www.engnew-charter.net/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


	}

}
