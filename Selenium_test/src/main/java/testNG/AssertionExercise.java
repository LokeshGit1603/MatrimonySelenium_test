package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExercise {
	
	String name = "Lokesh";
	boolean value = true;
	
	@Test
	public void namecheck()
	{
	
		/*
		 * if(name.contentEquals("Lokesh")) { System.out.println("Same name"); } else {
		 * System.out.println("Different name"); }
		 */
		
		Assert.assertEquals(value, true);
	}

}
