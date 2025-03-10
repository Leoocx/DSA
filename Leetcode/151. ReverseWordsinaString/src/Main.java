public class Main {
    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i=words.length-1; i!=-1; i--){
            sb.append(words[i]);
            if (i!=0){
                sb.append(" ");
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        reverseWords("a good   example");
    }
}