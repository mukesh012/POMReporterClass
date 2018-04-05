package webdriverchrome;

import org.openqa.selenium.chrome.ChromeDriver;

public class Opechrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\MukeshBabu\\Documents\\Eclipse\\FirstSelenium\\src\\test\\resources\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
	}

}
