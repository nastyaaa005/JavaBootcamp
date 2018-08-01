package sef.ATestTask.SecondActivity;
// Complete Code
import junit.framework.TestCase;
import org.junit.Test;

public class SecondActivityTest extends TestCase {


	//TODO try to achieve 100% of test coverage

	private SecondActivity calc;

	protected void setUp() throws Exception {
		super.setUp();
		//	Initialize variables to be used here
		calc = new SecondActivity();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	//Example ->
	@Test
	public void testGetSumPositiveValue() {
		assertEquals(15.0, (calc.sum(5, 10)));
		assertEquals(15.0, (calc.sum(10, 5)));
	}

	//Example ->
	@Test
	public void testGetSumNegativeValue() {
		assertEquals(5.0, (calc.sum(-5, 10)));

		assertEquals(-5.0, (calc.sum(5, -10)));
	}

	@Test
	public void testGetDivisionNegativeValue() {
		assertEquals(0.5, (calc.divide(-5, -10)));
		assertEquals(2.0, (calc.divide(-10, -5)));
	}
	@Test
	public void testGetDivisionOneNegativeValue() {
		assertEquals(-0.5, (calc.divide(-5, 10)));
		assertEquals(-2.0, (calc.divide(10, -5)));
	}
	@Test
	public void testGetDivisionPositiveValue() {
		assertEquals(0.5, (calc.divide(5, 10)));
		assertEquals(2.0, (calc.divide(10, 5)));
	}
	@Test
	public void testGetMultiplicationOneNegativeValue() {
		assertEquals(-50.0, (calc.multiple(-5, 10)));
		assertEquals(-50.0, (calc.multiple(10, -5)));
	}
	@Test
	public void testGetMultiplicationNegativeValue() {
		assertEquals(50.0, (calc.multiple(-5, -10)));
		assertEquals(50.0, (calc.multiple(-10, -5)));
	}
	@Test
	public void testGetMultiplicationpositiveValue() {
		assertEquals(50.0, (calc.multiple(5, 10)));
		assertEquals(50.0, (calc.multiple(10, 5)));
	}
	@Test
	public void testGetSubstractionOneNegativeValue() {
		assertEquals(-15.0, (calc.substract(-5, 10)));
		assertEquals(15.0, (calc.substract(10, -5)));
	}
	@Test
	public void testGetSubstractionPositiveValue() {
		assertEquals(-5.0, (calc.substract(5, 10)));
		assertEquals(5.0, (calc.substract(10, 5)));
	}
	@Test
	public void testGetSubstractionNegativeValue() {
		assertEquals(5.0, (calc.substract(-5, -10)));
		assertEquals(-5.0, (calc.substract(-10, -5)));
	}
	public void testGetDivisionOfZeroValue()
	{
		// pārbauda vai atbilstošā error message ir parādīta gadījumā ja notiek dalīšāna ar nulli
		double a=0; double b=5.0;
		assertEquals(0.0,calc.divide(a,b));
		try {
			assertEquals(0.0, calc.divide(b, a));
		}catch(IllegalArgumentException e){assertEquals
				("You re not allowed to divide by zero", e.getMessage());}
	}
}
