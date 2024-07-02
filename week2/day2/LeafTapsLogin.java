package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapsLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		//WebElement userName = driver.findElement(By.id("username"));
		
		//userName.sendKeys("Demosalesmanager");
		
		//driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		
		
	    //driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		//driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		//driver.findElement(By.xpath("//*[@id=\'label\']/a")  --need to work on this
		
		
		
				
		
		
		
		
		
		
	}

}
