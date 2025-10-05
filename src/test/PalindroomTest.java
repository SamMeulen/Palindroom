package test;

import main.Woord;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
