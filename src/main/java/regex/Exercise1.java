package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise1 {

    /**
     * Take a string that contains letters followed by numbers, separated by space, for instance:
     * "A25 K150 Z228 D4679 J67"
     *  Returns a string that shifts numbers to the front of the letters. For example above,
     *  it should be: 25A 150K 228Z 4679D 67J
     *  Must use Pattern, Matcher, groups.
     * @param s input string
     * @return res result
     */
    public static String moveNumbersToFront(String s) {
        Pattern p = Pattern.compile(" "); // FILL IN regex
        Matcher matcher = p.matcher(s);
        StringBuffer res = new StringBuffer();
        // FILL IN CODE: repeatedly call matcher.find() and append the correct group to res



        return res.toString();
    }

    static void main(String[] args) {
            System.out.println(moveNumbersToFront("A25 K150 Z228 D4679 J67"));
    }

}
