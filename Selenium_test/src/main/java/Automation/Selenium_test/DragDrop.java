package Automation.Selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		String path = "D:\\chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[14]/a/img")).click();
        
        WebElement from = driver.findElement(By.id("draggable"));
        WebElement to = driver.findElement(By.id("droppable"));
        
        Actions action = new Actions(driver);
		/*
		 * action.clickAndHold(from).moveToElement(to).release(to);
		 * action.build().perform();
		 */
        
        action.dragAndDrop(from, to).build().perform();
	}

}
