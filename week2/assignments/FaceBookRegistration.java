package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookRegistration {

		public static void main(String[] args) throws InterruptedException {
			// Driver Initialization
			ChromeDriver driver = new ChromeDriver();

			// Loading URL
			driver.get("http://facebook.com");

			// Maximizing Window
			driver.manage().window().maximize();
			
			//Registration
			//driver.findElement(By.className("_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy")).click();
			
			driver.findElement(By.partialLinkText("Create new account")).click();
			
			//Enter Fist Name
			driver.findElement(By.name("firstname")).sendKeys("Balaji");
			
			//driver.findElement(By.name("firstname")).sendKeys("Balaji");
			
			//Enter Last Name
			driver.findElement(By.id("u_9_d_pP")).sendKeys("KS");
			
			Select objSelect = new Select(driver.findElement(By.id("day")));
			objSelect.selectByIndex(4);
			
			
			

			/*
			 * driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
			 * 
			 * driver.findElement(By.id("pass")).sendKeys("Tuna@321");
			 * 
			 * driver.findElement(By.name("login")).click();
			 * 
			 * String textEle = driver.getTitle();
			 * 
			 * System.out.println(textEle);
			 * 
			 * driver.close();
			 */
			
	}
	
}
