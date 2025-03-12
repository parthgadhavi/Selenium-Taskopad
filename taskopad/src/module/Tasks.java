package module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Tasks extends organization_management {

	@Test(priority=18)
	public void task() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//label[normalize-space()='Tasks']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Add New Task']")).click();
		driver.findElement(By.id("usr")).sendKeys("demo");
		driver.findElement(By.xpath("//img[@src='assets/img/greycalender.svg']")).click();
		driver.findElement(By.xpath("//input[@formcontrolname='dueDate']")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'21')])[3]")).click();
		WebElement tap = driver.findElement(By.xpath("(//span[@class='dropdown-btn'])[2]"));
		tap.click();
		driver.findElement(By.xpath("(//div[contains(text(),'Select All')])[2]")).click();
		tap.click();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("(//img[@class='ng-star-inserted'])[3]"));
		js1.executeScript("arguments[0].scrollIntoView();", Element);
		driver.findElement(By.xpath("//img[@class='add-right-icon add-plush-icon']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Task Name & Description']")).sendKeys("Testing");
		driver.findElement(By.xpath("//img[@tooltip='Assignee']")).click();
		WebElement name = driver.findElement(By.xpath("//input[@placeholder='Enter Assignee Name Here']"));
		name.sendKeys("Test Automation");
		name.sendKeys(Keys.ARROW_DOWN);
		name.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='top-section']//img")).click();
		driver.findElement(By.xpath("//input[@formcontrolname='subTaskDueDate']")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'18')])[3]")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
	}
}
