package Maven_Amazon.Project_Amazon;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Automation {

	@Test
	
	public void browser_Launch() {

		ChromeOptions opt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.amazon.in/");
		opt.addArguments("Start_Maximized");
	}
	
}
