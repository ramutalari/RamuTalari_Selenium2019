package package_practice_v1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleSearch
{
	
	WebDriver driver;
	@Test()
	public void sample() throws Exception
	{
		System.setProperty("webdriver.chrom.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);		
	}	

}
