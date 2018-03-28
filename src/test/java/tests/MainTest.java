package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertEquals;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;

import pages.LoginPage;
import support.CreateBrowser;

// Comment apenas para mudar no GIT

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "MainTest.csv")
public class MainTest {

	private WebDriver chrome;

	@Before
	public void setUp() {
		String url = "https://intranet.daitangroup.com/";
		chrome = CreateBrowser.createChrome(url);
	}

	@Test
	public void loginIntranet(
			@Param(name = "login") String login,
			@Param(name = "senha") String senha,
			@Param(name = "tabname") String tabname) {

		// LoginPage loginGabriel = new LoginPage(chrome);

		String textoBotaoHome = new LoginPage(chrome).digitarLogin(login).digitarSenha(senha).clicarOk()
				.identificaTextBotaoHome();

		/*
		 * Fiz esse Try/Catch com sleep para treinar caso eu precise try {
		 * Thread.sleep(5000); } catch (InterruptedException ex) { System.out.println
		 * ("Puxa, estava dormindo! Você me acordou"); }
		 * 
		 */

		assertEquals(tabname, textoBotaoHome);

	}

	@After
	public void tearDown() {
		chrome.close();
	}

}
