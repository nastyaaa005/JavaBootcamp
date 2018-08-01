package sef.ATestTask.SecondActivity;
// Complete Code
import junit.framework.TestCase;
import org.junit.Test;

public class SecondActivityTest extends TestCase {

	private Calculator theCalculator;

	protected void setUp() throws Exception {
		super.setUp();
		//	Initialize variables to be used here
		//theCalculator = new SecondActivity();
		theCalculator = new Calculator();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}


	@Test
	public void testGetSumPositiveValueInt() {
		assertEquals(15, theCalculator.sum(5, 10));
	}

	@Test
	public void testGetSumPositiveValueLong() {
		assertEquals(15l, theCalculator.sum(5l, 10l));
	}

//	@Test
//	public void testGetSumPositiveValueDouble() {
//		assertEquals(15.0, (theCalculator.sum(5.0, 10.0)));
//	}
//
//	@Test
//	public void testGetSumPositiveValueFloat() {
//		assertEquals(15f, (theCalculator.sum(5f, 10f)));
//	}
//
//
//	@Test
//	public void testGetSumNegativeValueInt() {
//		assertEquals(-15, (theCalculator.sum(-5, -10)));
//	}
//
//	@Test
//	public void testGetSumNegativeValueLong() {
//		assertEquals(-15l, (theCalculator.sum(-5l, -10l)));
//	}
//
//	@Test
//	public void testGetSumNegativeValueDouble() {
//		assertEquals(-15.0, (theCalculator.sum(-5.0, -10.0)));
//	}
//
//	@Test
//	public void testGetSumNegativeValueFloat() {
//		assertEquals(-15f, (theCalculator.sum(-5f, -10f)));
//	}
//
//    @Test
//    public void testGetSumPosNegValueInt() {
//        assertEquals(-5, (theCalculator.sum(5, -10)));
//    }
//
//    @Test
//    public void testGetSumPosNegValueLong() {
//        assertEquals(-5l, (theCalculator.sum(5l, -10l)));
//    }
//
//    @Test
//    public void testGetSumPosNegValueDouble() {
//        assertEquals(-5.0, (theCalculator.sum(5.0, -10.0)));
//    }
//
//    @Test
//    public void testGetSumPosNegValueFloat() {
//        assertEquals(-15f, (theCalculator.sum(5f, -10f)));
//    }


}

