package com.beaufort;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class PalindromeTest {

	private Palindrome palindrome;

	@Before
	public void setUp(){
		palindrome = new Palindrome();
	}

	@Test
	public void testSimplePalinedrome() {
		assertTrue(palindrome.isPalindrome("a"));
	}

	@Test
	public void test_aa() {
		assertTrue(palindrome.isPalindrome("aa"));
	}

	@Test
	public void test_11() {
		assertTrue(palindrome.isPalindrome("11"));
	}

	@Test
	public void test_bab() {
		assertTrue(palindrome.isPalindrome("bab"));
	}

	@Test
	public void test_ba() {
		assertFalse(palindrome.isPalindrome("ba"));
	}

}
