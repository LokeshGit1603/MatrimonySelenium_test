package Automation.Selenium_test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException, AWTException {
		String path = "D:\\chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[19]/a/img")).click();
        
        WebElement ub = driver.findElement(By.xpath("//input[@type='file']"));
ub.click();
		/*
		 * Actions action = new Actions(driver);
		 * 
		 * action.click(uploadbutton); action.build().perform();
		 * 
		 */

Thread.sleep(2000);
        
        String file = "C:/Users/Lokesh-47408/Downloads/testleaf.xlsx";
        
        StringSelection filename = new StringSelection(file);
        
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filename, null);
        
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        

	}

}
