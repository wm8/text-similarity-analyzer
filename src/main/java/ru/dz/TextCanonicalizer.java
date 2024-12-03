package ru.dz;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TextCanonicalizer {
    // Список слов которые не несут смысловой нагрузки
    private static final Set<String> STOP_WORDS = new HashSet<>(Arrays.asList(
            "и", "в", "на", "с", "для", "как", "по", "это", "но", "так", "же", "а", "то"
    ));

    public static String canonicalize(String text) {
        // Приведение к нижнему регистру
        text = text.toLowerCase();

        // Удаление знаков препинания
        text = text.replaceAll("[^a-zа-я0-9\\s]", "");

        // Удаление стоп-слов
        StringBuilder result = new StringBuilder();
        for (String word : text.split("\\s+")) {
            if (!STOP_WORDS.contains(word)) {
                result.append(word).append(" ");
            }
        }

        return result.toString().trim();
    }

}
