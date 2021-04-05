package testNG;

import org.testng.annotations.Test;

public class Dependencycheck {
	
	//Launch site
	//Enter login
	//Access site
	@Test 
	public void launchsite()
	{
		System.out.println("Launch site");
	}
	
	@Test(dependsOnMethods = "launchsite")
	public void login()
	{
		System.out.println("Enter login");
	}
	
	@Test(dependsOnMethods = "login")
	public void Accesssite()
	{
		System.out.println("Access site");
	}

}
