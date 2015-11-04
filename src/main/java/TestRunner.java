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
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static boolean boo;
	public static boolean getBoo() {
		return boo;
	}
	public static void setBoo(boolean boo) {
		TestRunner.boo = boo;
	}
	
	public static void main(String[] args) throws Exception {
		Result result = JUnitCore.runClasses(MathApplicationTester.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		setBoo(result.wasSuccessful());
	}
}  	
