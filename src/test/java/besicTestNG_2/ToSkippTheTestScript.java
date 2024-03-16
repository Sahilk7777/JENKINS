package besicTestNG_2;
import org.testng.Assert;
import org.testng.annotations.Test;
public class ToSkippTheTestScript {
	@Test//(dependsOnMethods = "SignIn")
	public void SignUp()
	{
	    System.out.println("SignUp");	
	}
	@Test 
	public void SignIn()
	{
		System.out.println("SignIN");	
		Assert.assertEquals("pune","deccan")
	}
	@Test(dependsOnMethods = "SignIn")
	public void SignOut()
	{
		System.out.println("SignOut");	
	}

}
