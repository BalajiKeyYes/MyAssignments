package week2.day1;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenLeafTaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		//WebElement userName = driver.findElement(By.id("username"));
		
		//userName.sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
	    driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		
				
		
		
		
		
		
		
	}

}
