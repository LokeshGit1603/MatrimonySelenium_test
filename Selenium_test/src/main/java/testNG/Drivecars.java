package testNG;

import org.testng.annotations.Test;

public class Drivecars {
	
	@Test(priority=0)
	public void startcar()
	{
		System.out.println("Start the car");
	}
	 @Test(priority=1) 
	public void putfirstgear()
	{
		System.out.println("First Gear");
	}
	@Test(priority=2)
	public void putsecondgear()
	{
		System.out.println("Second Gear");
	}
	@Test(priority=3)
	public void putthirdgear()
	{
		System.out.println("Third Gear");
	}
	@Test(priority=4)
	public void putforthgear()
	{
		System.out.println("Forth Gear");
	}
}
