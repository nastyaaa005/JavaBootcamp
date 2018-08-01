package sef.ATestTask.SecondActivity;
// Complete Code
import junit.framework.TestCase;
import org.junit.Test;

public class SecondActivityTest extends TestCase {

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
	@Test
	public void testSumPositiveValue() {
		assertEquals(15, (theCalculator.sum(5, 10)));
		assertEquals(15, (theCalculator.sum(10, 5)));
	}

	@Test
	public void testSumNegativeValue() {
		assertEquals(5, (theCalculator.sum(-5, -10)));
		assertEquals(5, (theCalculator.sum(-10, -5)));
	}

	//Example ->
	@Test
	public void testDifPositiveValue() {
		assertEquals(-5, (theCalculator.dif(5, 10)));
		assertEquals(5, (theCalculator.dif(10, 5)));
	}

	@Test
	public void testDifNegativeValue() {
		assertEquals(5, (theCalculator.dif(-5, -10)));
		assertEquals(-5, (theCalculator.dif(-10, -5)));
	}

	@Test
	public void testMultPositiveValue() {
		assertEquals(50, (theCalculator.mult(5, 10)));
		assertEquals(50, (theCalculator.mult(10, 5)));
	}

	@Test
	public void testMultNegativeValue() {
		assertEquals(50, (theCalculator.mult(-5, -10)));
		assertEquals(50, (theCalculator.mult(-10, -5)));
	}


	@Test
	public void testDivPositiveValue() {
		assertEquals(0.5, (theCalculator.div(5, 10)));
		assertEquals(2.0, (theCalculator.div(10, 5)));
	}

	@Test
	public void testDivNegativeValue() {
		assertEquals(0.5, (theCalculator.div(-5, -10)));
		assertEquals(2.0, (theCalculator.div(-10, -5)));
	}


}

