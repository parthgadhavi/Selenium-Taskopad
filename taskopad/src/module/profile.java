package module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class profile extends login {

	@Test(priority = 2)
	public void profile_icon() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//img[@class='user-profile-pic ng-star-inserted']")).click();
		driver.findElement(By.xpath("//li[normalize-space()='Profile Management']")).click();
	}

	@Test(priority = 3)
	public void edit_profile() {
		driver.findElement(By.xpath("//button[contains(text(),'Edit Profile')]")).click();
		driver.findElement(By.id("usr")).clear();
		driver.findElement(By.id("usr")).sendKeys("Test");
		driver.findElement(By.xpath("(//input[@placeholder='Enter Your Last Name'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@placeholder='Enter Your Last Name'])[1]")).sendKeys("Automation");
		driver.findElement(By.xpath("(//input[@id='usr'])[4]")).clear();
		driver.findElement(By.xpath("(//input[@id='usr'])[4]")).sendKeys("7201043538");
		driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
	}

	@Test(priority = 4)
	public void change_password() {
		driver.findElement(By.className("link-section")).click();
		driver.findElement(By.id("oldPassword")).sendKeys("Demo@2015");
		driver.findElement(By.id("newPassword")).sendKeys("Demo@2014");
		driver.findElement(By.id("confirmPassword")).sendKeys("Demo@2014");
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
	}

	@Test(priority = 7)
	public void password_negative() throws InterruptedException {
		WebElement link = driver.findElement(By.className("link-section"));
		link.click();
		WebElement old = driver.findElement(By.id("oldPassword"));
		WebElement newp = driver.findElement(By.id("newPassword"));
		WebElement conp = driver.findElement(By.id("confirmPassword"));
		old.sendKeys("Demo@2014");
		newp.sendKeys("Demo@2016");
		conp.sendKeys("Test@123");
		// driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		// System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Password
		// and confirm password does not match')]")).getText());
		driver.findElement(By.xpath("//span[@aria-hidden='true']")).click();
	}

	@Test(priority = 5)
	public void scroll_element() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

	}

	@Test(priority = 6)
	public void edit_billing() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(text(),'Edit Billing Detail')]")).click();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Demo");
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys("Thaltej");
		driver.findElement(By.id("phone")).clear();
		driver.findElement(By.id("phone")).sendKeys("1234567890");
		driver.findElement(By.xpath("(//a[contains(text(),'x')])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='dropdown-btn'])[1]")).click();
		WebElement country = driver.findElement(By.xpath("(//input[@placeholder='Search'])[1]"));
		country.click();
		country.sendKeys("india");
		driver.findElement(By.xpath("(//div[normalize-space()='India'])[1]")).click();

		driver.findElement(By.xpath("(//span[@class='dropdown-btn'])[2]")).click();
		WebElement state = driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]"));
		state.click();
		state.sendKeys("gujarat");
		driver.findElement(By.xpath("(//div[contains(text(),'Gujarat')])[2]")).click();

		driver.findElement(By.xpath("(//span[@class='dropdown-btn'])[3]")).click();
		WebElement city = driver.findElement(By.xpath("(//input[@placeholder='Search'])[3]"));
		city.click();
		city.sendKeys("ahmedabad");
		driver.findElement(By.xpath("(//div[contains(text(),'Ahmedabad')])[2]")).click();
		driver.findElement(By.id("pin")).clear();
		driver.findElement(By.id("pin")).sendKeys("54321");
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();

	}
}
