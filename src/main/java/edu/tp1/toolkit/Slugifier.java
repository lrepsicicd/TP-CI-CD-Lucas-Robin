package edu.tp1.toolkit;

import java.text.Normalizer;

/**
 * Service de transformation de texte en "slug".
 * Exemple : "Bonjour le Monde !" → "bonjour-le-monde"
 */
public class Slugifier {

    /**
     * Transforme un texte libre en slug :
     * - tout en minuscules
     * - accents retirés
     * - ponctuation supprimée
     * - espaces → '-'
     * - tirets multiples réduits à un seul
     * - tirets en début/fin supprimés
     */
    public String slugify(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input ne doit pas être null");
        }

        // 1. Conversion en minuscules
        String result = input.toLowerCase();

        // 2. Suppression des accents
        result = Normalizer.normalize(result, Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "");

        // 3. Suppression de la ponctuation
        result = result.replaceAll("[^a-z0-9\\s-]", " ");

        // 4. Remplacement des espaces par des tirets
        result = result.replaceAll("[\\s]+", "-");

        // 5. Réduction des tirets multiples
        result = result.replaceAll("-{2,}", "-");

        // 6. Suppression des tirets en début et fin
        result = result.replaceAll("^-|-$", "");

        return result;
    }
}