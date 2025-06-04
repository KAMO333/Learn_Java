import org.junit.Test;
import static org.junit.Assert.assertEquals;
import practice.Cube;


public class SolutionTest {
    @Test
    public void testSetToThree() {
        Cube c = new Cube();
        c.setSides(3);
        assertEquals(3, c.getSides());
    }
}