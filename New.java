package aeroplane;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


public class New {
	
	ChromeDriver driver=new ChromeDriver();

	@BeforeMethod
	public void Product_Select()
	{
		driver.findElement(By.xpath("//p[contains(text(),\"Beautiful Peacock Blue Cotton Linen Saree\")]//parent::div//parent::div//parent::div//following-sibling::div//ul//li//a[contains(text(),\"View Product\")]")).click();
		//driver.findElement(By.xpath("//p[contains(text(),\"Green Side Placket Detail T-Shirt\")]//parent::div//parent::div//parent::div//following-sibling::div//ul//li//a[contains(text(),\"View Product\")]")).click();
		//driver.findElement(By.xpath("//p[contains(text(),\"Green Side Placket Detail T-Shirt\")]//parent::div//a")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	    driver.findElement(By.cssSelector("button[type='button']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	  //driver.findElement(By.xpath("//div[@class=\"modal-content\"]//div[3]//button[contains(text(),\"Continue Shopping\")]")).click();
	}
	
	
	@Test
	public  void Cart()
	{
		driver.findElement(By.xpath("//div[@class=\"modal-content\"]//div[2]//p[2]//a")).click();
		driver.findElement(By.xpath("//div[@class=\"modal-content\"]//div[3]//button[contains(text(),\"Continue Shopping\")]")).click();
	}
	
	
	@AfterMethod
	public void Checkout()
	{
		driver.findElement(By.xpath("//a[contains (text(),\"Proceed To Checkout\")]")).click();
		driver.findElement(By.xpath("//textarea[@name=\"message\"]")).sendKeys("I Really like this Blue PEACOCK LINEN SAREE, Eagerly waiting to receive my order");
		driver.findElement(By.xpath("//a[contains(text(),\"Place Order\")]")).click();
	}
	
	
	@BeforeClass
	public void Login()
	{
	 driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]")).sendKeys("jessithraJ@gmail.com");
	 driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]")).sendKeys("Jessithra@18");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	 driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]")).click();
	}
	
	
	@BeforeSuite
	public void url()
	{
		driver.get("https://automationexercise.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	
	
	@AfterSuite
	public void payment()
	{
		driver.findElement(By.xpath("//input[@name=\"name_on_card\"]")).sendKeys("JESSITHRA MARY J");
		driver.findElement(By.xpath("//input[@name=\"card_number\"]")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@name=\"cvc\"]")).sendKeys("987");
		driver.findElement(By.xpath("//input[@name=\"expiry_month\"]")).sendKeys("04");
		driver.findElement(By.xpath("//input[@name=\"expiry_year\"]")).sendKeys("2026");
		driver.findElement(By.xpath("//button[@class=\"form-control btn btn-primary submit-button\"]")).click();
		driver.findElement(By.xpath("//a[contains(text(),\"Download Invoice\")]")).click();
		
		
		
	}
	
}
