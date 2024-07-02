package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// Driver Initialization
		ChromeDriver driver = new ChromeDriver();

		// Loading URL
		driver.get("http://facebook.com");

		// Maximizing Window
		driver.manage().window().maximize();

		// Waiting for 2 secs
		Thread.sleep(2000);

		// Closing the window
		driver.close();
	}

}
