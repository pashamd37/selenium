package test.lbg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
	 System.setProperty( "webdriver.chrome.driver","C:\\Users\\mohammadp\\Desktop\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");

			

		

	}

}
