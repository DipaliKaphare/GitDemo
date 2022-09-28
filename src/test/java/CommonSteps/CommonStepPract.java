package CommonSteps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonStepPract {
	
private WebDriver driver;
	
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();	
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
		@After
		public void Close() 
		{
//			driver.quit();
		}
		
		public WebDriver getDriver() {
			// TODO Auto-generated method stub
			return driver ;
		}

}
