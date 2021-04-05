package Automation.Selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderExercise {

	public static void main(String[] args) throws InterruptedException {
		String path = "D:\\chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Calendar.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
       WebElement calender =  driver.findElement(By.id("datepicker"));
       
		/* calender.sendKeys("02/10/2021"+Keys.ENTER); */
       
       calender.click();
       Thread.sleep(2000);
       
       driver.findElement(By.xpath("//a[@title='Next']")).click();
       Thread.sleep(2000);
       
       driver.findElement(By.xpath("//a[contains(text(),'10')]")).click();
  

        
        //02/10/2021
	}

}
