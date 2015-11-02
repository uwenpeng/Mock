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
public class MathApplication {
   private CalculatorService calcService;

   public void setCalculatorService(CalculatorService calcService){
      this.calcService = calcService;
   }
   public double add(double input1, double input2){
      return calcService.add(input1, input2);		
   }
   public double subtract(double input1, double input2){
      return calcService.subtract(input1, input2);
   }
   public double multiply(double input1, double input2){
      return calcService.multiply(input1, input2);
   }
   public double divide(double input1, double input2){
      return calcService.divide(input1, input2);
   }
}
