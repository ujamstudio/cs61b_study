import org.apache.hc.core5.annotation.Internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        // TODO: Fill in this function.
        Map<Character, Integer> letterToNum = new TreeMap<>();
        String abc = "abcdefghijklmnopqrstuvwxyz";
            for (int i = 0; i < abc.length(); i++) {
                letterToNum.put(abc.charAt(i), i + 1);
            }
        return letterToNum;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        // TODO: Fill in this function.
        Map<Integer, Integer> squares = new TreeMap<>();
        for (int i =0 ; i<nums.size(); i ++){
            squares.put(nums.get(i), nums.get(i)*nums.get(i));
        }
        return squares;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        // TODO: Fill in this function.
        Map<String, Integer> countWords = new TreeMap<>();
        for (int i = 0; i< words.size();i++)
            if (countWords.containsKey(words.get(i))){
                countWords.put(words.get(i), countWords.get(words.get(i))+1);
            } else{
                countWords.put(words.get(i), 1);
            }
        return countWords;
    }
}
