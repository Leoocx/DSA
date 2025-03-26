import java.util.HashSet;

public class Main {

    public static int firstUniqChar(String s) {
        int[] freq = new int[26];
        for (int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;     //TABELA ASCII a=97, b=98 ....
        }
        for (int i=0; i<s.length();i++){
            if (freq[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));

    }
}
