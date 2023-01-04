package mavenpractice;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Assign2 {
	
	@Test
	public void test004()
	{
		System.out.println("I am from Test004");
	}
	@Test
	public void test005()
	{
		System.out.println("I am from Test005");
	}
	@Test
	public void test006()
	{
		System.out.println("I am from Test006");
	}
	@AfterMethod
	public void postCondition()
	{
		System.out.println("I am from AfterMethod");
	}
	@Test(groups = {"Sanity"})
	public void test105()
	{
		System.out.println("I am from Test105");
	}
}






















