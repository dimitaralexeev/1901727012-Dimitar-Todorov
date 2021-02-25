package uni.fmi.hmqt;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHomeWork {
	
	private WebDriver driver;
	
	@BeforeClass
	public static void setupClass() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	}
	
	@Before
	public void setup() {
		driver = new ChromeDriver();
	}
	
	@Test
	public void checkTagName() {
		driver.get("https://wot-life.com/");		 
		WebElement element = driver.findElement(By.id("logo"));		
		final String result = element.getTagName();
		assertEquals("div", result);
	}
	
	@Test
	public void checkSearchResult() {
		driver.get("https://wot-life.com/");	
		WebElement searchInput = driver.findElement(By.id("searchbox"));	
		searchInput.sendKeys("mantamanta");		
		WebElement searchButton = driver.findElement(By.className("input-group")).findElement(By.tagName("button"));
		searchButton.submit();
		final String expectedUrl = "https://wot-life.com/eu/player/mantamanta/";
		final String result = driver.getCurrentUrl();
		
		assertEquals(expectedUrl, result);
	}
	
	@Test
	public void checkIsTabDisplayed() {
		driver.get("https://wot-life.com/");
		WebElement searchInput = driver.findElement(By.id("searchbox"));
		searchInput.sendKeys("mantamanta");
		WebElement searchButton = driver.findElement(By.className("input-group")).findElement(By.tagName("button"));
		searchButton.submit();
		WebElement tabPanel = driver.findElement(By.id("tab1"));
		final boolean result = tabPanel.isDisplayed();
		
		assertEquals(true, result);
	}
	
	@Test
	public void checkCssValue() {
		driver.get("https://wot-life.com/");
		WebElement searchInput = driver.findElement(By.id("searchbox"));
		searchInput.sendKeys("mantamanta");
		WebElement searchButton = driver.findElement(By.className("input-group")).findElement(By.tagName("button"));
		searchButton.submit();
		WebElement element = driver.findElement(By.id("title")).findElement(By.tagName("h1"));
		final String result = element.getCssValue("font-weight");
		
		assertEquals("500", result);
	}
	
	@Test
	public void checkPageTitle() {
		driver.get("https://wot-life.com/");
		WebElement searchInput = driver.findElement(By.id("searchbox"));
		searchInput.sendKeys("mantamanta");
		WebElement searchButton = driver.findElement(By.className("input-group")).findElement(By.tagName("button"));
		searchButton.submit();
		String element = driver.getTitle();
		//final String result = element.getCssValue("font-weight");
		
		assertEquals("mantamanta - WoT-Life.com - World of Tanks Statistics", element);
	}
	
	@After
	public void after() {
		driver.close();
	}
	
}
