package edu.tp1.toolkit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests unitaires du service WordCounter.
 */
public class WordCounterTest {

    private final WordCounter counter = new WordCounter();

    @Test
    void testCompterMotsSimples() {
        assertEquals(3, counter.count("Bonjour le monde"));
    }

    @Test
    void testCompterAvecTiretsEtUnderscores() {
        assertEquals(3, counter.count("salut-bonjour_hello"));
    }

    @Test
    void testCompterAvecPonctuation() {
        assertEquals(3, counter.count("Salut, toi! Oui."));
    }

    @Test
    void testCompterVide() {
        assertEquals(0, counter.count(""));
    }

    @Test
    void testCompterEspacesMultiples() {
        assertEquals(2, counter.count("  bonjour    toi  "));
    }

    @Test
    void testCompterAvecAccents() {
        assertEquals(2, counter.count("École supérieure"));
    }

    @Test
    void testCompterNull() {
        assertThrows(IllegalArgumentException.class, () -> counter.count(null));
    }

    @Test
    void testCompterUnSeulMot() {
        assertEquals(1, counter.count("bonjour"));
    }

    @Test
    void testCompterAvecTokenVideMilieu() {
        // Deux tirets créent un token vide au milieu
        assertEquals(2, counter.count("mot--mot"));
    }

    @Test
    void testCompterAvecTokenVideFin() {
        // Un token vide à la fin
        assertEquals(2, counter.count("mot mot "));
    }

    @Test
    void testCompterAvecTokenVideDebut() {
        // Un token vide au début
        assertEquals(2, counter.count("  mot mot"));
    }
}