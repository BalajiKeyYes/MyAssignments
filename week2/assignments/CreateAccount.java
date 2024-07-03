package week2.assignments;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
	    driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("My Home")).click();
		
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("Selenium Automation Tester.");
		
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		
		driver.findElement(By.id("numberEmployees")).sendKeys("100");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String Title = driver.getTitle();
		
		if (Title == "Account Details | opentaps CRM") {
				System.out.println("Title Verified");
		}else {
			System.out.println("Title not verified");
		}
		
		driver.close();

				
		
		
		
				
		
		
		
		
		
		
	}

}
