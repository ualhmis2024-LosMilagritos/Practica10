package org.ual.hmis.LosMilagritos;

// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import com.gargoylesoftware.htmlunit.BrowserVersion;


public class CreaciondeUsuariosCasoCorrectoTest {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;
	@Before
	public void setUp()  throws Exception{
		int browser= 0; 
		Boolean headless = false;

		switch (browser) {
		case 0: 
//			System.setProperty("webdriver.gecko.driver",  "drivers/geckodriver.exe");
			FirefoxOptions firefoxOptions = new FirefoxOptions();
//			if (headless) firefoxOptions.addArguments("--headless"); // .setHeadless(headless);
			firefoxOptions.setHeadless(true); 
			driver = new FirefoxDriver(firefoxOptions);
			//HtmlUnit Driver
//			driver = new HtmlUnitDriver(BrowserVersion.FIREFOX, true);
			break;

		case 1: 
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			ChromeOptions chromeOptions = new ChromeOptions();
//			if (headless) chromeOptions.addArguments("--headless"); // .setHeadless(headless);
			chromeOptions.setHeadless(true);
			driver = new ChromeDriver(chromeOptions);
			//HtmlUnit Driver
//			driver = new HtmlUnitDriver(BrowserVersion.CHROME, true);
			break;

		default:
			fail("Please select a browser");
			break;
		}

		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}
	@After
	public void tearDown() {
		driver.quit();
	}
	@Test
	public void creaciondeUsuariosCasoCorrecto() {
		WebDriverWait wait = new WebDriverWait(driver, 10);

		// Step # | name | target | value
		// 1 | open | https://my-app-1717583869591.azurewebsites.net/ | 
		driver.get("https://my-app-1717583869591.azurewebsites.net/");

		//Entrar como usuario a la app
		WebElement usernameField = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-vaadin-text-field-6")));
		usernameField.sendKeys("user");

		WebElement passwordField = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-vaadin-password-field-7")));
		passwordField.sendKeys("user");

		WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("vaadin-button:nth-child(2)")));
		loginButton.click();


		// 2 | click | css=vaadin-grid | 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("vaadin-grid"))).click();

		// 3 | sendKeys | id=input-vaadin-text-field-23 | Lucia
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-vaadin-text-field-23"))).sendKeys("Lucia");

		// 4 | sendKeys | id=input-vaadin-text-field-24 | Santos
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-vaadin-text-field-24"))).sendKeys("Santos");

		// 5 | sendKeys | id=input-vaadin-text-field-25 | lsa180@inlumine.ual.es
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-vaadin-text-field-25"))).sendKeys("lsa180@inlumine.ual.es");

		// 6 | sendKeys | id=input-vaadin-text-field-26 | (435) 545-345
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-vaadin-text-field-26"))).sendKeys("(435) 545-345");

		// 7 | sendKeys | id=input-vaadin-date-picker-27 | 05/12/2003
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-vaadin-date-picker-27"))).sendKeys("05/12/2003");

		// 8 | click | css=.animate > vaadin-button:nth-child(2) | 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".animate > vaadin-button:nth-child(2)"))).click();

		// 9 | sendKeys | id=input-vaadin-text-field-28 | Rod Buster Helper
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-vaadin-text-field-28"))).sendKeys("Rod Buster Helper");

		// 10 | sendKeys | id=input-vaadin-text-field-29 | Estudiante
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-vaadin-text-field-29"))).sendKeys("Estudiante");

		// 11 | click | css=vaadin-button:nth-child(1) | 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("vaadin-button:nth-child(1)"))).click();
	}
}
