package module;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class organization_management extends profile {
	

	@SuppressWarnings("deprecation")
	@Test(priority = 8)
	public void Om() throws InterruptedException  {
		//WebDriver driver1= driver;
	    //JavascriptExecutor js = (JavascriptExecutor) driver1;
		//js.executeScript("window.scrollBy(0,-500)");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//img[@class='user-profile-pic ng-star-inserted']")).click();
		driver.findElement(By.xpath("//li[normalize-space()='Organization Management']")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 9)
	public void new_company() throws InterruptedException {
		driver.findElement(By.xpath("//button[contains(text(),'Add New Company')]")).click();
		WebElement form = driver.findElement(By.className("form-section"));
		System.out.println(form.findElements(By.id("usr")).size());
		String company_name = RandomStringUtils.randomAlphabetic(2);
		String company_address = RandomStringUtils.randomAlphabetic(2);
		String[] value = { company_name, company_address };
		for (int i = 0; i < form.findElements(By.id("usr")).size(); i++) {
			form.findElements(By.id("usr")).get(i).sendKeys(value[i]);
		}
		//driver.findElement(By.id("comment")).sendKeys("abcdefg");
		driver.findElement(By.xpath("//button[normalize-space()='Register']")).click();
	}

	@Test(priority = 10)
	public void manage_member() throws InterruptedException {
		driver.findElement(By.className("box-body")).click();
		// Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Add New Member')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Your First Name']")).sendKeys("Parth");
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Last Name']")).sendKeys("gadhavi");
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Email']")).sendKeys("gadhaviparth@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Designation']")).sendKeys("testing");
		driver.findElement(By.id("usr")).sendKeys("12345");
		WebElement dob = driver.findElement(By.xpath("//input[@placeholder='Enter Your Birthdate (dd/mm/yyyy)']"));
		dob.sendKeys("25/08/1998");
		driver.findElement(By.className("dropdown-btn")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Rohit')]")).click();
		WebElement list_dropdown = driver.findElement(By.xpath("//select[@formcontrolname='gender']"));
		Select se = new Select(list_dropdown);
		se.selectByIndex(1);
		/*
		 * driver.findElement(By.xpath("//img[@class='add-right-icon add-plush-icon']"))
		 * .click(); Thread.sleep(2000);
		 * driver.findElement(By.cssSelector("input[placeholder='Enter Role Name']")).
		 * sendKeys("SDLC");
		 * driver.findElement(By.xpath("//label[normalize-space()='Select All']")).click
		 * (); driver.findElement(By.xpath(
		 * "(//button[@type='submit'][normalize-space()='Submit'])[2]")).click();
		 */
		WebElement list_dropdown2 = driver.findElement(By.xpath("//select[@formcontrolname='roleId']"));
		Select sel = new Select(list_dropdown2);
		sel.selectByIndex(1);
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
	}
	@Test(priority=11)
	public void delete_member() {
		driver.findElement(By.className("box-body")).click();
		driver.findElement(By.xpath("//a[@class='delete']//img")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
	}
	@Test(priority=12)
	public void manage_clients() {
		driver.findElement(By.className("box-body")).click();
		driver.findElement(By.linkText("Manage Clients")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Add New Client']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Company Name']")).sendKeys("SoAn");
		driver.findElement(By.xpath("//input[@placeholder='Enter Client Name']")).sendKeys("parth");
		driver.findElement(By.xpath("(//input[@id='usr'])[1]")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Email']")).sendKeys("abcd");
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		
	}
	@Test(priority=13)
	public void delete_clients() {
		driver.findElement(By.className("box-body")).click();
		driver.findElement(By.xpath("//input[@placeholder='Type here to search...']")).sendKeys("parth");
		driver.findElement(By.xpath("//a[@class='delete']//img")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Yes']")).click();
	}
	@Test(priority=14)
	public void manage_role() {
		driver.findElement(By.className("box-body")).click();
		driver.findElement(By.xpath("(//a[normalize-space()='Manage Role'])[1]")).click();
		driver.findElement(By.xpath("//a[@class='delete']//img")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Yes']")).click();
	}
	@Test(priority=15)
	public void manage_services() {
		driver.findElement(By.className("box-body")).click();
		driver.findElement(By.xpath("//a[@id='manage-services']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Add New Service']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Service Name']")).sendKeys("Testing");
		driver.findElement(By.xpath("//input[@placeholder='Enter Your date (DD/MM/YYYY)']")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'29')])[2]")).click();
		WebElement list_dropdown3 = driver.findElement(By.xpath("//select[@formcontrolname='frequency']"));
		Select sel = new Select(list_dropdown3);
		sel.selectByIndex(2);
		driver.findElement(By.xpath("(//span[@class='checkmark'])[4]")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
	}
	@Test(priority=16)
	public void delete_services() throws InterruptedException {
		driver.findElement(By.className("box-body")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='manage-services']")).click();
		driver.findElement(By.xpath("//a[@class='delete']//img")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Yes']")).click();
	}
	@Test(priority=17)
	public void manage_status() throws InterruptedException {
		driver.findElement(By.className("box-body")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("manage-status")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Add New Status']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Status Name']")).sendKeys("Closed");
		WebElement color = driver.findElement(By.xpath("//input[@formcontrolname='colour']"));
		color.click();
		color.findElement(By.xpath("(//div[@class='cursor'])[4]")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
	}
}
