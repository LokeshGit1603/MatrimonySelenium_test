package Automation.Selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		String path = "D:\\chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[7]/a/img")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[1]/input")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[3]/input")).click();
        Thread.sleep(2000);
        
        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/input"));
        if(checkbox.isSelected())
        {
        	System.out.println("Check box is selected");
        }
        else
        {
        	System.out.println("Check box is not selected");
        }
        
        WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]/input"));
        if(checkbox1.isSelected())
        {
        	driver.findElement(By.xpath("//*[@id=\\\"contentblock\\\"]/section/div[3]/div[1]/input")).click();
        }
        else
        {
        	System.out.println("Check box 1 is unselected by default");
        }
        WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]/input"));
        if (checkbox2.isSelected())
        		{
        	driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]/input")).click();
        		}
        else
        {
        	System.out.println("Check box 2 is unselected by default");
        }
        
	}

}
