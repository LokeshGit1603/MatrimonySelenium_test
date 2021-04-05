package Automation.Selenium_test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Downloadfile {

	public static void main(String[] args) throws InterruptedException {
		String path = "D:\\chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[18]/a/img")).click();
        Thread.sleep(2000);
        
      WebElement link =  driver.findElement(By.linkText("Download Excel"));
      link.click();
        Thread.sleep(3000);
        
        File file = new File("C:\\Users\\Lokesh-47408\\Downloads");
        
        File[] listoffiles = file.listFiles();
        
        for (File file2 : listoffiles) {
        	
        	if(file2.getName().equals("testleaf.xlsx"))
        	{
        		System.out.println("File is downloaded");
        		break;
        	}
			
		}

	}

}
