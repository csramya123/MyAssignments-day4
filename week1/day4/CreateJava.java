package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("demoSalesManager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    
	   String title= driver.getTitle();
	   System.out.println(title);
	   
	   driver.findElement(By.linkText("CRM/SFA")).click();
	   driver.findElement(By.linkText("Leads")).click();
	   driver.findElement(By.linkText("Create Lead")).click();
	   driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	   driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramyashree");
	   driver.findElement(By.id("createLeadForm_lastName")).sendKeys("CS");
	   driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("suraviram0993@gmail.com");
	   driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9638527410");
	   driver.findElement(By.name("submitButton")).click();
	   String title1= driver.getTitle();
	   System.out.println(title1);
	   
	   
	  
	 
	   
	   
	   
		
	}

}
