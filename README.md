🧰 TP1 – String Toolkit (CI/CD & Qualité de code)
🎯 Objectif

Ce projet implémente trois nouveaux services utilitaires de chaînes de caractères en Java (avec Maven) :

Slugifier – transforme un texte libre en slug (minuscule, sans accents ni ponctuation)

PalindromeService – vérifie si une chaîne est un palindrome (en ignorant la casse, les espaces, la ponctuation et les accents)

WordCounter – compte le nombre de mots dans une chaîne en gérant les séparateurs et les cas particuliers

Les tests unitaires sont réalisés avec JUnit 5, et la couverture de code est mesurée avec JaCoCo.

⚙️ Prérequis

Java 17+

Maven Wrapper (inclus dans le projet, pas besoin d’installation)

🧪 Exécution des tests
🔹 Méthode rapide
mvn test

🔹 Méthode complète avec rapport JaCoCo
.\mvnw.cmd clean verify

📊 Rapport de couverture (JaCoCo)

Après exécution de la commande :

.\mvnw.cmd clean verify


Le rapport HTML est généré ici :

target/site/jacoco/index.html


➡️ Ouvrir ce fichier pour consulter la couverture de code (lignes et branches).

📁 Structure du projet
src/
 ├── main/java/edu/tp1/toolkit/
 │    ├── Slugifier.java
 │    ├── PalindromeService.java
 │    └── WordCounter.java
 └── test/java/edu/tp1/toolkit/
      ├── SlugifierTest.java
      ├── PalindromeServiceTest.java
      └── WordCounterTest.java

👤 Auteur

Lucas Robin – TP CI/CD & Qualité de code (Maven, JUnit 5, JaCoCo)
