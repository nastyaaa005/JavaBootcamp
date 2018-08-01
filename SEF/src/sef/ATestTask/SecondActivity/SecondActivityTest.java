package sef.ATestTask.SecondActivity;
// Complete Code
import junit.framework.TestCase;
import org.junit.Test;

public class SecondActivityTest extends TestCase {

	private Calculator theCalculator;

	protected void setUp() throws Exception {
		super.setUp();
		//	Initialize variables to be used here
		theCalculator = new Calculator();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	//Example ->
	@Test
	public void testGetSumPositiveValue() {
		double expected = 15;
		assertEquals(expected, (theCalculator.add(5, 10)));
		assertEquals(expected, (theCalculator.add(10, 5)));
	}

	//Example ->
	@Test
	public void testGetSumNegativeValue() {
		double expected = 5;
		assertEquals(expected, (theCalculator.add(-5, 10)));
		expected = -5;
		assertEquals(expected, (theCalculator.add(5, -10)));
	}

	@Test
	public void testGetSubtractionPositiveValue() {
		double expected = -5;
		assertEquals(expected, (theCalculator.subtract(5, 10)));
		expected = 5;
		assertEquals(expected, (theCalculator.subtract(10, 5)));
	}

	@Test
	public void testGetSubtractionOneNegativeValue() {
		double expected = -15;
		assertEquals(expected, (theCalculator.subtract(-5, 10)));
		expected = 15;
		assertEquals(expected, (theCalculator.subtract(10, -5)));
	}

	@Test
	public void testGetSubtractionNegativeValue() {
		double expected = 5;
		assertEquals(expected, (theCalculator.subtract(-5, -10)));
		expected = -5;
		assertEquals(expected, (theCalculator.subtract(-10, -5)));
	}

	@Test
	public void testGetMultiplicationPositiveValue() {
		double expected = 50;
		assertEquals(expected, (theCalculator.multiply(5, 10)));
		expected = 50;
		assertEquals(expected, (theCalculator.multiply(10, 5)));
	}

	@Test
	public void testGetMultiplicationOneNegativeValue() {
		double expected = -50;
		assertEquals(expected, (theCalculator.multiply(-5, 10)));
		expected = -50;
		assertEquals(expected, (theCalculator.multiply(10, -5)));
	}

	@Test
	public void testGetMultiplicationNegativeValue() {
		double expected = 50;
		assertEquals(expected, (theCalculator.multiply(-5, -10)));
		expected = 50;
		assertEquals(expected, (theCalculator.multiply(-10, -5)));
	}

	@Test
	public void testGetDivisionPositiveValue() {
		double expected = 0.5;
		assertEquals(expected, (theCalculator.divide(5, 10)));
		expected = 2;
		assertEquals(expected, (theCalculator.divide(10, 5)));
	}

	@Test
	public void testGetDivisionOneNegativeValue() {
		double expected = -0.5;
		assertEquals(expected, (theCalculator.divide(-5, 10)));
		expected = -2;
		assertEquals(expected, (theCalculator.divide(10, -5)));
	}

	@Test
	public void testGetDivisionNegativeValue() {
		double expected = 0.5;
		assertEquals(expected, (theCalculator.divide(-5, -10)));
		expected = 2;
		assertEquals(expected, (theCalculator.divide(-10, -5)));
	}

	@Test
	public void testGetDivisionOfZeroValue()
	{
		double x = 0; double y = 5.0;
		assertEquals(0.0,theCalculator.divide(x,y));
		try {
			assertEquals(0.0, theCalculator.divide(y, x));
		} catch(ArithmeticException e) {
			assertEquals("No dividing by 0", e.getMessage());}
	}
}

