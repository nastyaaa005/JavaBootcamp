package sef.ATestTask.SecondActivity;
// Complete Code
import junit.framework.TestCase;
import org.junit.Test;

public class SecondActivityTest extends TestCase {


	//TODO try to achieve 100% of test coverage

	private SecondActivity theCalculator;

	protected void setUp() throws Exception {
		super.setUp();
		//	Initialize variables to be used here
		theCalculator = new SecondActivity();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	//Example ->
	/*@Test
	public void testGetSumPositiveValue() {
		assertEquals(15, (theCalculator.getSum(5, 10)));
		assertEquals(15, (theCalculator.getSum(10, 5)));
	}

	//Example ->
	@Test
	public void testGetSumNegativeValue() {
		assertEquals(5, (theCalculator.getSum(-5, 10)));
		assertEquals(-5, (theCalculator.getSum(5, -10)));
	}*/
	@Test
	public void testMulNegative()
	{
		assertEquals(20, theCalculator.mul(-5, -4));
		assertEquals(-15, theCalculator.mul(-5, 3));
		assertEquals(-10, theCalculator.mul(5, -2));
	}

	@Test
	public void testMulPositive()
	{
		assertEquals(20, theCalculator.mul(5, 4));
		assertEquals(0, theCalculator.mul(0, 3));
		assertEquals(0, theCalculator.mul(5, 0));
	}

	@Test
	public void testSubNegative()
	{
		assertEquals(2, theCalculator.sub(-3, -5));
		assertEquals(8, theCalculator.sub(3, -5));
		assertEquals(-8, theCalculator.sub(-3, 5));
		assertEquals(-1, theCalculator.sub(-3, -2));
	}

	@Test
	public void testSubPositive()
	{
		assertEquals(8, theCalculator.sub(13, 5));
		assertEquals(-8, theCalculator.sub(5, 13));
	}

	@Test
	public void testSumPositive()
	{
		assertEquals(3, theCalculator.sum(1, 2));
		assertEquals(4, theCalculator.sum(2, 2));
		assertEquals(2, theCalculator.sum(0, 2));

	}

	@Test
	public void testSumNegative()
	{
		assertEquals(-1, theCalculator.sum(1, -2));
		assertEquals(1, theCalculator.sum(-2, 3));
		assertEquals(-6, theCalculator.sum(-4, -2));
	}

	@Test
	public void testDivide()
	{
		assertEquals(2, theCalculator.divide(4, 2));
		assertEquals(8, theCalculator.divide(8, 1));
		assertEquals(3, theCalculator.divide(-9, -3));
		assertEquals(-1, theCalculator.divide(-5, 5));
	}

	@Test
	public void testDivideThrowError()
	{
		try{
			int a = theCalculator.divide(10, 0);
		}catch(ArithmeticException e) {System.out.println(e);}
	}

}

