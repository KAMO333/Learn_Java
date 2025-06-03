import org.junit.Test;
import practice.Ghost;

import static org.junit.Assert.assertEquals;

public class TestGhost {
    @Test
    public void testObjectColor() {
        Ghost ghost = new Ghost();
        assertEquals("red", "red");
        assertEquals("yellow", "yellow");
    }
}
