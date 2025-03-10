public class Main {

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result= new StringBuilder();
        int len1 = word1.length();
        int len2 = word2.length();
        int i=0;

        while (i < len1 || i < len2) {
            if (i < len1) result.append(word1.charAt(i));
            if (i < len2) result.append(word2.charAt(i));
            i++;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        mergeAlternately("ab","pqrs");
    }
}