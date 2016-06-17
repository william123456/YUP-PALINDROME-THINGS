import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Lovely Palindromes
 *
 * This recipe tests understanding of string functions by requiring the identification of a palindrome.
 *
 * Creation date: 5/27/2016.
 * Author: Stephen
 *
 * Copyright 2016, The League of Amazing Programmers
 */
public class LovelyPalindromesTest {

    // 1. Test if a word is a palindrome
    @Test
    public void testIsPalindrome() {
        assertTrue(LovelyPalindromes.isPalindrome("racecar"));
        assertFalse(LovelyPalindromes.isPalindrome("firetruck"));
        assertTrue(LovelyPalindromes.isPalindrome("racecar"));
        assertFalse(LovelyPalindromes.isPalindrome(null));
    }

}
