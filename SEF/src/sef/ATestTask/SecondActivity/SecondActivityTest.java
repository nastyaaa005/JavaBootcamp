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
	public void testGetAddPositiveValue() {
		assertEquals(71, (theCalculator.getAdd(66, 5)));
		assertEquals(71, (theCalculator.getAdd(5, 66)));
	}

	//Example ->
	@Test
	public void testGetAddNegativeValue() {
		assertEquals(-61, (theCalculator.getAdd(-66, 5)));
		assertEquals(61, (theCalculator.getAdd(66, -5)));
	}

	@Test
	public void testGetSubPositiveValue(){
		assertEquals(61, (theCalculator.getSub(66,5)));
		assertEquals(-61, (theCalculator.getSub(5,66)));
	}

	@Test
	public void testGetSubNegativeValue(){
		assertEquals(-71, (theCalculator.getSub(-66,5)));
		assertEquals(71, (theCalculator.getSub(5,-66)));
	}

	@Test
	public void testGetMultPositiveValue(){
		assertEquals(330, (theCalculator.getMult(66,5)));
		assertEquals(330, (theCalculator.getMult(5,66)));
	}

	@Test
	public void testGetMultNegativeValue(){
		assertEquals(-330, (theCalculator.getMult(-66,5)));
		assertEquals(-330, (theCalculator.getMult(-5,66)));
	}

	@Test
	public void testGetDivPositiveValue(){
		assertEquals(13.2, (theCalculator.getDiv(66,5)));
		assertEquals(2.5, (theCalculator.getDiv(5,2)));
	}

	@Test
	public void testGetDivNegativeValue(){
		assertEquals(-13.2, (theCalculator.getDiv(-66,5)));
		assertEquals(-1.0, (theCalculator.getDiv(-5,5)));
	}

}

