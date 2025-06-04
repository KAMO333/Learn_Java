import org.junit.jupiter.api.*;
import practice.Cube;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SolutionTest {
    @Test
    @Order(1)
    @DisplayName("Test default constructor: side should be 0")
    void defaultConstructor() {
        Cube c = new Cube();
        assertEquals(0, c.getSide());
    }

    @Test
    @Order(2)
    @DisplayName("Test default constructor: positive side")
    void constructor_positiveSide() {
        Cube c = new Cube(6);
        assertEquals(6, c.getSide());
    }

    @Test
    @Order(3)
    @DisplayName("Test default constructor: negative side")
    void constructor_negativeSide() {
        Cube c = new Cube(-3);
        assertEquals(3, c.getSide());
    }

    @Test
    @Order(4)
    @DisplayName("Test setter: positive side")
    void setter_positiveSide() {
        Cube c = new Cube();
        c.setSide(3);
        assertEquals(3, c.getSide());
    }

    @Test
    @Order(5)
    @DisplayName("Test setter: zero side")
    void setter_zeroSide() {
        Cube c = new Cube(42);
        c.setSide(0);
        assertEquals(0, c.getSide());
    }

    @Test
    @Order(6)
    @DisplayName("Test setter: negative side")
    void setter_negativeSide() {
        Cube c = new Cube(-42);
        c.setSide(-1337);
        assertEquals(1337, c.getSide());
    }
}