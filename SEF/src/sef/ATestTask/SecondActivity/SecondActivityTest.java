package sef.ATestTask.SecondActivity;
// Complete Code
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SecondActivityTest {

    private SecondActivity calc;

    @Before
    public void setUp() throws Exception {
        //	Initialize variables to be used here
        calc = new SecondActivity();
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void testGetSumPositiveValue() {
        Assert.assertEquals(11, (calc.add(4, 7)));
        Assert.assertEquals(11, (calc.add(7, 4)));

    }


    @Test
    public void testGetSumNegativeValue() {
        Assert.assertEquals(11, (calc.add(-4, 7)));
        Assert.assertEquals(-11, (calc.add(4, -7)));
    }

    @Test
    public void testGetMultiplicationOneNegativeValue() {
        Assert.assertEquals(-28, (calc.multiply(-4, 7)));
        Assert.assertEquals(-28, (calc.multiply(4, -7)));
    }

    @Test
    public void testGetMultiplicationNegativeValue() {
        Assert.assertEquals(28, (calc.multiply(-4, -7)));
        Assert.assertEquals(28, (calc.multiply(-7, -4)));
    }

    @Test
    public void testGetMultiplicationPositiveValue() {
        Assert.assertEquals(28, (calc.multiply(4, 7)));
        Assert.assertEquals(28, (calc.multiply(7, 4)));
    }

    @Test
    public void testGetDivisionNegativeValue() {
        Assert.assertEquals(0.5, (calc.divide(-4, -7)));
        Assert.assertEquals(1.75, (calc.divide(-7, -4)));
    }

    @Test
    public void testGetDivisionOneNegativeValue() {
        Assert.assertEquals(-0.5, (calc.divide(-4, 7)));
        Assert.assertEquals(-1.75, (calc.divide(4, -7)));
    }

    @Test
    public void testGetDivisionPositiveValue() {
        Assert.assertEquals(0.5, (calc.divide(4, 7)));
        Assert.assertEquals(1.75, (calc.divide(7, 4)));
    }

    @Test
    public void testGetSubtractionOneNegativeValue() {
        Assert.assertEquals(-11, (calc.subtract(-4, 7)));
        Assert.assertEquals(11, (calc.subtract(7, -4)));
    }

    @Test
    public void testGetSubtractionPositiveValue() {
        Assert.assertEquals(-3, (calc.subtract(4, 7)));
        Assert.assertEquals(3, (calc.subtract(7, 4)));
    }

    @Test
    public void testGetSubtractionNegativeValue() {
        Assert.assertEquals(3, (calc.subtract(-4, -7)));
        Assert.assertEquals(3, (calc.subtract(-7, -4)));

    }
}

