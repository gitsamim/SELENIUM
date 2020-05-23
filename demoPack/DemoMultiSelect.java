package demoPack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoMultiSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://krninformatix.com/sample.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement multiSelect=driver.findElement(By.id("cities"));
		Select dd=new Select(multiSelect);
		dd.selectByIndex(2);
		Thread.sleep(3000);
		dd.selectByValue("4");
		Thread.sleep(3000);
		dd.selectByVisibleText("Chennai");
		
		//Thread.sleep(3000);
		//dd.deselectAll();
		
		List<WebElement> allOPtions=dd.getAllSelectedOptions();
		
		int si=allOPtions.size();
		
		for (int i = 0; i < si; i++) {
			WebElement option1=allOPtions.get(i);
			String te1=option1.getText();
			System.out.println(te1);
		}
		
		
	}

}
