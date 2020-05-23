package demoPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoFrames {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/frames/frames.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.switchTo().frame(1);
		driver.findElement(By.name("name1")).sendKeys("prathap");
		
		//driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		
		//driver.switchTo().frame("secondframe");
		//driver.findElement(By.name("rep")).click();
		
		WebElement frm=driver.findElement(By.xpath("//frame[@src='third.html']"));
		driver.switchTo().frame(frm);
		driver.findElement(By.name("check")).click();

	}

}
