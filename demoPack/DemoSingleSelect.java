package demoPack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoSingleSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		
		
		
		driver.get("https://krninformatix.com/sample.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement singleSelect=driver.findElement(By.id("city"));
		
		Select dd=new Select(singleSelect);
		
		dd.selectByIndex(2);
		Thread.sleep(3000);
		dd.selectByValue("4");
		Thread.sleep(3000);
		dd.selectByVisibleText("Chennai");
		
		List<WebElement> allOPtions=dd.getOptions();
		
		int si=allOPtions.size();
		
		for (int i = 0; i < si; i++) {
			WebElement option1=allOPtions.get(i);
			String te1=option1.getText();
			System.out.println(te1);
		}		
	}

}
