package Automation.Selenium_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExercise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[15]/a/img")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
		
		
		  Actions action = new Actions(driver); action.keyDown(Keys.CONTROL)
		  .click(list.get(0)) .click(list.get(1))
		  .click(list.get(3)).build().perform();
		 
		
		/*
		 * Actions action = new Actions(driver); action.clickAndHold(list.get(0))
		 * .clickAndHold(list.get(1)) .clickAndHold(list.get(2)).build().perform();
		 */
	}

}
