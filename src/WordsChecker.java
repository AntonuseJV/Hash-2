import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {

    protected Set<String> set;

    public WordsChecker(String text) {
        this.set = new HashSet<>(List.of(text.split("\\P{IsAlphabetic}+")));
    }

    public boolean hasWord(String word) {
        return set.contains(word);
    }
}