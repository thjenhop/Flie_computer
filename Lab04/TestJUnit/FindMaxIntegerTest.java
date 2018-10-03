import org.junit.Test;

import static org.junit.Assert.*;

public class FindMaxIntegerTest {

    @Test
    public void findMaxInteger() {
        assertEquals(13, FindMaxInteger.findMaxInteger(-12, 13));
        assertEquals(0, FindMaxInteger.findMaxInteger(0, -8));
        assertEquals(0, FindMaxInteger.findMaxInteger(0, -1));
        assertEquals(Integer.MAX_VALUE, FindMaxInteger.findMaxInteger(Integer.MAX_VALUE,
                Integer.MIN_VALUE));

        assertEquals(10, FindMaxInteger.findMaxInteger(10 , Integer.MIN_VALUE));
    }
}