package edu.tp1.toolkit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests unitaires du service Slugifier.
 */
public class SlugifierTest {

    private final Slugifier slugifier = new Slugifier();

    @Test
    void testSlugifySimple() {
        assertEquals("bonjour-le-monde", slugifier.slugify("Bonjour le monde"));
    }

    @Test
    void testSlugifyAvecPonctuation() {
        assertEquals("bonjour-le-monde", slugifier.slugify("Bonjour, le monde!"));
    }

    @Test
    void testSlugifyAvecAccents() {
        assertEquals("ecole-superieure", slugifier.slugify("École supérieure"));
    }

    @Test
    void testSlugifyEspacesMultiples() {
        assertEquals("salut-toi", slugifier.slugify("  Salut   toi  "));
    }

    @Test
    void testSlugifyMultiTirets() {
        assertEquals("bonjour-le-monde", slugifier.slugify("Bonjour--le----monde"));
    }

    @Test
    void testSlugifyVide() {
        assertEquals("", slugifier.slugify(""));
    }

    @Test
    void testSlugifyNull() {
        assertThrows(IllegalArgumentException.class, () -> slugifier.slugify(null));
    }
}