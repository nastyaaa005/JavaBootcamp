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
	public void testGetSumPositiveValue() {
		int a=5;
		int b=10;
		assertEquals(15, (theCalculator.sum(5, 10)));
		assertEquals(15, (theCalculator.sum(10, 5)));
	}

	//Example ->
	@Test
	public void testGetSumNegativeValue() {
		assertEquals(5, (theCalculator.sum(-5, 10)));
		assertEquals(-5, (theCalculator.sum(5, -10)));
	}
	public void testGetMul() {

		int a = 5;
		int b = 4;

		assertEquals(20, (theCalculator.mul(a,b)),0);
		assertEquals(20, (theCalculator.mul(b,a)),0);

		a = -2;
		b = 10;

		assertEquals(-20, (theCalculator.mul(a,b)),0);
		assertEquals(-20, (theCalculator.mul(b,a)),0);

		a = -4;
		b = -10;

		assertEquals(40, (theCalculator.mul(a,b)),0);
		assertEquals(40, (theCalculator.mul(b,a)),0);
	}
	public void testGetQuotient() {

		double a = 25;	double b = 5;

		assertEquals(5, (theCalculator.div(a,b)),0);

		assertEquals(0.2, (theCalculator.div(b,a)),0);

		a = 12;	b = -6;

		assertEquals(-2, (theCalculator.div(a,b)),0);

		assertEquals(-0.5, (theCalculator.div(b,a)),0.007);

		a = -15;	b = -3;

		assertEquals(5, (theCalculator.div(a,b)),0);

		assertEquals(0.2, (theCalculator.div(b,a)),0);
	}

}

