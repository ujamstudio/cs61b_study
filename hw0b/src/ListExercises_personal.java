import com.google.common.base.Strings;
import org.apache.hc.core5.annotation.Internal;

import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
    public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
        int total =0;
        for (int i : L){
            total = total + i;
        }
        return total;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        List<Integer> result = new ArrayList<>();
        for (int i : L){
            if (i%2==0){
                result.add(i);
            }
        }

        return result;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        List<Integer> result = new ArrayList<>();
        for (int i1 : L1) {
            for (int i2 : L2){
                if (i1 == i2){
                    result.add(i2);
                }
            }
        }
        return result;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
        int total =0;
        for (String i : words){
            for (int repetition= 0;repetition<i.length();repetition ++)
                if (i.charAt(repetition) == c) {
                total ++ ;
                }
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
