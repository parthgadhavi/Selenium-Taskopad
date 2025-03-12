package module;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class management extends login {

	@SuppressWarnings("deprecation")
	@Test(priority = 2)
	public void om() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//img[@class='user-profile-pic ng-star-inserted']")).click();
		driver.findElement(By.xpath("//li[normalize-space()='Organization Management']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@Test(priority = 3)
	public void new_company() throws InterruptedException {
		driver.findElement(By.xpath("//button[contains(text(),'Add New Company')]")).click();
		WebElement form = driver.findElement(By.className("form-section"));
		System.out.println(form.findElements(By.id("usr")).size());
		String company_name = RandomStringUtils.randomAlphabetic(2);
		String company_address = RandomStringUtils.randomAlphabetic(2);
		String[] value = { company_name, company_address, "1234567890", "abcd@gmail.com" };
		for (int i = 0; i < form.findElements(By.id("usr")).size(); i++) {
			form.findElements(By.id("usr")).get(i).sendKeys(value[i]);
		}
		driver.findElement(By.xpath("//button[normalize-space()='Register']")).click();
	}

	@SuppressWarnings("deprecation")
	
	@Test(priority = 4)
	public void add_member() throws InterruptedException {

		for (int i = 0; i < 1; i++) {
			driver.findElement(By.xpath("//button[normalize-space()='Add New Member']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String first_name = RandomStringUtils.randomAlphabetic(2);
			String Last_name = RandomStringUtils.randomAlphabetic(2);
			String emil = RandomStringUtils.randomAlphabetic(6);
			String desg = RandomStringUtils.randomAlphabetic(4);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder='Enter Your First Name']")).sendKeys(first_name);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder='Enter Your Last Name']")).sendKeys(Last_name);
			driver.findElement(By.xpath("//input[@placeholder='Enter Your Email']")).sendKeys(emil + "@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder='Enter Your Designation']")).sendKeys(desg);
			Thread.sleep(1000);
			WebElement list_dropdown1 = driver.findElement(By.xpath("//select[@formcontrolname='gender']"));
			Select se1 = new Select(list_dropdown1);
			se1.selectByIndex(1);
			driver.findElement(By.xpath("//img[@class='add-right-icon add-plush-icon']")).click();
			String role = RandomStringUtils.randomAlphabetic(4);
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("input[placeholder='Enter Role Name']")).sendKeys(role);
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//span[@class='checkmark'])[8]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//button[@type='submit'][normalize-space()='Submit'])[2]")).click();
			WebElement list_dropdown01 = driver.findElement(By.xpath("//select[@formcontrolname='roleId']"));
			Select sel1 = new Select(list_dropdown01);
			Thread.sleep(1000);
			sel1.selectByIndex(1);
			driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
			Thread.sleep(6000);
		}
		driver.findElement(By.xpath("//li[@class='nav-item ng-star-inserted']//a[@id='manage-clients']")).click();

		for (int j = 0; j < 15; j++) {
			driver.findElement(By.xpath("//button[normalize-space()='Add New Client']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String company_name = RandomStringUtils.randomAlphabetic(2);
			String client_name = RandomStringUtils.randomAlphabetic(2);
			driver.findElement(By.xpath("//input[@placeholder='Enter Company Name']")).sendKeys(company_name);
			driver.findElement(By.xpath("//input[@placeholder='Enter Client Name']")).sendKeys(client_name);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
			Thread.sleep(6000);
		}

	}
}
