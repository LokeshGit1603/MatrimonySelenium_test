package Automation.Selenium_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableExercise {

	public static void main(String[] args) throws InterruptedException {
		String path = "D:\\chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/sortable.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        List<WebElement> sortlist = driver.findElements(By.xpath("//*[@id=\"sortable\"]/li"));
        
        WebElement from = sortlist.get(6);
        WebElement to = sortlist.get(0);
        
        Actions action = new Actions(driver);
		/*
		 * action.dragAndDrop(from, to); action.build().perform();
		 */
        action.clickAndHold(from).moveToElement(to).release(to).build().perform();

	}

}
