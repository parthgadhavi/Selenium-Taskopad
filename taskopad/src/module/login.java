package module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class login {

	
	public static WebDriver driver;

	@Test(priority=1)
	@Parameters({ "url", "username", "password" })
	public void launchApp(String url, String username, String password) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Parth Gadhavi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions p = new ChromeOptions();
		p.addArguments("--disable-notifications");
		driver = new ChromeDriver(p);
		 
	  
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.findElement(By.id("usr")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("blue-btn")).click();
		WebElement list_dropdown = driver.findElement(By.xpath("(//select)[1]"));
		Select sel = new Select(list_dropdown);
		sel.selectByIndex(1);
		
	}
	
	
}
