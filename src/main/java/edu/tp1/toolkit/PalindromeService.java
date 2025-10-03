package edu.tp1.toolkit;

import java.text.Normalizer;

/**
 * Service de vérification de palindromes.
 * Ignore la casse, les espaces, la ponctuation et les accents.
 * Convention : une chaîne vide ou composée uniquement d'espaces est un palindrome.
 */
public class PalindromeService {

    /**
     * Retourne true si la chaîne est un palindrome.
     */
    public boolean isPalindrome(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input ne doit pas être null");
        }

        // Normalisation : minuscules + suppression des accents
        String cleaned = Normalizer.normalize(input.toLowerCase(), Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "");

        // Suppression des caractères non alphanumériques
        cleaned = cleaned.replaceAll("[^a-z0-9]", "");

        // Chaîne vide après nettoyage => palindrome par convention
        if (cleaned.isEmpty()) {
            return true;
        }

        // Comparaison avant / arrière
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
}