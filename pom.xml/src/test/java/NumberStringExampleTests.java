import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NumberStringExampleTests {
    @Test
    public void tests() {
        assertEquals("67", Kata.numberToString(67));
        assertEquals("123", Kata.numberToString(123));
        assertEquals("999", Kata.numberToString(999));
        assertEquals("0", Kata.numberToString(0));
    }
}