import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyTests {
    @Test
    public void testTwoPlusTwo() {
        assertEquals(4, Checking.addNum(2, 2));
        assertEquals(15, Checking.addNum(5, 10));
    }

    @Test
    public void testBoolean() {
        assertTrue(Checking.direction("left"));
        assertTrue(Checking.direction("right"));
    }
}
