package ca.jrvs.challenge.string;

public class ReverseWords {

    /** Reverses words in a given String
     * Assumes the words are separated by spaces
     * If words are separated by multiple spaces the
     * result will reduce them to a single space
     */
    public static String solution(String s) {
        String result = "";

        String[] words = s.split(" ");
        for(int i = words.length-1; i >= 0; i--) {
            if (!words[i].equals("")) {
                result += words[i];
                result += " ";
            }
        }
        result = result.substring(0,result.length()-1);
        return result;
    }
}
