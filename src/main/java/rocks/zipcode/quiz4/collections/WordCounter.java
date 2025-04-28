package rocks.zipcode.quiz4.collections;


import java.util.HashMap;
import java.util.Map;


public class WordCounter {
    public String[] strings;


    public WordCounter(String... strings) {
        this.strings = strings;
    }


    public Map<String, Integer> getWordCountMap() {
        Map<String, Integer> wordCountMap = new HashMap<>();


        for (String str : strings) {
            String[] words = str.split(" ");


            for (String word : words) {
                if (!word.isEmpty()) {
                    wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                }
            }
        }


        return wordCountMap;
    }
}
