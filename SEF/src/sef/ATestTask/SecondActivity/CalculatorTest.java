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
    public void testDivideOnZero(){
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
    public void testDivideZero(){
        assertEquals(0, theCalculator.divide(0, 2));
        assertEquals(0f, theCalculator.divide(0f, 2f));
        assertEquals(0.0, theCalculator.divide(0.0, 2.0));
    }

    @Test
    public void testDivideInt(){
        assertEquals(3, theCalculator.divide(6,2));
    }


    @Test
    public void testDivideFloat(){
        assertEquals(3f, theCalculator.divide(6f,2f));
    }


    @Test
    public void testDivideDouble(){
        assertEquals(3, theCalculator.divide(6,2),0);
    }


    public void testMultiplyInt() {
        assertEquals(10, theCalculator.multiply(2, 5));
    }

    public void testMultiplyFloat() {
        assertEquals(10f, theCalculator.multiply(2f, 5f));
    }

    public void testMultiplyDouble() {
        assertEquals(10.0, theCalculator.multiply(2, 5), 0);
    }

    public void testMultiplyNegative() {
        assertEquals(10, theCalculator.multiply(-2, -5));
    }

    public void testMultiplyNegativePositive() {
        assertEquals(-10, theCalculator.multiply(2, -5));
    }


    public void testSubtractInt() {
        assertEquals(10, theCalculator.subtract(20,10));
    }

    public void testSubtractFloat() {
        assertEquals(10f, theCalculator.subtract(20f,10f));
    }

    public void testSubtractDouble() {
        assertEquals(10.45, theCalculator.subtract(20.0, 9.55), 00);
    }

    public void testSubtractNegatives() {
        assertEquals(-10, theCalculator.subtract(-20,-10));
    }

    public void testSubtractNegativeAndPositive() {
        assertEquals(-30, theCalculator.subtract(-20, 10));
    }

    public void testDegree() {
        assertEquals(1.0, theCalculator.degree(5, 0));
        assertEquals(25.0, theCalculator.degree(5, 2), 0);
    }
}