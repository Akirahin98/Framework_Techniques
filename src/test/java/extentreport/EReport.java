package extentreport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EReport {
	WebDriver driver;
	@Test
	public void EngtoOdia() {
		System.setProperty("webdriver.chrome.driver", "./Drivers1/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.easyhindityping.com/english-to-oriya-translation");
		driver.findElement(By.id("SourceTextarea")).sendKeys("Who are you");
		driver.findElement(By.id("SubmitTranslation")).click();
		driver.close();
	}
	@Test
	public void OdiatoEng() {
		System.setProperty("webdriver.chrome.driver", "./Drivers1/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.easyhindityping.com/oriya-to-english-translation");
		driver.findElement(By.id("translationTextarea")).sendKeys("ତୁ କିଏ ବେ ");
		driver.findElement(By.id("SubmitTranslation")).click();
		driver.close();

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
	@Test
	public void HinditoOdia() {
		System.setProperty("webdriver.chrome.driver", "./Drivers1/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.easyhindityping.com/hindi-to-odia-translation");
		driver.findElement(By.id("translationTextarea")).sendKeys("तुम कौन हो?");
		driver.findElement(By.id("SubmitTranslation")).click();
		driver.close();

	}
}
