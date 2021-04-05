package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	
	@Test
	@Parameters ("Name")
	public void login(String name)
	{
		System.out.println("Username is "+name);
	}

}
