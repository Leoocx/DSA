import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static char findTheDifference(String s, String t) {
        int result=0;
        for (int i=0; i<s.length(); i++) result^=s.charAt(i);
        for (int j=0; j<t.length(); j++) result^=t.charAt(j);
        return (char)result;
    }

    public static void main(String[] args) {
        System.out.println(findTheDifference("a","aa"));
    }
}