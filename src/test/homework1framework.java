package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homework1framework {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "//Users//Saiefrcks//Desktop//frameworks//farmework2018//drivers//chromedriver" );
		driver.get ("http://facebook.com");


	}

}
