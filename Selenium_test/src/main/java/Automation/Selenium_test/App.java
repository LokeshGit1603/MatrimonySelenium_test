package Automation.Selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	String path = "D:\\chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.communitymatrimony.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"home-register\"]/div/div[2]/nav/ul/li[2]/a")).click();
        driver.findElement(By.id("domainName")).click();
        
        WebElement domain = driver.findElement(By.id("domainName"));
        Select sd = new Select(domain);
        sd.selectByValue("agarwalmatrimony.com");
        Thread.sleep(1000);
        
        driver.findElement(By.id("profile")).click();
        WebElement profile = driver.findElement(By.id("profile"));
        Select sp = new Select(profile);
        sp.selectByIndex(3);
        Thread.sleep(1000);
        
        driver.findElement(By.id("name")).sendKeys("Arjun");
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//label[@class='radiolabel radio_button']")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.id("dobDay"));
        WebElement date = driver.findElement(By.id("dobDay"));
        Select sdate = new Select(date);
        sdate.selectByValue("4");
        Thread.sleep(1000);
        
        driver.findElement(By.id("dobMonth"));
        WebElement month = driver.findElement(By.id("dobMonth"));
        Select smonth = new Select(month);
        smonth.selectByValue("01");
        Thread.sleep(1000);
        
        driver.findElement(By.id("dobYear"));
        WebElement year = driver.findElement(By.id("dobYear"));
        Select syear = new Select(year);
        syear.selectByValue("1991");
        Thread.sleep(1000);
        
        driver.findElement(By.id("maritalStatus")).click();
        WebElement ms = driver.findElement(By.id("maritalStatus"));
        Select sms = new Select(ms);
        sms.selectByValue("1");
        Thread.sleep(1000);
        
        driver.findElement(By.id("religion")).click();
        WebElement rel = driver.findElement(By.id("religion"));
        Select srel = new Select(rel);
        srel.selectByValue("1");
        Thread.sleep(1000);
        
        driver.findElement(By.id("subCaste")).click();
        WebElement sub = driver.findElement(By.id("subCaste"));
        Select ssub = new Select(sub);
        ssub.selectByValue("1011");
        Thread.sleep(1000);
        
        driver.findElement(By.id("motherTongue")).click();
        WebElement mt = driver.findElement(By.id("motherTongue"));
        Select smt = new Select(mt);
        smt.selectByValue("7");
        Thread.sleep(1000);
        
        driver.findElement(By.id("country")).click();
        WebElement country = driver.findElement(By.id("country"));
        Select sct = new Select(country);
        sct.selectByValue("98");
        Thread.sleep(1000);
        
        driver.findElement(By.id("mobileNo")).sendKeys("8987654569");
        Thread.sleep(1000);
        
        driver.findElement(By.id("password")).sendKeys("cbstest");
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//input[@value='REGISTER NOW']")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.id("email")).sendKeys("arjungoswamysssss@gmail.com");
        Thread.sleep(1000);
		
		
		  WebElement height =
		  driver.findElement(By.id("select2-heightFeet-container")); height.click();
		  driver.findElement(By.xpath(
		  "//li[@title='4 feet 7 inches']")).click();
		  Thread.sleep(1000);
		 
        
        WebElement state =  driver.findElement(By.id("select2-residingState-container"));
        state.click();
        driver.findElement(By.xpath("//li[@title='Arunachal Pradesh']")).click();
        Thread.sleep(1000);
        
        WebElement city =  driver.findElement(By.id("select2-residingCityId-container"));
        city.click();
        driver.findElement(By.xpath("//li[@title='Hawai']")).click();
        Thread.sleep(1000);
        
        WebElement edu =  driver.findElement(By.id("select2-educationCategory-container"));
        edu.click();
        driver.findElement(By.xpath("//li[contains(text(),'M.Sc.')]")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.id("employmentCategorys7")).click();
        Thread.sleep(1000);
        
        WebElement occ =  driver.findElement(By.id("select2-occupation-container"));
        occ.click();
        driver.findElement(By.xpath("//li[contains(text(),'Student')]")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.id("familyValues3")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.id("familyTypes2")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.id("familyStatuss1")).click();
        Thread.sleep(1000);
        
        System.out.println("All Fields Filled Successfully");
        
        driver.findElement(By.id("complete")).click();
        
        System.out.println("Registration Completed Successfully");
    }
}
