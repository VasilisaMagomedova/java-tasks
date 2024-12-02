import java.util.*;

public class CollectionWordsFrequency {
//    Напишите метод, который принимает список строк List<String> и возвращает карту Map<String, Integer>,
//    где ключом является слово, а значением — количество его вхождений в список
    public static Map<String, Integer> showWordsFrequency (List<String> listOfWords) {
        Map<String, Integer> resultMap = new HashMap<>();
        for (String word: listOfWords) {
            if (resultMap.containsKey(word)) {
                resultMap.put(word, resultMap.get(word) + 1);
            } else {
                resultMap.put(word, 1);
            }
        }
        return resultMap;
    }
}
