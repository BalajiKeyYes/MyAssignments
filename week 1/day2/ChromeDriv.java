package week1.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriv {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}

}
