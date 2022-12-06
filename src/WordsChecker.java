import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {
    protected String text;
    protected Set<String> words;

    public WordsChecker(String text) {
        this.words = new HashSet<>(List.of(text.split("\\P{IsAlphabetic}+")));
    }

    public boolean hasWord(String word) {
        return words.contains(word);
    }
}