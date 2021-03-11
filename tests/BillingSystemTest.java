import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillingSystemTest {
    @Test
    public void testcalculate() {

        BillingSystem billingSystem = new BillingSystem();

        assertTrue(billingSystem.calculate("jeans", 4) == 3836.8);
        assertTrue(billingSystem.calculate( "top", 7) == 3357.2);
        assertTrue(billingSystem.calculate("jacket", 1) == 970.1 );
        assertTrue(billingSystem.calculate( "dress", 2) == 1199);
    }

}