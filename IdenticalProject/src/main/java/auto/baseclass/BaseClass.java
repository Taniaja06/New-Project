package auto.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	static WebDriver driver;
	
	//setup method contains all the pre-requisites/ instructions that will be executed.
	public static void SetUp() {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}
}
