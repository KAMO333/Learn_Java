import java.util.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@DisplayName("Tests")
class KataTests {
    private void runTest(int[] expected, int[] input) {
        assertArrayEquals(expected, Kata.invert(input), () -> String.format("Input: %s", Arrays.toString(input)));
    }

    @Test
    @DisplayName("Sample Tests")
    void sampleTests() {
        runTest(new int[]{-1, -2, -3, -4, -5}, new int[]{1, 2, 3, 4, 5});
        runTest(new int[]{-1, 2, -3, 4, -5}, new int[]{1, -2, 3, -4, 5});
        runTest(new int[]{1, 2, 3, 4, 5}, new int[]{-1, -2, -3, -4, -5});
        runTest(new int[]{}, new int[]{});
        runTest(new int[]{0}, new int[]{0});
    }

    @Test
    public void countPositivesSumNegatives_BasicTest() {
        int[] expectedResult = new int[] {10, -65};
        assertArrayEquals(expectedResult, Kata.countPositivesSumNegatives(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}));
    }

    @Test
    public void countPositivesSumNegatives_InputWithZeroes() {
        int[] expectedResult = new int[] {8, -50};
        assertArrayEquals(expectedResult, Kata.countPositivesSumNegatives(new int[] {0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}));
    }

    @Test
    public void fixedTests() {
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10}, Kata.countBy(1,10));
        assertArrayEquals(new int[] {2,4,6,8,10}, Kata.countBy(2,5));
        assertArrayEquals(new int[] {3,6,9,12,15,18,21}, Kata.countBy(3,7));
        assertArrayEquals(new int[] {50,100,150,200,250}, Kata.countBy(50,5));
        assertArrayEquals(new int[] {100,200,300,400,500,600}, Kata.countBy(100,6));
    }
}