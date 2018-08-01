package sef.module17.sample;
// Complete Code
import junit.framework.TestCase;

public class ProductTests extends TestCase {

    private Product product;

    protected void setUp() throws Exception {
        product = new Product(); //set up inicializē mainīgos
    }

    public void testSetAndGetDescription() {
        String testDescription = "aDescription";
        assertNull(product.getDescription()); //pārbauda vai description ir null
        product.setDescription(testDescription); // pievieno testDescription
        assertEquals(testDescription, product.getDescription()); // salīdzina vai tiesām ir pievienots
    }

    public void testSetAndGetPrice() {
        double testPrice = 100.00;
        assertEquals(0, 0, 0);    // tresais nr-cik vietas aiz komata
        product.setPrice(testPrice);
        assertEquals(testPrice, product.getPrice(), 0);
    }
    public void testToString()
    {
        double price=123.2;
        String description="desc";
        product.setDescription(description);
        product.setPrice(price);
        String name="John";
        product.setName(name);
       // assertEquals("This a bug",description,product.getDescription());

        assertTrue("This a bug",product.toString().contains(""+price)); // ""+double/int/uc pārveido uz string

        assertTrue("This a bug",product.toString().contains(description));

        assertEquals("Name: "+name+" Description: "+description+";Price: "+price,product.toString());;
        //assertTrue nav description messages :( :( :(

    }

public void testGetAndSetNamee(){

        String name="testName";
        // check ka default ir unknown

       // assertEquals("null",product.getName());
       // product.setName(name);
       // assertEquals(name,product.getName());
}

}
