package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver chrome) {
		super(chrome);
		// TODO Auto-generated constructor stub
	}
	
    public LoginPage digitarLogin (String login){
        chrome.findElement(By.xpath("//*[@id=\"edit-name\"]")).sendKeys(login);
        return this;

    }

    public LoginPage digitarSenha(String senha){
        chrome.findElement(By.xpath("//*[@id=\"edit-pass\"]")).sendKeys(senha);
        return this;

    }

    public HomePage clicarOk(){
        chrome.findElement(By.xpath("//*[@id=\"edit-submit\"]")).click();
        return new HomePage(chrome);
    }

}
