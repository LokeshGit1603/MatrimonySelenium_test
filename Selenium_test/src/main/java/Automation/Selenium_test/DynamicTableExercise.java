package Automation.Selenium_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;

public class DynamicTableExercise {

	public static void main(String[] args) throws InterruptedException {
		String path = "D:\\chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/table.html");
        driver.manage().window().maximize();

        Thread.sleep(2000);
        
        List<WebElement> numberofcolumn = driver.findElements(By.tagName("th"));
       int columncount =  numberofcolumn.size();
       System.out.println(columncount);
       
       
       List<WebElement> numberofrow = driver.findElements(By.tagName("tr"));
       int rowcount =  numberofrow.size();
       System.out.println(rowcount);
       
       WebElement progress = driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
       String progressvalue = progress.getText();
       System.out.println(progressvalue);
       
       List<WebElement> progress1 = driver.findElements(By.xpath("//td[2]"));
       
       List<Integer> numberList = new ArrayList<Integer>();
       
       for (WebElement webElement : progress1) {
    	   String individual = webElement.getText().replace("%", "");
    	   numberList.add(Integer.parseInt(individual));
		 
	}
       
       System.out.println(numberList);
       
       int smallvalue = Collections.min(numberList);
       System.out.println(smallvalue);
       
       String smallvalueString = Integer.toString(smallvalue)+"%";
       String Expath = "//td[normalize-space()="+"\""+ smallvalueString + "\""+"]"+"//following::td[1]";
       
       System.out.println(Expath);
       
       WebElement check = driver.findElement(By.xpath(Expath));
   check.click();
       
       System.out.println("Checked");

	}

}
