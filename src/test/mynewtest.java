package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mynewtest {


	@Test
	public void testFirstName() {

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "//Users//Saiefrcks//Desktop//frameworks//farmework2018//drivers//chromedriver" );
		driver.get ("http://facebook.com");

	}




}
