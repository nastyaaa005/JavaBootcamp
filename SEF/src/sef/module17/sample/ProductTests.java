package sef.module17.sample;
// Complete Code
import junit.framework.TestCase;

public class ProductTests extends TestCase {

    private Product product;

    protected void setUp() throws Exception {
        product = new Product();
    }

    public void testSetAndGetDescription() {
        String testDescription = "aDescription";
        assertNull(product.getDescription());
        product.setDescription(testDescription);
        assertEquals(testDescription, product.getDescription());
    }

    public void testSetAndGetPrice() {
        double testPrice = 100.00;
        assertEquals(0, 0, 0);    
        product.setPrice(testPrice);
        assertEquals(testPrice, product.getPrice(), 0);
    }

    public void testToString(){
        double price = 123.2;
        String description = "testDescription";
        String name = "John";

        product.setPrice(price);
        product.setDescription(description);
        product.setName(name);

        assertTrue("Price failed.", product.toString().contains("Price: " + price));
        assertTrue("Description failed.", product.toString().contains("Description: " + description + ";"));
        assertTrue("Name failed.", product.toString().contains("Name: " + name + ";"));

    }

    public void testGetAndSetName(){

        String name = "testName";

        assertEquals("Unknown", product.getName());
        product.setName(name);
        assertEquals(name, product.getName());

    }


}
