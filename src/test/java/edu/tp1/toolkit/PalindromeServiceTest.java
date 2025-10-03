package edu.tp1.toolkit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests unitaires du service PalindromeService.
 */
public class PalindromeServiceTest {

    private final PalindromeService service = new PalindromeService();

    @Test
    void testPalindromeSimple() {
        assertTrue(service.isPalindrome("kayak"));
    }

    @Test
    void testPalindromeAvecMajusculesEtEspaces() {
        assertTrue(service.isPalindrome("Élu par cette crapule"));
    }

    @Test
    void testPalindromeAvecPonctuation() {
        assertTrue(service.isPalindrome("A man, a plan, a canal: Panama!"));
    }

    @Test
    void testPalindromeVide() {
        assertTrue(service.isPalindrome(""));
    }

    @Test
    void testPalindromeEspacesSeulement() {
        assertTrue(service.isPalindrome("   "));
    }

    @Test
    void testNonPalindrome() {
        assertFalse(service.isPalindrome("bonjour"));
    }

    @Test
    void testPalindromeNull() {
        assertThrows(IllegalArgumentException.class, () -> service.isPalindrome(null));
    }
}