public class Main {

    public static int lengthOfLastWord(String s) {
        int result=0;

        String[] word =s.split(" ");
        String lastWord=word[word.length-1];
        result=lastWord.length();


        return result;
    }
    public static void main(String[] args) {
        lengthOfLastWord("luffy is still joyboy");
    }
}