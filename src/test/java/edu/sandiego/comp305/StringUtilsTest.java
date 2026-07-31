package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {

    @Test
    public void testReverseString_basicWord() {
        assertEquals("olleh", StringUtils.reverseString("hello"));
    }

    @Test
    public void testReverseString_emptyString() {
        assertEquals("", StringUtils.reverseString(""));
    }

    @Test
    public void testReverseString_singleCharacter() {
        assertEquals("a", StringUtils.reverseString("a"));
    }

    @Test
    public void testReverseString_palindrome() {
        assertEquals("racecar", StringUtils.reverseString("racecar"));
    }
}
