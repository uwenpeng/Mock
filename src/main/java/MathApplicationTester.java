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
 *  Creation Date   : 2015年11月2日
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
import org.easymock.EasyMock;
import org.easymock.EasyMockRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EasyMockRunner.class)
public class MathApplicationTester {

	private MathApplication mathApplication;
	private CalculatorService calcService;
	public static double a;
	public static double b;

	public static double getA() {
		return a;
	}

	public static void setA(double a) {
		MathApplicationTester.a = a;
	}

	public static double getB() {
		return b;
	}

	public static void setB(double b) {
		MathApplicationTester.b = b;
	}

	@Before
	public void setUp(){
		mathApplication = new MathApplication();
		calcService = EasyMock.createMock(CalculatorService.class);
		mathApplication.setCalculatorService(calcService);
	}

	@Test
	public void testAddAndSubstract(){
		//add the behavior to add numbers
		EasyMock.expect(calcService.add(getA(),getB())).andReturn(getA()+getB());
		//subtract the behavior to subtract numbers
		EasyMock.expect(calcService.subtract(getA(),getB())).andReturn(getA()-getB());
		//activate the mock
		EasyMock.replay(calcService);	
		//test the substract functionality
		Assert.assertEquals(mathApplication.subtract(getA(),getB()),getA()-getB(),0);
		//test the add functionality
		Assert.assertEquals(mathApplication.add(getA(),getB()),getA()+getB(),0);
		//verify call to calcService is made or not
		EasyMock.verify(calcService);
	}
}
