package sef.ATestTask.SecondActivity;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest extends TestCase {

    //Implementation of the test in CalculatorTest.java
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
        assertEquals(15, (theCalculator.sum(5, 10)));
    }

    @Test
    public void testGetSumPositiveValueLong() {
        assertEquals(15l, (theCalculator.sum(5l, 10l)));
    }

    @Test
    public void testGetSumPositiveValueDouble() {
        assertEquals(15.0, (theCalculator.sum(5.0, 10.0)),0);
    }

    @Test
    public void testGetSumPositiveValueFloat() {
        assertEquals(15f, (theCalculator.sum(5f, 10f)),0);
    }

    @Test
    public void testGetSumNegativeValueInt() {
        assertEquals(-15, (theCalculator.sum(-5, -10)));
    }

    @Test
    public void testGetSumNegativeValueLong() {
        assertEquals(-15l, (theCalculator.sum(-5l, -10l)));
    }

    @Test
    public void testGetSumNegativeValueDouble() {
        assertEquals(-15.0, (theCalculator.sum(-5.0, -10.0)));
    }

    @Test
    public void testGetSumNegativeValueFloat() {
        assertEquals(-15f, (theCalculator.sum(-5f, -10f)));
    }


    @Test
    public void testGetSumPosNegValueInt() {
        assertEquals(-5, (theCalculator.sum(5, -10)));
    }

    @Test
    public void testGetSumPosNegValueLong() {
        assertEquals(-5l, (theCalculator.sum(5l, -10l)));
    }

    @Test
    public void testGetSumPosNegValueDouble() {
        assertEquals(-5.0, (theCalculator.sum(5.0, -10.0)));
    }

    @Test
    public void testGetSumPosNegValueFloat() {
        assertEquals(-5f, (theCalculator.sum(5f, -10f)));
    }

    @Test
    public void testDevideOnZero(){
            try {

                theCalculator.divide(2, 0);
                theCalculator.divide(2.0, 0.0);
                theCalculator.divide(2f, 0f);

            } catch (Exception e) {
                fail();
            }
            catch (Error e) {
                fail();
            }

    }

    @Test
    public void testDevideZero(){
        assertEquals(0, theCalculator.divide(0, 2));
        assertEquals(0f, theCalculator.divide(0f, 2f));
        assertEquals(0.0, theCalculator.divide(0.0, 2.0));
    }
}