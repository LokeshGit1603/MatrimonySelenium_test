package Automation.Selenium_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex1 {

	public static void main(String[] args) throws InterruptedException {
		String path = "D:\\chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/");
        driver.manage().window().maximize();
       
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[5]/a/img")).click();
        
        Thread.sleep(1000);
        
      
        
        WebElement d1 = driver.findElement(By.id("dropdown1"));
        Select s1 = new Select(d1);
        s1.selectByIndex(3);
        Thread.sleep(1000);
        
        WebElement d2 = driver.findElement(By.xpath("//select[@name='dropdown2']"));
        Select s2 = new Select(d2);
        s2.selectByVisibleText("Appium");
        Thread.sleep(2000);
        
        WebElement d3 = driver.findElement(By.id("dropdown3"));
        Select s3 = new Select(d3);
        s3.selectByValue("4");
        Thread.sleep(1000);
        
WebElement d4 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/select"));
       Select s4 = new Select(d4);
       List<WebElement> options =  s4.getOptions();
       int num = options.size();
       System.out.println("Number of options are" + num);
       Thread.sleep(1000);
       
        WebElement d5 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/select"));
        d5.sendKeys("Selenium");
        Thread.sleep(1000);
        
        WebElement d6 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[6]/select"));
       Select s5 = new Select(d6);
       s5.selectByIndex(1);
       s5.selectByIndex(2);
       s5.selectByIndex(3);
	}

}
