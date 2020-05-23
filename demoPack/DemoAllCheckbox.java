package demoPack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoAllCheckbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/Classes/sample.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> allCheckBoxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		int si=allCheckBoxes.size();
		
		for (int i = 0; i < si; i++) {
			Thread.sleep(1000);
			WebElement check=allCheckBoxes.get(i);
			check.click();
		}
	}

}
