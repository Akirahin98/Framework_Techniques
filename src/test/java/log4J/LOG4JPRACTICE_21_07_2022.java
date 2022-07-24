package log4J;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LOG4JPRACTICE_21_07_2022 {

	public WebDriver driver;
	public Logger log;
	
	@Test
	public void log4j() {
		System.setProperty("webdriver.chrome.driver", "./Drivers1/chromedriver.exe");
		driver=new ChromeDriver();
		log.info("Browser Lunched");
		driver.get("https://www.easyhindityping.com/english-to-oriya-translation");
		log.info("URL hitted");
		driver.findElement(By.id("SourceTextarea")).sendKeys("Who are you");
		log.info("Data passed");
		driver.findElement(By.id("SubmitTranslation")).click();
		log.info("Clicked on Translate button");
	}
	
	@Test
	public void OdiatoHindi() {
		System.setProperty("webdriver.chrome.driver", "./Drivers1/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.easyhindityping.com/odia-to-hindi-translation");
		driver.findElement(By.id("translationTextarea")).sendKeys("ତୁ କିଏ ବେ ");
		driver.findElement(By.id("SubmitTranslation")).click();
		driver.close();
	}
	@BeforeMethod
	public void beforemethod() {
		log=Logger.getLogger("Log4jpractice");
		PropertyConfigurator.configure("log4j2.properties");
	}
	
	@AfterMethod
	public void Aftermethod() {
		driver.quit();
		log.info("Browser closed======>Test Passed");
	}
	
	
}
