import org.junit.Test;
import practice.Ghost;

import static org.junit.Assert.assertTrue;

public class TestGhost {
    @Test
    public void testObjectColor() {
        Ghost ghost = new Ghost();
        String color = ghost.getColor();
        assertTrue(
                color.equals("white") ||
                        color.equals("red") ||
                        color.equals("purple") ||
                        color.equals("yellow")
        );
    }
}
