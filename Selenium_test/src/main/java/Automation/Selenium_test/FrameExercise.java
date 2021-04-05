package Automation.Selenium_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExercise {

	public static void main(String[] args) throws InterruptedException {
		String path = "D:\\chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[10]/a/img")).click();
        
        driver.switchTo().frame(0);
        
        WebElement button1 = driver.findElement(By.id("Click"));
        button1.click();
        
        String tname = driver.findElement(By.id("Click")).getText();
        System.out.println(tname);
        
        driver.switchTo().defaultContent();
        
        driver.switchTo().frame(1);
        driver.switchTo().frame("frame2");
        
        driver.findElement(By.id("Click1")).click();
        
        String button2 = driver.findElement(By.id("Click1")).getText();
        System.out.println(button2);
        
        driver.switchTo().defaultContent();
        
        List<WebElement> totalframe = driver.findElements(By.tagName("iframe"));
        
        int count = totalframe.size();
        System.out.println(count);
     
	}

}
