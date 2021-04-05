package Automation.Selenium_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {

	public static void main(String[] args) throws InterruptedException {
		String path = "D:\\chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[17]/a/img")).click();
        
        driver.findElement(By.id("tags")).sendKeys("c");
        Thread.sleep(2000);
        
        List<WebElement> searchresult = driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
        
        for (WebElement option : searchresult) {
			if(option.getText().equals("Protractor"))
			{
				option.click();
		
				break;
			}
			else
			{
				System.out.println("Not selected");
			}
		}
	}

}
