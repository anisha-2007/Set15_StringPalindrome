package com.lab;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testPalindrome() {
        assertTrue(App.isPalindrome("madam"));
    }

    @Test
    public void testNonPalindrome() {
        assertFalse(App.isPalindrome("hello"));
    }

    @Test
    public void testSingleCharacter() {
        assertTrue(App.isPalindrome("a"));
    }

    @Test
    public void testEmptyString() {
        assertTrue(App.isPalindrome(""));
    }

    @Test
    public void testMixedCase() {
        assertTrue(App.isPalindrome("Madam"));
    }

    @Test
    public void testSpaces() {
        assertTrue(App.isPalindrome("nurses run"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullString() {
        App.isPalindrome(null);
    }
}