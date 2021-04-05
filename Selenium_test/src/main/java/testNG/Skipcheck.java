package testNG;

import org.testng.annotations.Test;

public class Skipcheck {
	
	@Test(priority=0)
	public void startcar()
	{
		System.out.println("Start the car");
	}
	@Test(priority=1)
	public void musicon()
	{
		System.out.println("music on");
	}
	@Test(priority=2)
	public void firstgear()
	{
		System.out.println("first gear");
	}
	@Test(priority=3)
	public void secondgear()
	{
		System.out.println("second gear");
	}
}
