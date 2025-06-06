
import org.junit.jupiter.api.Test;
import practice.A;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ATest {
    @Test
    void basicTests() {
        assertEquals(1, A.getNumber());
        assertEquals(2, A.getNumber());
        assertEquals(4, A.getNumber());
        assertEquals(8, A.getNumber());
        assertEquals(16, A.getNumber());
    }
}
