package sef.ATestTask.SecondActivity;
// Complete Code

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SecondActivityTest {

    private SecondActivity theCalculator;

    protected void setUp() throws Exception {
        //super.setUp();
        //	Initialize variables to be used here
        theCalculator = new SecondActivity();
    }

    protected void tearDown() throws Exception {
        //super.tearDown();
    }

    //Example ->
    //@Test
    //public void testGetSumPositiveValue() {
    //assertEquals(15, (theCalculator.getSum(5, 10)));
    //assertEquals(15, (theCalculator.getSum(10, 5)));
    //}

    //Example ->
    //@Test
    //public void testGetSumNegativeValue() {
    //assertEquals(5, (theCalculator.getSum(-5, 10)));
    //assertEquals(-5, (theCalculator.getSum(5, -10)));
    //}
    @Test
    public void sum() {
        assertEquals(5, (theCalculator.sum(2, 3)));
        assertEquals(5, (theCalculator.sum(3, 2)));
    }

    @Test
    public void min() {
        assertEquals(-166, (theCalculator.minus(-100, 66)));
        assertEquals(-44, (theCalculator.minus(66, -100)));
    }

    @Test
    public void multi() {
        assertEquals(25.5, (theCalculator.multi(10.2, 2.5)),0);
        assertEquals(25.5, (theCalculator.multi(2.5, 10.2)),0);
    }

    @Test
    public void devide() {
        assertEquals(-50, (theCalculator.devide(-100, 2)),0);
        assertEquals(-0.02, (theCalculator.devide(2, -100)),0);
    }


}

