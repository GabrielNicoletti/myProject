package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

	public HomePage(WebDriver chrome) {
		super(chrome);
		// TODO Auto-generated constructor stub
	}
	
    public String  identificaTextBotaoHome(){
        return chrome.findElement(By.xpath("//*[@id=\"main-menu\"]/div[1]/ul/li[1]/a")).getText();
    }

}
