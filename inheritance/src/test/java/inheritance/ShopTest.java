package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {
    @Test
    public void testShopConstructorAndToString() {
        Shops testShop = new Shops("Target", "A general store where you can find everything", 2);
        assertEquals("toString method is not working", "Target is A general store where you can find everything \n" +
                " It is 2 expensive.", testShop.toString());
    }


}
