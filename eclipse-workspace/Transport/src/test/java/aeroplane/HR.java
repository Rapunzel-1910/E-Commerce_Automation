package aeroplane;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HR {

	public static void main(String[] args)
	{
		
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		                                // APPLY LEAVE
		
		driver.findElement(By.xpath("//div[@class=\"oxd-grid-item oxd-grid-item--gutters orangehrm-quick-launch-card\"][4]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//div[@class=\"oxd-select-text oxd-select-text--active\"]")).click();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        
//	    Select objj=new Select(obj);
//	    objj.selectByVisibleText("CAN - FMLA");
//	    objj.selectByIndex(2);
         driver.findElement(By.xpath("//input[@class=\"oxd-input oxd-input--active\" and @placeholder=\"yyyy-dd-mm\"][1]")).sendKeys("2024-01-12");
         driver.findElement(By.xpath("//input[@class=\"oxd-input oxd-input--active\" and @placeholder=\"yyyy-dd-mm\"]")).sendKeys("2024-07-12");
         driver.findElement(By.xpath("//textarea[@class=\"oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical\"]")).sendKeys("As I am suffering from viral fever, So I will not be able to come to office for a week");
	  
	                                 // ASSIGN LEAVE
		
		
		//driver.findElement(By.xpath("//div[@class=\"oxd-grid-item oxd-grid-item--gutters orangehrm-quick-launch-card\"][1]")).click();
	    //driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Employee1");
		
		
		
		
		                              //ADMIN[USER MANAGEMENT]
		
//		driver.findElement(By.xpath("//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"]")).click();
//		driver.findElement(By.xpath("//button[@ type='button' and @class='oxd-button oxd-button--medium oxd-button--secondary' ]")).click();
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		WebElement obj1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Admin']")));
//		obj1.click();
//		driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]")).sendKeys("Angel");
//		driver.findElement(By.xpath("//input[@//input[@class='oxd-input oxd-input--active' and @autocomplete=\"off\"][1]")).sendKeys("Rapunzel");
//		
		
		
		
		
		
		
		
	}

}

