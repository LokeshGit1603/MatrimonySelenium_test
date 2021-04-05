package Automation.Selenium_test;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtendedLink {

	public static void main(String[] args) throws InterruptedException {
		String path = "D:\\chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.leafground.com/pages/Link.html");
        driver.manage().window().maximize();

        Thread.sleep(2000);
		/*
		 * driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[3]/a/img"
		 * )).click();
		 */
        
        WebElement gohome = driver.findElement(By.linkText("Go to Home Page"));
        gohome.click();
        
       driver.navigate().back();
      
       Thread.sleep(2000);
		  WebElement gowhere = driver.findElement(By.
		  linkText("Find where am supposed to go without clicking me?")); String where
		  = gowhere.getAttribute("href"); System.out.println(where);
		  Thread.sleep(2000);
		 
      
      WebElement broken = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/a"));
      broken.click();
      Thread.sleep(2000);
      String title = driver.getTitle();
      
      if(title.contains("404")) {
    	  System.out.println("Page not found");
      }
      else
      {
    	  System.out.println("No issue with the page");
      }
      
      driver.navigate().back();
      Thread.sleep(2000);
      WebElement gohome1 = driver.findElement(By.linkText("Go to Home Page"));
      gohome1.click();
      Thread.sleep(2000);
      driver.navigate().back();
      Thread.sleep(2000);
      
      List<WebElement> linkcount = driver.findElements(By.tagName("a"));
     int totallinks =  linkcount.size();
     System.out.println("Total number of links are "+ totallinks);
    
	
	}

}
