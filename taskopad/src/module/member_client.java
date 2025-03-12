package module;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class member_client extends Tasks {

	@Test(priority = 19)
	public void member() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.findElement(By.className("box-body")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Add New Member')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Your First Name']")).sendKeys("qaweu");
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Last Name']")).sendKeys("qawo");
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Email']")).sendKeys("op@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Designation']")).sendKeys("qa");
		driver.findElement(By.id("usr")).sendKeys("1234");
		WebElement dob = driver.findElement(By.xpath("//input[@placeholder='Enter Your Birthdate (dd/mm/yyyy)']"));
		dob.sendKeys("25/08/1998");
		driver.findElement(By.className("dropdown-btn")).click();
		driver.findElement(By.xpath("(//div[normalize-space()='Test Automation'])[1]")).click();
		WebElement list_dropdown1 = driver.findElement(By.xpath("//select[@formcontrolname='gender']"));
		Select se1 = new Select(list_dropdown1);
		se1.selectByIndex(2);
		WebElement list_dropdown01 = driver.findElement(By.xpath("//select[@formcontrolname='roleId']"));
		Select sel1 = new Select(list_dropdown01);
		sel1.selectByIndex(2);
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		Thread.sleep(5000);
		//wait.until(driver -> ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Add New Member')]")).apply(driver));
		driver.findElement(By.xpath("//button[contains(text(),'Add New Member')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Your First Name']")).sendKeys("pqrsed");
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Last Name']")).sendKeys("rtyued");
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Email']")).sendKeys("ed@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Designation']")).sendKeys("qa");
		driver.findElement(By.id("usr")).sendKeys("123467");
		WebElement dob2 = driver.findElement(By.xpath("//input[@placeholder='Enter Your Birthdate (dd/mm/yyyy)']"));
		dob2.sendKeys("25/08/1998");
		driver.findElement(By.className("dropdown-btn")).click();
		driver.findElement(By.xpath("(//div[normalize-space()='Test Automation'])[1]")).click();
		WebElement list_dropdown2 = driver.findElement(By.xpath("//select[@formcontrolname='gender']"));
		Select se2 = new Select(list_dropdown2);
		se2.selectByIndex(1);
		WebElement list_dropdown02 = driver.findElement(By.xpath("//select[@formcontrolname='roleId']"));
		Select sel2 = new Select(list_dropdown02);
		sel2.selectByIndex(1);
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Add New Member')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Your First Name']")).sendKeys("abvcffd");
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Last Name']")).sendKeys("mjhyfd");
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Email']")).sendKeys("fd@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Designation']")).sendKeys("qa");
		driver.findElement(By.id("usr")).sendKeys("123467");
		WebElement dob3 = driver.findElement(By.xpath("//input[@placeholder='Enter Your Birthdate (dd/mm/yyyy)']"));
		dob3.sendKeys("25/08/1998");
		driver.findElement(By.className("dropdown-btn")).click();
		driver.findElement(By.xpath("(//div[normalize-space()='Test Automation'])[1]")).click();
		WebElement list_dropdown3 = driver.findElement(By.xpath("//select[@formcontrolname='gender']"));
		Select se3 = new Select(list_dropdown3);
		se3.selectByIndex(2);
		WebElement list_dropdown03 = driver.findElement(By.xpath("//select[@formcontrolname='roleId']"));
		Select sel3 = new Select(list_dropdown03);
		sel3.selectByIndex(2);
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Add New Member')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Your First Name']")).sendKeys("lkiogf");
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Last Name']")).sendKeys("bvgfgf");
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Email']")).sendKeys("gf@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Designation']")).sendKeys("qa");
		driver.findElement(By.id("usr")).sendKeys("123467");
		WebElement dob4 = driver.findElement(By.xpath("//input[@placeholder='Enter Your Birthdate (dd/mm/yyyy)']"));
		dob4.sendKeys("25/08/1998");
		driver.findElement(By.className("dropdown-btn")).click();
		driver.findElement(By.xpath("(//div[normalize-space()='Test Automation'])[1]")).click();
		WebElement list_dropdown4 = driver.findElement(By.xpath("//select[@formcontrolname='gender']"));
		Select se4 = new Select(list_dropdown4);
		se4.selectByIndex(1);
		WebElement list_dropdown04 = driver.findElement(By.xpath("//select[@formcontrolname='roleId']"));
		Select sel4 = new Select(list_dropdown04);
		sel4.selectByIndex(1);
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Add New Member')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Your First Name']")).sendKeys("nvbgcv");
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Last Name']")).sendKeys("sffducv");
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Email']")).sendKeys("cv@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Designation']")).sendKeys("qa");
		driver.findElement(By.id("usr")).sendKeys("123467");
		WebElement dob5 = driver.findElement(By.xpath("//input[@placeholder='Enter Your Birthdate (dd/mm/yyyy)']"));
		dob5.sendKeys("25/08/1998");
		driver.findElement(By.className("dropdown-btn")).click();
		driver.findElement(By.xpath("(//div[normalize-space()='Test Automation'])[1]")).click();
		WebElement list_dropdown5 = driver.findElement(By.xpath("//select[@formcontrolname='gender']"));
		Select se5 = new Select(list_dropdown5);
		se5.selectByIndex(2);
		WebElement list_dropdown05 = driver.findElement(By.xpath("//select[@formcontrolname='roleId']"));
		Select sel5 = new Select(list_dropdown05);
		sel5.selectByIndex(2);
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();

	}

	
	@Test(priority = 20)
	public void client() throws InterruptedException {
		//driver.findElement(By.className("box-body")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='nav-item ng-star-inserted']//a[@id='manage-clients']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Add New Client']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Company Name']")).sendKeys("SoAn");
		driver.findElement(By.xpath("//input[@placeholder='Enter Client Name']")).sendKeys("abcd");
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[normalize-space()='Add New Client']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Company Name']")).sendKeys("SoAn2");
		driver.findElement(By.xpath("//input[@placeholder='Enter Client Name']")).sendKeys("abc");
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Add New Client']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Company Name']")).sendKeys("SoAn3");
		driver.findElement(By.xpath("//input[@placeholder='Enter Client Name']")).sendKeys("abcoi");
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Add New Client']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Company Name']")).sendKeys("SoAn4");
		driver.findElement(By.xpath("//input[@placeholder='Enter Client Name']")).sendKeys("abcpo");
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Add New Client']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Company Name']")).sendKeys("SoAn5");
		driver.findElement(By.xpath("//input[@placeholder='Enter Client Name']")).sendKeys("abchg");
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();

	}
}
