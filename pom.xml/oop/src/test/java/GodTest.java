import org.junit.Test;
import practice.God;
import practice.Human;
import practice.Man;

import static org.junit.Assert.assertEquals;

public class GodTest {
    @Test
    public void makingAdam(){
        Human[] paradise = God.create();
        assertEquals("Adam is a man", true ,paradise[0] instanceof Man);
    }
}