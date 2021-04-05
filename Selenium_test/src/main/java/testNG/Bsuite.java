package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Bsuite {
	WebDriver driver;
	long starttime;
	long endtime;
	long totaltime;

	@BeforeSuite

	public void launchbrowser()

	{
	    starttime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void gotoleaf()
	{	

		driver.get("http://www.leafground.com/");

	}

	@Test
	public void gotobing()
	{
		driver.get("https://www.bing.com/");

	}

	@Test
	public void gotofb()
	{

		driver.get("https://www.facebook.com/");

	}

	@AfterSuite
	public void quitebrowser()
	{
		driver.quit();
		endtime = System.currentTimeMillis();
		totaltime = endtime-starttime;
		System.out.println(totaltime);
	}

}


