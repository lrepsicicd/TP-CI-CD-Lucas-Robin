package edu.tp1.toolkit;

/**
 * Compteur de mots.
 * Séparateurs : espaces, tabulations, tirets (-), underscores (_).
 * La ponctuation est ignorée, les accents sont considérés comme des lettres.
 */
public class WordCounter {

    /**
     * Compte le nombre de mots dans la chaîne.
     * @param input le texte à analyser
     * @return nombre de mots
     * @throws IllegalArgumentException si input est null
     */
    public int count(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input ne doit pas être null");
        }

        // Nettoyage : suppression de la ponctuation mais conservation des lettres accentuées
        String cleaned = input.replaceAll("[\\p{Punct}]", " ");

        // Découpage sans trim volontaire pour conserver les tokens vides en début/fin
        String[] tokens = cleaned.split("[\\s\\-_]");

        int count = 0;
        for (String t : tokens) {
            if (!t.isBlank()) {
                count++;
            }
        }

        return count;
    }
}