package PKG01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class T01 {
	public WebDriver driver;
	@BeforeSuite
	public void launchBrowser() {

		System.setProperty("Webdriver.chromedirver",
				"E:\\\\Rohit\\\\Practice_eclipse\\\\Drivers_and _jar_files\\\\chromedriver_win32_114.0.5735.90\\\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
	}
	
	@AfterSuite
	public void closeBrowser() {

		driver.close();

	}
	
  @Test
  public void testmethod1() {
	  
	  driver.get("https://demoqa.com/webtables");
	  System.out.println(driver.getTitle());
	  Assert.assertEquals("DEMOQA", driver.getTitle());
  }

@Test
public void testmethod2() throws InterruptedException {
	  
	 driver.findElement(By.xpath("//li[@id='item-0']")).click(); 
	 Thread.sleep(3000);
}
}
