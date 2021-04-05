package Automation.Selenium_test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExercise {

	public static void main(String[] args) throws InterruptedException {
		String path = "D:\\chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Alert.html");
        driver.manage().window().maximize();
       
        Thread.sleep(1000);
        
        WebElement alertbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
        alertbox.click();
        
        Thread.sleep(1000);
        
        Alert alertboxx = driver.switchTo().alert();
        alertboxx.accept();
        
        driver.findElement(By.xpath("//*[@id=\'contentblock']/section/div[2]/div/div/button")).click();
        
        Alert confirmbox = driver.switchTo().alert();
        Thread.sleep(1000);
        confirmbox.dismiss();
        
        driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button")).click();
        
        Alert promptbox = driver.switchTo().alert();
        Thread.sleep(1000);
        promptbox.sendKeys("Rajan");
        Thread.sleep(1000);
        promptbox.accept();
        
        
        
        
	}

}
