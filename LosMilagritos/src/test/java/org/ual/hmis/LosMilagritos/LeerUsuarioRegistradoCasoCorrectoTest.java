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
public class LeerUsuarioRegistradoCasoCorrectoTest {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;
	@Before
	public void setUp() { 
		int browser= 0; 
		Boolean headless = false;

		switch (browser) {
		case 0: 
			System.setProperty("webdriver.gecko.driver",  "drivers/geckodriver.exe");
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
	public void leerUsuarioRegistradoCasoCorrecto() {
		// Abre la página
		driver.get("https://my-app-1717583869591.azurewebsites.net/");

		// Espera a que el elemento esté presente
		WebDriverWait wait = new WebDriverWait(driver, 10);

		//Entrar como usuario a la app
		WebElement usernameField = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-vaadin-text-field-6")));
		usernameField.sendKeys("user");

		WebElement passwordField = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-vaadin-password-field-7")));
		passwordField.sendKeys("user");

		WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("vaadin-button:nth-child(2)")));
		loginButton.click();

		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("vaadin-grid-cell-content:nth-child(33)")));


		// Haz clic en el elemento
		element.click();

		// Asegúrate de que el texto sea el esperado
		assertThat(element.getText(), is("Eula"));

		// Asegúrate de que los otros elementos tengan el texto esperado
		assertThat(driver.findElement(By.cssSelector("vaadin-grid-cell-content:nth-child(34)")).getText(), is("Lane"));
		assertThat(driver.findElement(By.cssSelector("vaadin-grid-cell-content:nth-child(35)")).getText(), is("eula.lane@jigrormo.ye"));
		assertThat(driver.findElement(By.cssSelector("vaadin-grid-cell-content:nth-child(36)")).getText(), is("(762) 526-5961"));
		assertThat(driver.findElement(By.cssSelector("vaadin-grid-cell-content:nth-child(37)")).getText(), is("1954-10-29"));
		assertThat(driver.findElement(By.cssSelector("vaadin-grid-cell-content:nth-child(38)")).getText(), is("Insurance Clerk"));
		assertThat(driver.findElement(By.cssSelector("vaadin-grid-cell-content:nth-child(39)")).getText(), is("Worker"));
	}
}
