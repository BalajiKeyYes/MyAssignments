package week2.day1;


import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {

	public static void main(String[] args) throws InterruptedException {
		// Driver Initialization
		ChromeDriver driver = new ChromeDriver();

		// Loading URL
		driver.get("http://facebook.com");

		// Maximizing Window
		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		
		driver.findElement(By.name("login")).click();
		
		String textEle = driver.getTitle();
		
		System.out.println(textEle);
		
		driver.close();
		
}
}