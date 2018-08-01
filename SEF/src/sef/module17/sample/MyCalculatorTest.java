package sef.module17.sample;
// Complete Code
import junit.framework.*;
import java.text.DecimalFormat;
public class MyCalculatorTest extends TestCase {

	private MyCalculator theCalculator;

	protected void setUp() throws Exception {
		super.setUp();
		//	Initialize variables to be used here
		theCalculator = new MyCalculator();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testCheckSumPositiveNumbers()
	{
		int a=5;
		int b=10;
		assertEquals(15, (theCalculator.getSum(a,b)));
		assertEquals(15, (theCalculator.getSum(b,a)));
	}

	public void testCheckSumOneNegativeValue()
	{
		int a = -5;
		int b = 10;
		//	Checks the sum of a postive value and a negative value
		assertEquals(5, (theCalculator.getSum(a,b)));
		assertEquals("Sum should be 5",5, (theCalculator.getSum(b,a)));

	}

	public void testCheckSumNegativeValues() {
		
		int a = -5;
		int b = -10;
		int result=-15;
		assertEquals(result, (theCalculator.getSum(a,b)));
		assertEquals(result, (theCalculator.getSum(b,a)));
		assertTrue((theCalculator.getSum(a,b))==result);

	}

	public void testCheckGetDifferencePositiveValues()
	{
		int a=10;
		int b=5;

		assertEquals(5,theCalculator.getDifference(a,b));
		assertEquals(-5,theCalculator.getDifference(b,a));
	}

	public void testCheckGetDifferenceOneNegativeValues()
	{
		int a=-10;
		int b=15;

		assertEquals(-25,theCalculator.getDifference(a,b));
		assertEquals(25,theCalculator.getDifference(b,a));
	}
	public void testCheckGetDifferenceNegativeValues()
	{
		int a=-10;
		int b=-15;

		assertEquals(5,theCalculator.getDifference(a,b));
		assertEquals(-5,theCalculator.getDifference(b,a));
	}
	public void testProductOfPositiveValues(){
		int a=5;
		int b=2;

		assertEquals(10.0,theCalculator.getProduct(a,b));
		assertEquals(10.0,theCalculator.getProduct(b,a));
	}
	public void testProductOfOneNegativeValue(){
		int a=5;
		int b=-2;
		assertEquals(-10.0,theCalculator.getProduct(a,b));
		assertEquals(-10.0,theCalculator.getProduct(b,a));
	}
	public void testProductOfNegativeValues(){
		double a=-2.5;
		double b=-2;
		assertEquals(5.0,theCalculator.getProduct(a,b));
		assertEquals(5.0,theCalculator.getProduct(b,a));
	}

	public void testProductOfNegativeValuesFloat(){
		float a=-2.5f;
		float b=-2f;
		double result=5.0;
		assertEquals(result,Double.parseDouble(new DecimalFormat("##.#").format(theCalculator.getProduct(a,b))));
		assertEquals(result,Double.parseDouble(new DecimalFormat("##.#").format(theCalculator.getProduct(b,a))));
		assertEquals(result,(theCalculator.getProduct(b,a)),1);
	}

	public void testQuotientOfPositiveValues(){
		double a=6;
		double b=3;

		assertEquals(2.0,theCalculator.getQuotient(a,b));
		assertEquals(0.5,theCalculator.getQuotient(b,a));
	}
	public void testPOuotientOfOneNegativeValue(){
		double a=-6;
		double b=3;
		assertEquals(-2.0,theCalculator.getQuotient(a,b));
		assertEquals(-0.5,theCalculator.getQuotient(b,a));
	}
	public void testQuotientOfNegativeValues(){
		double a=-6;
		double b=-3;
		assertEquals(2.0,theCalculator.getQuotient(a,b));
		assertEquals(0.5,theCalculator.getQuotient(b,a));
	}

	public void testGetQuotientOfZeroValue()
	{
		// pārbauda vai atbilstošā error message ir parādīta gadījumā ja notiek dalīšāna ar nulli
		double a=0; double b=6.6;
		assertEquals(0.0,theCalculator.getQuotient(a,b));
		try {
			assertEquals(0.0, theCalculator.getQuotient(b, a));
		}catch(IllegalArgumentException e){assertEquals
				("You re not allowed to divide by zero", e.getMessage());}
	}
	}


