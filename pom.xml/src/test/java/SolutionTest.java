import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.runners.JUnit4;


public class SolutionTest {
    @Test public void testSomething() {
        assertEquals("8j8mBliB8gimjB8B8jlB", Kata.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        assertEquals("88Bifk8hB8BB8BBBB888chl8BhBfd", Kata.noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        assertEquals("8aaaaaddddr", Kata.noSpace("8aaaaa dddd r     "));
        assertEquals("jfBmgklf8hg88lbe8", Kata.noSpace("jfBm  gk lf8hg  88lbe8 "));
        assertEquals("8jaam", Kata.noSpace("8j aam"));
    }

    @Test
    public void sampleTests() {
        assertEquals("dlrow", Kata.solution("world"));
    }

    @Test public void test4a() {
        assertEquals("aaaa", Solution.repeatStr(4, "a"));
    }
    @Test public void test3Hello() {
        assertEquals("HelloHelloHello", Solution.repeatStr(3, "Hello"));
    }
    @Test public void test5empty() {
        assertEquals("", Solution.repeatStr(5, ""));
    }
    @Test public void test0kata() {
        assertEquals("", Solution.repeatStr(0, "kata"));
    }
    @Test public void test0empty() {
        assertEquals("", Solution.repeatStr(0, ""));
    }
    @Test public void test6I() {
        assertEquals("IIIIII", Solution.repeatStr(6, "I"));
    }
    @Test public void test5Hello() {
        assertEquals("HelloHelloHelloHelloHello", Solution.repeatStr(5, "Hello"));
    }

    @Test
    public void basicTests() {
        assertArrayEquals(new String[]{"Robin", "Singh"}, Solution.stringToArray("Robin Singh"));
        assertArrayEquals(new String[]{"I", "love", "arrays", "they", "are", "my", "favorite"}, Solution.stringToArray("I love arrays they are my favorite"));
    }


}
