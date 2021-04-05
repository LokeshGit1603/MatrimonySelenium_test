package Automation.Selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dummy {

	public static void main(String[] args) throws InterruptedException {

    	String path = "D:\\chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.navigate().to("https://in.linkedin.com/");
        driver.navigate().back();
        
		/*
		 * driver.findElement(By.id("email")).sendKeys("sketchneat01@gmail.com");
		 * 
		 * driver.findElement(By.id("pass")).sendKeys("Lokesh2017$");
		 * 
		 * String S = driver.findElement(By.id("email")).getAttribute("value"); String
		 * S1 = driver.findElement(By.id("pass")).getAttribute("value");
		 * 
		 * System.out.println(S); System.out.println(S1);
		 */
		/* driver.findElement(By.id("u_0_b")).click(); */
		  
		/*
		 * String S = driver.getCurrentUrl(); System.out.println(S);
		 * 
		 * if(S.equals("https://www.facebook.com/")) {
		 * System.out.println("URL is Same");
		 * 
		 * } else { System.out.println("URL is not same"); }
		 */
	

	}

}
