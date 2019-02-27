package main;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PalindroomTest {
	
	@Test
	public void palindroomIsGeen() {
		assertFalse(new Woord("hallo").isPalindroom());
	}
	@Test
	public void palindroomIs101() {
		assertTrue(new Woord("101").isPalindroom());
	}
	@Test
	public void palindroomIs1012() {
		assertFalse(new Woord("1012").isPalindroom());
	}
	@Test
	public void palindroomIsHoofdletter() {
		assertTrue(new Woord("Lepel").isPalindroom());
	}
	@Test
	public void palindroomIsKleineletter() {
		assertTrue(new Woord("lol").isPalindroom());
	}

}
