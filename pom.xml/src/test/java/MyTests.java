import org.junit.Test;

import static org.junit.Assert.*;

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
        assertFalse(Checking.direction(("north")));
        assertFalse(Checking.direction(("west")));
    }
    
    @Test
    public void testFalse() {
        assertFalse(Checking.direction(("north")));
        assertFalse(Checking.direction(("west")));
    }

    @Test
    public void testArray() {
        assertEquals(1, Checking.smallest(new int[] {1,2,3,4,5,6,7,8,9}));
        assertEquals(2, Checking.smallest(new int[] {2,3,4,5,6,7,8,9}));
    }

    @Test
    public void testMessage() {
       Object[] list = {"msg", 2, true, false, null, 'd', "xyz"};
       assertEquals("string is at 0", Checking.message(list));
    }

    @Test
    public void testNotFound() {
        Object[] list = {2, true, false, null, 'd', "xyz"};
        assertEquals("string not found", Checking.message(list));
    }

}
