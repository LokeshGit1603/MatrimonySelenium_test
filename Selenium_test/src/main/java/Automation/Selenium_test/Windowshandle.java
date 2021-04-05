package Automation.Selenium_test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandle {

	public static void main(String[] args) throws InterruptedException {
		String path = "D:\\chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[11]/a/img")).click();
        
        String Parent = driver.getWindowHandle();
        
        WebElement home = driver.findElement(By.id("home"));
        home.click();
        Thread.sleep(2000);
        
        Set<String> childwindows = driver.getWindowHandles();
        
        for (String allwindows : childwindows) {
        	
        	driver.switchTo().window(allwindows);
        }
        
        driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img")).click();
        
        Thread.sleep(2000);
        
        driver.close();
        	
        	driver.switchTo().window(Parent);
        	
        	driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button")).click();
        	
        	int count = driver.getWindowHandles().size();
        	System.out.println(count);
        	
        	driver.findElement(By.id("color")).click();
        	
        	Set<String> restwindows = driver.getWindowHandles();
        	for (String newwindow : restwindows) {
			if(!newwindow.equals(Parent))
			{
				System.out.println("It came to loop");
				Thread.sleep(2000);
				driver.switchTo().window(newwindow);
				driver.close();
			} 
			}
			
		}
        
	}
	


