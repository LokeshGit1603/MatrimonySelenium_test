package Automation.Selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		String path = "D:\\chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.doctorsmatrimony.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        driver.findElement(By.id("loginbtn")).click();
        
        driver.findElement(By.id("a12")).sendKeys("doc100037");
        driver.findElement(By.xpath("//input[@value='Password']")).sendKeys("cbstest");
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}
