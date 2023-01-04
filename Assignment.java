package mavenpractice;


import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;

public class Assign1 {

@BeforeSuite
	public void beforeSuite() {
	System.out.println("Before Suite test");
}

@AfterSuite
public void afterSuite() {
System.out.println("after Suite test");
}

@BeforeTest
public void beforeTest() {
	System.out.println("Before test executor");
}

@AfterTest
public void afterTest() {
	System.out.println("after test executor");
}

@BeforeGroups
public void beforeGroup() {
	System.out.println("Before group executor");
}

@AfterGroups
public void afterGroup() {
	System.out.println("after group executor");
}

@BeforeMethod	
public void beforeMethod() {
	System.out.println("I am executing before Method");
	
}

@AfterMethod	
public void afterMethod() {
	System.out.println("I am executing after Method");
	
}

@Test (groups ={"smoke","fire"})
public void test004() {
	System.out.println("I am executing group test");
	
}
@Test (description="testcase created by Jeevi")
public void test007() {
	System.out.println("I am executing test case 007");
}
@Test (description="testcase created by Jeevi")
public void test009() {
	System.out.println("I am executing test case 009");
}
@Test (groups ={"water"})
public void test005() {
	System.out.println("I am executing group test");
	
}
@Test
public void test001() {
	System.out.println("I am executing first test");
	
}
@Test (dependsOnMethods = { "test003" })
public void test0010() {
	System.out.println("executed by Jeevitha");
}

@Test
public void test002() {
	System.out.println("I am executing second test");
	
}


@DataProvider
public Object[][] dp()
{
	Object[][] data= {{"Name1","Password1"},{"Name2","Password2"}};
	return data;
}

@Test(dataProvider="dp")
public void test001(String username, String password)
{
	System.out.println("Username :"+username);
	System.out.println("Password :"+password);
	System.out.println("I am from Test001");
}
@Test (groups = {"bharathi", "smoke", "sanity"})
public void test003() {
	System.out.println("I am executing test case 003");
	Reporter.log("I am executing test case 003");
}




}
