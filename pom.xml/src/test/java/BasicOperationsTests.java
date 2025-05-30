import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;

public class BasicOperationsTests {
    @Test
    public void testBasics() {
        System.out.println("Basic Tests");
        assertThat(BasicOperations.basicMath("+", 4, 7), is(11));
        assertThat(BasicOperations.basicMath("-", 15, 18), is(-3));
        assertThat(BasicOperations.basicMath("*", 5, 5), is(25));
        assertThat(BasicOperations.basicMath("/", 49, 7), is(7));
    }

    @Test
    public void testExample() {
        assertThat(BasicOperations.basicMath("+", 1, 1), is(2));
    }
}
