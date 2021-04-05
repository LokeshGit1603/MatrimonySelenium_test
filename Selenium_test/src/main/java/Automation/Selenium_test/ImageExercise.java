package Automation.Selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageExercise {

	public static void main(String[] args) throws InterruptedException {
		String path = "D:\\chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[4]/a/img")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[4]/a/img")).click();

Thread.sleep(2000);

WebElement brokenimage = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));

if(brokenimage.getAttribute("naturalWidth").equals("0"))
{
	System.out.println("The image is broken");
}
else
{
	System.out.println("The image is not broken");
}

	}

}
