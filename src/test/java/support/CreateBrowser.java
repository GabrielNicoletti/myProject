package support;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateBrowser {
	
	public static WebDriver createChrome(String URL) {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		
		WebDriver chrome = new ChromeDriver();
		
        chrome.manage().window().maximize();
        chrome.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        chrome.get(URL);

        return chrome;	
		
	}

}
