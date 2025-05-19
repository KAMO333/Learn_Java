import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharacterCounter {
    public static boolean validateWord(String word) {
        Map<String, Integer> charCount = new HashMap<>();

        String wordToLower = word.toLowerCase();

        for(char wordChar: wordToLower.toCharArray()) {
            String key = String.valueOf(wordChar);
            charCount.put(key, charCount.getOrDefault(key, 0) + 1);
        }

        List<Integer> values = new ArrayList<>(charCount.values());

        Integer first = values.get(0);

        for(int val: values) {
          if(val != first) {
              return false;
          }
        }
        return true;
    }
}
