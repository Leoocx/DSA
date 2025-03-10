import java.util.HashSet;
import java.util.Set;

public class Main {

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int aux=0;
        int result=0;

        for (int i=0; i<s.length(); i++){
            char c=s.charAt(i);

            while(set.contains(c)){
                set.remove(s.charAt(aux));
                aux++;
            }
            set.add(c);
            result = Math.max(result, i-aux+1);
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}