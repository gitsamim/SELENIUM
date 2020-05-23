package demoPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DemoIE {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "D:\\Classes\\Batch146\\Demo\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		
	}

}
