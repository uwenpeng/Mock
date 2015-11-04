import cucumber.api.java.en.*;
import org.junit.Assert;

/***************************************************************************
 *
 * This document contains confidential and proprietary information 
 * subject to non-disclosure agreements with CloudAxis. This 
 * information shall not be distributed or copied without written 
 * permission from the CloudAxis.
 *
 ***************************************************************************/

/***************************************************************************
 *<PRE>
 * 
 *  Creation Date   : 2015年11月4日
 * 
 *  Author          : Uwen
 * 
 *  Purpose         : TODO
 * 
 * 
 *  History         : TODO
 * 
 *</PRE>
 ***************************************************************************/
public class StepDef {
	MathApplicationTester mat = new MathApplicationTester();
	
	
	@Given("^I have a mock method$")
	public void i_have_a_mock_method() throws Throwable {
		mat.setUp();
		System.out.println("\n\n");
		System.out.println("The method is launching");
	}

	@When("^I　run the TestRunner$")
	public void i_run_the_TestRunner() throws Throwable {
		TestRunner.main(null);
		System.out.println("Testing now...");
	}

	@Then("^I will get a result$")
	public void i_will_get_a_result() throws Throwable {
		Assert.assertEquals(true, TestRunner.getBoo());
		Thread.sleep(40);
		System.err.println("The mock test was passed");
	}
}
