package Automation.Selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		String path = "D:\\chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[6]/a/img")).click();
       
        Thread.sleep(1000);
        
        WebElement uncheck = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[2]/input"
        ));
        WebElement check = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[3]/input"
                ));
        
        boolean unchecked = uncheck.isSelected();
        boolean checked = check.isSelected();
        
        System.out.println(unchecked);
        System.out.println(checked);
        
        driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[3]")).click();
	}

}
