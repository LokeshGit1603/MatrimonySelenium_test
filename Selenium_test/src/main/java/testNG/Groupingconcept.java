package testNG;

import org.testng.annotations.Test;

public class Groupingconcept {
	
	@Test (groups = "Apple")
	public void iphone()
	{
		System.out.println("iphone products");
	}
	@Test (groups = "Apple")
	public void mac()
	{
		System.out.println("mac products");
	}
	
	@Test (groups = "Motorola")
	public void motog()
	{
		System.out.println("motog products");
	}
	@Test (groups = "Motorola")
	public void motoplus()
	{
		System.out.println("motoplus products");
	}
	
	@Test (groups = "Mi")
	public void redmi()
	{
		System.out.println("redmi products");
	}
	@Test (groups = "Mi")
	public void xiomi()
	{
		System.out.println("xiomi products");
	}
	
	@Test (groups = "VIVO")
	public void vivopro()
	{
		System.out.println("vivopro products");
	}
	@Test (groups = "VIVO")
	public void vivomax()
	{
		System.out.println("vivomax products");
	}
}
