public class Main {
    public static int strStr(String haystack, String needle) {
        int result=-1;
        if (haystack.contains(needle)){
            result=haystack.indexOf(needle);
        }
        return result;
    }

    public static void main(String[] args) {
        strStr("hello","ll");
    }
}